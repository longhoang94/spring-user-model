package dao;

import models.Login;
import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User john = new User("john", "123456", "John", "john@codegym.com", 10);
        users.add(john);
        User ronaldo = new User("ronaldo", "123456", "Ronaldo", "ronaldo@codegym.com", 11);
        users.add(ronaldo);
        User tevez = new User("tevez", "123456", "Tevez", "tevez@codegym.com", 12);
        users.add(tevez);
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
