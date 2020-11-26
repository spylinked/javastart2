package Day_13;

import MyUtils.generate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            UserDatabase.registerUser(generate.generateLogin());
        }
        System.out.println(UserDatabase.getUsers());

        for (User user : UserDatabase.getUsers()) {
            for (int i = 0; i < 3; i++) {
                user.subscribe(UserDatabase.getUsers().get(rnd.nextInt(UserDatabase.getUsers().size())));
            }
        }

        for (User user : UserDatabase.getUsers()) {
            for (int i = 0; i < 3; i++) {
                MessageDatabase.sendMessage(user, UserDatabase.getUsers().get(rnd.nextInt(UserDatabase.getUsers().size())), "Привет!");
            }
        }

        for (User user : UserDatabase.getUsers()) {
            for (Message message: user.getNewMessages()) {
                MessageDatabase.sendMessage(user,message.getSender(), "И тебе привет! " + message.getSender());
            }
        }

        for (User user : UserDatabase.getUsers()) {
            for (User user2 : UserDatabase.getUsers()) {
                if(user != user2) {
                    MessageDatabase.showDialog(user, user2);
                }
            }
        }

        //System.out.println(MessageDatabase.getMessages());
    }
}
