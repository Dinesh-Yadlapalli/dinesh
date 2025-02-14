package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.Product;

import com.klef.jfsd.exam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



@RestController
public class ProductController {
	

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.fetchAllProducts();
    }
    
    @RestController
    public class MyController {
        
        @GetMapping("/")
        public String home() {
            return "Welcome to Spring Boot!";
        }
    }

}
