package com.solt.jdc.affablebeantest.service;

import com.solt.jdc.affablebeantest.domain.Product;
import com.solt.jdc.affablebeantest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> findByCategory(String name) {
        System.out.println(productRepository.findProductByCategoryName(name));
        return productRepository.findProductByCategoryName(name);
    }
}
