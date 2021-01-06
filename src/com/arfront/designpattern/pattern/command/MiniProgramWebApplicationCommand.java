package com.arfront.designpattern.pattern.command;

// 具体命令
public class MiniProgramWebApplicationCommand implements Command{
    private WebApplication webApplication;

    public MiniProgramWebApplicationCommand(WebApplication webApplication) {
        this.webApplication = webApplication;
    }

    public void execute() {
        this.webApplication.miniProgram();
    }
}
