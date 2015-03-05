package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Georgy Gobozov
 * Date: 14.04.13
 */
public class UserDataSource {

    private static List<User> users;

    static {
        users = new ArrayList<User>();
    }

    public static void addUser(String login, String pass){
        users.add(new User(login, pass));
    }

    public static User getUser(String login){
        for (User user : users) {
            if (user.getLogin().equals(login))
                return user;
        }
        return null;
    }


    public static class User {

        private String login;
        private String pass;

        public User() {
        }

        public User(String login, String pass) {
            this.login = login;
            this.pass = pass;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }
    }

}
