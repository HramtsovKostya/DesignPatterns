package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    private User admin;
    private final List<User> users = new ArrayList<>();

    public void setAdmin(User admin) { this.admin = admin; }

    public void addUserToChat(User user) { users.add(user); }

    @Override
    public void sendMessage(User user, String message) {
        for (User u: users) if (u != user) u.getMessage(message);
        admin.getMessage(message);
    }
}