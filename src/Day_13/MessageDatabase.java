package Day_13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<Message>();

    public static void sendMessage(User fromUser, User toUser, String text){
        if (fromUser != toUser) {
            if (fromUser.isSubscribed(toUser)) {
                if (toUser.isSubscribed(fromUser)) {
                    messages.add(new Message(fromUser, toUser, text));
                } else {
                    System.out.println(fromUser.getUsername() + ", дождитесь ответной подписки от " + toUser.getUsername() + " чтобы отправить сообщение!");
                }
            } else {
                System.out.println(fromUser.getUsername() + ", вы не подписаны на " + toUser.getUsername() + "!");
            }
        } else {
            System.out.println(fromUser.getUsername() + ", нельзя отправить сообщение самому себе!");
        }
    }

    public static List<Message> getMessages(){
        return messages;
    }

    public static void showDialog(User u1, User u2){
        System.out.println("Диалог " + u1.getUsername() + " и " + u2.getUsername() + ": ");
        for (Message message: messages) {
            if ((message.getSender() == u1 && message.getReceiver() == u2) || (message.getSender() == u2 && message.getReceiver() == u1)) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }

    public static List<Message> getNewMessages(User user){
        List<Message> newMessages = new ArrayList<>();
        for (Message message: messages) {
            if (message.getReceiver() == user && message.getNewFlag()) {
                newMessages.add(message);
                message.setNewFlag(false);
            }
        }
        return newMessages;
    }

}
