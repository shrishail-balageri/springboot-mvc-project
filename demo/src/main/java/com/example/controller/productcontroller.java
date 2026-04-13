package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.product;
import java.util.*;
import com.example.service.productservice;
@RestController
public class productcontroller {
    @Autowired
    productservice service;
    @RequestMapping("/products")
    public List<product> items(){
        return service.getproducts();
    }
    @RequestMapping("/products/{id}")
    public product getproductbyid(@PathVariable int id){
        return service.getproductbyid(id);
    }
    
}
