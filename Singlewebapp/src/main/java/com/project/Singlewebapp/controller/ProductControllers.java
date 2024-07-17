package com.project.Singlewebapp.controller;

import com.project.Singlewebapp.model.Prodduct;
import com.project.Singlewebapp.services.productServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllers {

    @Autowired
    productServices produstservice;

    @GetMapping("/Product")
    public List<Prodduct> getProdustcdetails(){
        return produstservice.getProducts();
    }
    @GetMapping("/Product2")
    public String hello(){
        return "hello";
    }
    @GetMapping("/Product/{prodid}")
    public Prodduct getProductByID(@PathVariable int prodid){
        return produstservice.getProductByid(prodid);
    }

    @PostMapping("/Product")
    public void addProduct(@RequestBody Prodduct prod){
        produstservice.addProducts(prod);

    }
@PutMapping("/Products")
    public void updateProducts(@RequestBody Prodduct prod){
        produstservice.updateProduct(prod);
    }
    @DeleteMapping("/Products/{productid}")
    public void deleteProducts(@PathVariable int productid){
        produstservice.deleteProduct(productid);
    }
}
