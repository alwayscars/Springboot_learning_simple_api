package com.jvlcode.vikcart.controllers;


import com.jvlcode.vikcart.models.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jvlcode.vikcart.service.productService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class Productcontroller {
    @Autowired
    private productService productService;

    @GetMapping
    public List<product> getAllProducts(){
           return productService.getAllProducts();
    }
    @GetMapping("/categories")
    public List<Map<String,Object>> getCategoryProducts(){
        return Arrays.asList(
                Map.of("name","Product 1","price",234),
                Map.of("name","Product 2","price",123)
        );
    }
}
