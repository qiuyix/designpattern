package com.arfront.designpattern.principle.openclose;


public class Laptop implements IGoods {
    private Integer Id;
    private String name;
    private Double price;

    public Laptop(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

}
