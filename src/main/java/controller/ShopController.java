package com.fitness.ecommerce.controller;

import com.fitness.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.findAll());
        return "shop/index";
    }

    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin/dashboard";
    }
}