package com.Elliotts.Elliotts.seedData;

import com.Elliotts.Elliotts.domain.Products;
import com.Elliotts.Elliotts.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Jerry on 8/10/2017.
 */
//This fills the database(Ex. localhost:8080/console) with test data.
@Component
public class seedData implements ApplicationListener<ContextRefreshedEvent> {

    //Bringing in the productService for access to the productRepository.
    @Autowired
    ProductService productService;

    //This calls to the GenerateProducts method below.
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        GenerateProducts();
    }

    //This simply creates three objects and then saves the objects to the database. Used for testing.
    private void GenerateProducts() {
        Products product1 = new Products("Hot Dogs", "0-BH54234-001");
        Products product2 = new Products("Hamburgers", "0-BH67483-001");
        Products product3 = new Products("Bacon", "0-ZHQ12343-001");

        productService.saveProduct(product1);
        productService.saveProduct(product2);
        productService.saveProduct(product3);
    }
}
