package com.example.service;
import com.example.model.product;

import java.util.*;

import org.springframework.stereotype.Component;
@Component
public class productservice {
     List<product> products=new ArrayList<>();
     public productservice() {
        products.add(new product(101, "fan", 1000));
        products.add(new product(103, "tv", 300));
    }
     
    public List<product> getproducts(){
         return products;
    }
    public product getproductbyid(int id){
        for(product p:products){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
    public String addproduct(product prod){
        products.add(prod);
        return "product added sucessfully";
    }
    public String updateproduct(product prod){
        for(product p:products){
            if(p.getId()==prod.getId()){
                p.setName(prod.getName());
                return "update sucessfull";
            }
        }
        return "product not found";
    }

    public String deleteproduct(int id) {
        for(product p:products){
            if(p.getId()==id){
                products.remove(p);
                return "deletion sucess";
            }
        }
        return "item not found";
       
    }
}
