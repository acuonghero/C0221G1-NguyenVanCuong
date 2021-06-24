package com.codegym.controller;


import com.codegym.model.entity.Category;
import com.codegym.model.entity.Product;
import com.codegym.model.service.ICategoryService;
import com.codegym.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Optional;

@RequestMapping(value = "/product")
@Controller
public class ProductController {
    @Autowired
    IProductService productService;
    @Autowired
    ICategoryService categoryService;

    @GetMapping(value = "/")
    public String showProduct (Model model, @PageableDefault(value = 2) Pageable pageable){
        Iterable<Category> categories = categoryService.findAll();
        Page<Product> productPage = productService.findAll(pageable);
        model.addAttribute("product",productPage);
        model.addAttribute("category",categories);
        return "product/list";
    }
    @GetMapping(value = "/create")
    public String showCreateForm (Model model){
        Iterable<Category> categories =categoryService.findAll();
        model.addAttribute("category",categories);
        model.addAttribute("product",new Product());

        return "product/create";
    }
    @PostMapping(value = "/create")
    public String create(@ModelAttribute Product product, Model model){
        productService.save(product);
        model.addAttribute("mes","New create successfully");
        return "product/create";
    }
    @GetMapping(value = "/edit/{id}")
    public String showEditForm(Model model, @PathVariable Long id){

        Optional<Product> optionalProduct = productService.findById(id);
        model.addAttribute("product",optionalProduct);
        return "product/edit";
    }
    @PostMapping(value = "/update")
    public ModelAndView update(@ModelAttribute Product product){
        productService.save(product);
        return new ModelAndView("product/edit","mes","Edit successfully");
    }
    @GetMapping(value = "/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        return new ModelAndView("product/delete","product", productService.findById(id));
    }
//    @PostMapping(value = "/delete")
//    public String delete(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes){
//        productService.remove(blog.getId());
//        redirectAttributes.addFlashAttribute("mes","Delete successfully");
//        return "redirect:/product";
//    }
//    @GetMapping("/search")
//    public ModelAndView search(@RequestParam("search") Optional<String> searchs,@PageableDefault(value = 2) Pageable pageable){
//        Page<Blog> blogPage;
//        if(searchs.isPresent()){
//            blogPage = productService.findAllByNameContaining(searchs.get(),pageable);
//        } else {
//            blogPage = productService.findAll(pageable);
//        }
//        ModelAndView modelAndView = new ModelAndView("/form");
//        modelAndView.addObject("blog", blogPage);
//        return modelAndView;
//    }

}
