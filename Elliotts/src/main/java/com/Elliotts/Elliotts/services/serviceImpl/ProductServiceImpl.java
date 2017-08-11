package com.Elliotts.Elliotts.services.serviceImpl;

import com.Elliotts.Elliotts.domain.Products;
import com.Elliotts.Elliotts.repositories.ProductRepository;
import com.Elliotts.Elliotts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jerry on 8/10/2017.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Products getProductById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Products saveProduct(Products product) {
        return productRepository.save(product);
    }
}
