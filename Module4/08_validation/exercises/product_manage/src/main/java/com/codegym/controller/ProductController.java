package com.codegym.controller;

import com.codegym.model.dto.ProductDto;

import com.codegym.model.entity.Product;
import com.codegym.model.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping(value = "/")
    public String showList(@RequestParam("search")Optional<String> search,@RequestParam("page") Optional<Integer> page, Model model){
        Pageable pageable = PageRequest.of(page.orElse(0),2,Sort.by("name"));
        Page<Product> products = productService.findByNameAndDescribe(search.orElse(""), pageable);
        model.addAttribute("product",products);
        return "index";
    }

    @GetMapping(value = "/create")
    public String showCrateForm(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "create";
    }

    @PostMapping(value = "/create-product")
    public String createProduct(@ModelAttribute @Valid ProductDto productDto, BindingResult bindingResult,
                                Model model) {
        new ProductDto().validate(productDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "create";
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        productService.save(product);
        model.addAttribute("msg", "Create Successfully");
        return "create";
    }
}
