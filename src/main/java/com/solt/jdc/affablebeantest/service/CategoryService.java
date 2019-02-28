package com.solt.jdc.affablebeantest.service;

import com.solt.jdc.affablebeantest.domain.Category;

import java.util.List;

public interface CategoryService {
    Category create(Category category);
    List<Category> findAll();
    Category findById(int id);
}
