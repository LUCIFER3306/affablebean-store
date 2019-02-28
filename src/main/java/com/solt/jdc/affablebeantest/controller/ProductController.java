package com.solt.jdc.affablebeantest.controller;

import com.solt.jdc.affablebeantest.domain.Product;
import com.solt.jdc.affablebeantest.service.CategoryService;
import com.solt.jdc.affablebeantest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/product/creation")
    public String create(Model model){
        model.addAttribute("product",new Product());
        model.addAttribute("categories",categoryService.findAll());
        return "productForm";
    }
    @PostMapping("/product/creation")
    public String process(@Valid Product product, BindingResult result){
        if (result.hasErrors()){
            return "productForm";
        }
        productService.create(product);
        return "redirect:/products";
    }
    @GetMapping("/products")
    public String showAllProduct(Model model){
        model.addAttribute("products",productService.findAll());
        return "products";
    }
    @GetMapping("/products/category/{name}")
    public String findByCategoryName(@PathVariable("name")String name, Model model){
        model.addAttribute("products",productService.findByCategory(name));
        System.out.println(name);
        System.out.println(productService.findByCategory(name));
//        categoryName=name;
        return "products";
    }


    private String categoryName;
}
