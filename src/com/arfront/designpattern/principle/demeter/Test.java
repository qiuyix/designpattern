package com.arfront.designpattern.principle.demeter;


public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Manager manager = new Manager();
        boss.commandCheckNumber(manager);

    }
}
