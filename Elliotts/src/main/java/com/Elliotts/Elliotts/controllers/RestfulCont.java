package com.Elliotts.Elliotts.controllers;

import com.Elliotts.Elliotts.domain.Products;
import com.Elliotts.Elliotts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jerry on 8/10/2017.
 */

//Rest Controller.  These methods interact with the database.
@RestController
public class RestfulCont {

    @Autowired
    ProductService productService;

    //gets JSON data back when passed an id at this url
    @RequestMapping(value = "api/products/{id}", method = RequestMethod.GET)
    public Products getInquiries(@PathVariable int id) {

        //returns the requested data from the database
        return productService.getProductById(id);
    }

    //posts data when sent to this url
    @RequestMapping(value = "/api/products", method = RequestMethod.POST)
    public void InquirySave(@RequestBody Products products){

        //This just saves it to the database for now.  Later it should refresh to display the updated product
        //on the product page.
        productService.saveProduct(products);
    }
}
