package com.arfront.designpattern.principle.openclose;


public class Test {
    public static void main(String[] args) {
        IGoods iGoods = new LaptopDiscount(96, "Thinkpad x1", 8000d);
        LaptopDiscount laptop = (LaptopDiscount) iGoods;
        System.out.println("笔记本ID:" + laptop.getId() + " 笔记本品类:" + laptop.getName() + " 笔记本原价:" + laptop.getPrice() + " 笔记本折后价:" + laptop.getDiscountPrice() + "元");


    }
}
