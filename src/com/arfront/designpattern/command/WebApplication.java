package com.arfront.designpattern.command;

public class WebApplication {

    private String name;

    public WebApplication(String name) {
        this.name = name;
    }

    public void h5() {
        System.out.println(this.name + "要开始做h5页面了");
    }

    public void miniProgram() {
        System.out.println(this.name + "要开始做小程序了");
    }

}


