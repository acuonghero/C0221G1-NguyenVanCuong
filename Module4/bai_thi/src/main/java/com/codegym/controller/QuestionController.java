package com.codegym.controller;

import com.codegym.model.dto.QuestionDto;
import com.codegym.model.entity.Question;
import com.codegym.model.entity.QuestionType;
import com.codegym.model.service.IQuestionTypeService;
import com.codegym.model.service.IQuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/question")
public class QuestionController {

    @Autowired
    IQuestionService questionService;
    @Autowired
    IQuestionTypeService questionTypeService;
    @ModelAttribute("questionType")
    List<QuestionType> showQuestionType(){
       return questionTypeService.findAll();
    }

    @GetMapping(value = {"/","/list"})
    public String showList(@RequestParam Optional<String> name,
             Model model, Pageable pageable){
        Page<Question> questionPage = questionService.searchProduct(name.orElse(""),pageable);
        model.addAttribute("question",questionPage);
        model.addAttribute("name",name.orElse(""));
        return "/list";
    }
    @GetMapping(value = "/create")
    public ModelAndView showCreateForm(){
      ModelAndView modelAndView = new ModelAndView("/create");
      modelAndView.addObject("questionDto",new QuestionDto());
      return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView addProduct(@ModelAttribute @Valid QuestionDto questionDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("/create");
        }
        Question question = new Question();
        BeanUtils.copyProperties(questionDto,question);
        questionService.save(question);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("questionDto", questionDto);
        modelAndView.addObject("msg", "New question created successfully");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Question> question = questionService.findById(id);

            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("question", question);
            return modelAndView;
    }
//
//    @PostMapping("/update")
//    public ModelAndView updateCustomer(@Valid @ModelAttribute ProductDto productDto, BindingResult bindingResult) {
//        if(bindingResult.hasErrors()){
//            return new ModelAndView("/edit");
//        }
//        Product product = new Product();
//        BeanUtils.copyProperties(productDto,product);
//        productService.save(product);
//        return new ModelAndView("/edit","msg","Update customer successfully");
//    }
//
    @PostMapping("/delete")
    public String deleteProduct(@RequestParam Long id, RedirectAttributes redirectAttributes) {
        Optional<Question> question = questionService.findById(id);
        if(question.get()==null){
            return "/error.404";
        }
        question.get().setFlag(false);
        questionService.save(question.get());
        redirectAttributes.addFlashAttribute("msg","Delete successfully");
        return "redirect:/question/";
    }

}
