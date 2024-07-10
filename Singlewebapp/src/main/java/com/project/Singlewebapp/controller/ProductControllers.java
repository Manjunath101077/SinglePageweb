package com.project.Singlewebapp.controller;

import com.project.Singlewebapp.model.Prodduct;
import com.project.Singlewebapp.services.productServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductControllers {

    @Autowired
    productServices produstservice;

    @RequestMapping("/Product")
    public List<Prodduct> getProdustcdetails(){
        return produstservice.getAllproducts();
    }
    @RequestMapping("/Product2")
    public String hello(){
        return "hello";
    }
}
