package com.Elliotts.Elliotts.services;

import com.Elliotts.Elliotts.domain.Products;

/**
 * Created by Jerry on 8/10/2017.
 */
public interface ProductService {

    Products getProductById(Integer id);

    Products saveProduct(Products product);
}
