package com.solt.jdc.affablebeantest.service;

import com.solt.jdc.affablebeantest.domain.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> findAll();
    Product findById(int id);
    List<Product> findByCategory(String name);
}
