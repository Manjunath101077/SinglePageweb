package com.project.Singlewebapp.services;

import com.project.Singlewebapp.Repositary.ProductRepo;
import com.project.Singlewebapp.model.Prodduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productServices {

    @Autowired
    ProductRepo prdrepo;
//    List<Prodduct> products= new ArrayList<>(Arrays.asList(new Prodduct(101,"PAN",56),
//            new Prodduct(102,"Manju",57),
//            new Prodduct(103,"RAM",58)));

    public List<Prodduct> getProducts(){
        return prdrepo.findAll();

//        return products;
    }

    public Prodduct getProductByid(int prodid) {
        return prdrepo.findById(prodid).orElse(new Prodduct());
//                products.stream()
//                .filter(p -> p.getProdId() == prodid)
//                .findFirst().orElse(new Prodduct(500,"ppp",999));
    }

    public void addProducts( Prodduct prod)
    {
//        products.add(prod);
        prdrepo.save(prod);
    }

    public void updateProduct(Prodduct prod) {
//        int indexx=0;
//        for(int  i=0;i<products.size();i++) {
//            if (products.get(i).getProdId() == prod.getProdId())
//                indexx = i;
//        }
//
//            products.set(indexx,prod);
//
    prdrepo.save(prod);
    }

    public void deleteProduct(int productid) {
//        int indexx=0;
//        for(int  i=0;i<products.size();i++) {
//            if (products.get(i).getProdId() == productid)
//                indexx = i;
//        }
//
//        products.remove(indexx);
    prdrepo.deleteById(productid);
    }
}
