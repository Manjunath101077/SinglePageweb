package com.project.Singlewebapp.services;

import com.project.Singlewebapp.model.Prodduct;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productServices {

    List<Prodduct> products= Arrays.asList(new Prodduct(101,"PAN",56));

    public List<Prodduct> getAllproducts(){
        return products;
    }
}
