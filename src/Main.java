import java.util.ArrayList;

import include.DataBase;
import models.User;

class Main {
    public static void main(String[] args) {
        System.out.println("test");

        ArrayList<User> users = DataBase.display("select * from users");

    //     for (User user : users) {
    //         System.out.println(user.id + " " + user.name);
    //     }

    //   System.out.println(DataBase.update("UPDATE users SET name = 'Miroo' WHERE id = 12"));  

    //     users = DataBase.display("select * from users");
    //     for (User user : users) {
    //         System.out.println(user.id + " " + user.name);
        // }

        System.out.println(DataBase.update("INSERT INTO users (name) VALUES ('857dd')"));

        users = DataBase.display("select * from users");
        for (User user : users) {
            System.out.println(user.id + " " + user.name);
        }

        // Connection connection = DBConnectionSingleton.getConnection();

        // try {
        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("select * from users");
        // while (resultSet.next()) {

        // System.out.println(resultSet.getString("name"));
        // }
        // } catch (Exception e) {
        // // TODO: handle exception
        // }
    }

}