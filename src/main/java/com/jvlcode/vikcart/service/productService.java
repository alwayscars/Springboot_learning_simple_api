package com.jvlcode.vikcart.service;

import com.jvlcode.vikcart.models.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jvlcode.vikcart.reposotories.ProductReposotories;

import java.util.List;

@Service
public class productService {
    @Autowired
    private ProductReposotories productReposotories;

    public List<product> getAllProducts(){
        return productReposotories.findAll();

    }
}
