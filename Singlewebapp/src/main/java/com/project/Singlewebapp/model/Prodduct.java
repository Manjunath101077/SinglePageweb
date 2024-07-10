package com.project.Singlewebapp.model;

import lombok.Data;

@Data
public class Prodduct {
    private int prodId;
    private String prodName;
    private int price;

    public Prodduct(int i, String pan, int i1) {
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
