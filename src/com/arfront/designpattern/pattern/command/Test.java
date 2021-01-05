package com.arfront.designpattern.pattern.command;

public class Test {
    public static void main(String[] args) {
        WebApplication webApplication = new WebApplication("名片小程序");

        H5WebApplicationCommand h5WebApplicationCommand = new H5WebApplicationCommand(webApplication);

        MiniProgramWebApplicationCommand miniProgramWebApplicationCommand = new MiniProgramWebApplicationCommand(webApplication);

        Staff staff = new Staff();

        staff.addCommand(h5WebApplicationCommand);
        staff.addCommand(miniProgramWebApplicationCommand);

        staff.executeCommands();
    }
}
