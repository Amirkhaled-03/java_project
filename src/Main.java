import java.util.ArrayList;

import include.DataBase;
import models.User;

class Main {
    public static void main(String[] args) {
        System.out.println("test");

        ArrayList<User> users = DataBase.display("select * from users");

        System.out.println(users.get(0).name);

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