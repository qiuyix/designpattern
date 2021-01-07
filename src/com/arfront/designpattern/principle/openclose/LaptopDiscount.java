package com.arfront.designpattern.principle.openclose;


public class LaptopDiscount extends Laptop {

    public LaptopDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
