package com.github.youssfbr.api.controllers;

import com.github.youssfbr.api.entities.Department;
import com.github.youssfbr.api.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {

        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");

        Product p1 = new Product(1L, "Macbook Pro" , 4000.0 , d1);
        Product p2 = new Product(2L, "PC Gamer" , 5000.0 , d1);
        Product p3 = new Product(3L, "Pet House" , 300.0 , d2);

        return Arrays.asList(p1, p2, p3);
    }
}
