package com.Elliotts.Elliotts.repositories;

import com.Elliotts.Elliotts.domain.Products;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jerry on 8/10/2017.
 */
public interface ProductRepository extends CrudRepository<Products, Integer> {
}
