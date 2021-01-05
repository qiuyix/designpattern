package com.arfront.designpattern.pattern.command;

public class H5WebApplicationCommand implements Command {

    private WebApplication webApplication;

    public H5WebApplicationCommand(WebApplication webApplication) {
        this.webApplication = webApplication;
    }

    @Override
    public void execute() {
        this.webApplication.h5();
    }
}
