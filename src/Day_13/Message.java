package Day_13;

import java.util.Date;

public class Message {
    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;
    private Boolean newFlag;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
        this.newFlag = true;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public Boolean getNewFlag() {
        return newFlag;
    }

    public void setNewFlag(Boolean newFlag) {
        this.newFlag = newFlag;
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date +
                "\n\'" + text + "\'";
    }
}
