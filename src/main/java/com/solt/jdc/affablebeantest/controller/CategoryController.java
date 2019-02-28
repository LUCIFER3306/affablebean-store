package com.solt.jdc.affablebeantest.controller;

import com.solt.jdc.affablebeantest.domain.Category;
import com.solt.jdc.affablebeantest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/category/creation")
    public String create(Model model){
        model.addAttribute("category",new Category());
        return "categoryForm";
    }
    @PostMapping("/category/creation")
    public String process(Category category, BindingResult result){
        if(result.hasErrors()){
            return "categoryForm";
        }
        categoryService.create(category);
        return "redirect:/categorys";
    }
    @GetMapping("/categorys")
    public String showAll(Model model){
        model.addAttribute("categorys",categoryService.findAll());
        return "categorys";
    }
}
