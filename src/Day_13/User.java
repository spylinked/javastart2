package Day_13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<User>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        if (this != user) {
            if(!this.isSubscribed(user)) {
                subscriptions.add(user);
                System.out.println(this.username + " подписался на " + user.getUsername());
                if (user.isSubscribed(this)) {
                    System.out.println("Взаимная подписка " + this.getUsername() + " и " + getUsername() + "!");
                }
            } else {
                System.out.println(this.username + ", вы уже подисаны на " + user.getUsername());
            }
        } else {
            System.out.println(this.username + ", нельзя подписаться на самого себя!");
        }
    }

    public boolean isSubscribed(User user){
        return !subscriptions.contains(user) ? false : true;
    }

    public boolean isFriend(User user){
        return user.isSubscribed(this) && this.isSubscribed(user);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    public  List<Message> getNewMessages(){
        return MessageDatabase.getNewMessages(this);
    }

    public void readMessages() {

    }

    @Override
    public String toString() {
        return username;
    }
}
