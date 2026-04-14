package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/add")
    public String addproduct(@RequestBody product prod){
        return service.addproduct(prod);
    }
    @PutMapping("/update")
    public String Update(@RequestBody product prod){
        service.updateproduct(prod);
        return "update sucessful";
    }
    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable int id){
        service.deleteproduct(id);
    }
}
