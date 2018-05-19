package com.mackittipat.resourceserver.controller;

import com.mackittipat.resourceserver.model.ProductModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductModel> getAllProducts() {
        List<ProductModel> productModelList = Arrays.asList(
                new ProductModel(1, "Watch", 999.00F),
                new ProductModel(2, "Bag", 199.00F),
                new ProductModel(3, "T-Shirt", 99.00F),
                new ProductModel(3, "Movie Ticket", 50.00F)
        );
        return productModelList;
    }

}
