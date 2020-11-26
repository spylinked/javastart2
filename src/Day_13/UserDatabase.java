package Day_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserDatabase {
    private static List<User> users = new ArrayList<User>();

    public static void registerUser(String username) {
        //List<User> usersUsernames = users.toString();
        //Arrays.asList(users);
        if(users.toString().contains(username)) {
            System.out.println("Пользователь с логином " + username + " уже существует.");
        } else {
            System.out.println("Зарегистрирован " + username);
            users.add(new User(username));
        }
    }

    public static List<User> getUsers(){
        return users;
    }

}
