package day13;

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;


public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean result = false;
        for (User users : subscriptions) {
            if (users.equals(user)) {
                result = true;
            }
        }
        return result;
    }

    public boolean isFriend(User user) {
        boolean result = false;
        if (this.isSubscribed(user) && user.isSubscribed(this)) {
            result = true;
        }
        return result;
    }

    public void sendMessage(User user, String text) {
        addNewMessage(this, user, text);
    }

    public String toString() {
        return getUsername();
    }
}

