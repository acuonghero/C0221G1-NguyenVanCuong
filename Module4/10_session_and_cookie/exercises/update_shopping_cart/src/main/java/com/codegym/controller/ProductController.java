package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;


    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart, Model model) {
        Product productOptional = productService.findById(id).get();
        if (productOptional == null ) {
            return "error.404";
        }
        cart.addProduct(productOptional);
        model.addAttribute("msg", "Đã thêm sản phẩm vào giỏ hàng!!!");
        model.addAttribute("product",productOptional);
        return "view";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable Long id, @ModelAttribute Cart cart,
                              Model model) {
        Product productOptional = productService.findById(id).get();
        if (productOptional == null ) {
            return "error.404";
        }
        model.addAttribute("product",productOptional);
        return "view";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id, @ModelAttribute Cart cart){
        Product product = productService.findById(id).get();
        if (product == null ) {
            return "error.404";
        }
        cart.removeProduct(product);
        return "redirect:/shopping-cart";
    }

    @GetMapping("/change/{id}")
    public String changeCountProduct(@PathVariable Long id,
                                     @ModelAttribute Cart cart,
                                     @RequestParam("action") String action){
        Product product = productService.findById(id).get();
        if (product == null ) {
            return "error.404";
        }
        cart.changeCount(product,action);
        return "redirect:/shopping-cart";
    }
}