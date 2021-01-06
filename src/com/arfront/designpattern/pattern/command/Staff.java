package com.arfront.designpattern.pattern.command;

import java.util.ArrayList;
import java.util.List;

// 调用者
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }

        commandList.clear();
    }
}
