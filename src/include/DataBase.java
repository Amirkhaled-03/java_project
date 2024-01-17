
/*
 * will be improved tomorrow
 * will contains all of select delete update insert
 * 
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
                data.add(new User(resultSet.getString("name")));
            }
        } catch (SQLException e) {

        }

        return data;

    }

}
