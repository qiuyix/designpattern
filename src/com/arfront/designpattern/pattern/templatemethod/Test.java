package com.arfront.designpattern.pattern.templatemethod;


public class Test {
    public static void main(String[] args) {
        SelfCard selfCard = new SelfCard();
        selfCard.show();

        System.out.println();

        OtherCard otherCard = new OtherCard();
        otherCard.show();


    }
}
