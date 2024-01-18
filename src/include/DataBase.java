
/*
 * will be improved tomorrow
 * will contains all of select delete update insert
 * 
 * delete update insert => all are execute from the same method
 */

package include;

import java.sql.*;
import java.util.ArrayList;

import models.User;

public class DataBase {

    private static Connection connection = DBConnectionSingleton.getConnection();

    public static ArrayList<User> display(String sql) {
        ArrayList<User> data = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                data.add(new User(resultSet.getInt("id"), resultSet.getString("name")));
            }
        } catch (SQLException e) {
        }

        return data;

    }

    public static boolean update(String sql) // delete update insert kolo fe haga wahda
    {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(sql);
            return rowsAffected > 0; // there is an action take place, haga hasalet ya3ni

        } catch (SQLException e) {

            return false;
        }

    }

    // public static boolean insert(String sql)
    // {
    // try {
    // Statement statement = connection.createStatement();
    // // int i = statement.executeUpdate(sql);
    // boolean bool = statement.execute(sql);
    // return bool;

    // } catch (SQLException e) {

    // return false;
    // }

    // }

}
