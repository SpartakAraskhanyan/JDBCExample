package jdbcexample.db;

import jdbcexample.db.manager.UserManager;
import jdbcexample.db.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();
        try {
//            User user = new User("poxos", "poxosyan", "poxos@.com","poxosik");
//            userManager.addUser(user);
//            System.out.println(user);
            List<User> allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
            userManager.deleteUserById(1);
            allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
