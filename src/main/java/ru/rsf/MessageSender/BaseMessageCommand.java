package ru.rsf.MessageSender;

public class BaseMessageCommand implements Command{

    String title;
    String message;

    BaseMessageCommand(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void execute() {
        throw new RuntimeException("Override BaseMessageCommand execute method!");
    }
}
