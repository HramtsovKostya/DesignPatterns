package patterns.behavioral.mediator.Users;

import patterns.behavioral.mediator.Chat;
import patterns.behavioral.mediator.User;

public class Admin implements User {
    private String name;
    private final Chat chat;

    public Admin(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void sendMessage(String message) { chat.sendMessage(this, message); }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " receiving message: " + message + ".");
    }
}