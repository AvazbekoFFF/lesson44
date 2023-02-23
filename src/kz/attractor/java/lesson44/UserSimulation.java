package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserSimulation {
    public static List<User> users = new ArrayList<>();
    private static boolean isSuchUser = false;


    public static boolean makeUser(Map<String, String> user) {
        User newUser = new User(getUserName(user), getUserLogin(user), getUserPassword(user));
        if (checkUsersRegister(user, newUser)) {
            isSuchUser = true;
        } else {
            isSuchUser = false;
        }
        return isSuchUser;
    }

    public static String getUserName(Map<String, String> parsed) {
        return parsed.get("name");
    }

    public static String getUserLogin(Map<String, String> parsed) {
        return parsed.get("email");
    }

    public static String getUserPassword(Map<String, String> parsed) {
        return parsed.get("user-password");
    }

    public static boolean checkUsersRegister(Map<String, String> us, User user) {
        boolean such = true;
        if (users.size() == 0) {
            users.add(user);
            System.out.println(users);
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (getUserLogin(us).equalsIgnoreCase(users.get(i).getLogin())) {
                    System.out.println("такой юзер есть");
                    such = false;
                }
            }
            if (such) {
                users.add(user);
                System.out.println("Успешно зарегистрированы");
                System.out.println(users);
            }
        }
        return such;
    }
    public static boolean Authorization(Map<String, String> us){
        boolean isSuch = false;
        for (int i = 0; i < users.size(); i++) {
            if (getUserLogin(us).equalsIgnoreCase(users.get(i).getLogin()) && getUserPassword(us).equalsIgnoreCase(users.get(i).getPassword())){
                System.out.println("Пользователь найден: " + users.get(i).getLogin() + " " + users.get(i).getPassword());
                isSuch = true;
            } else {
                isSuch = false;
            }
        }
        return isSuch;
    }
}