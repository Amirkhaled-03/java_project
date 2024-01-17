
/*
 * singleton pattern 
 * 
 * Only create one instance of a class in the memory along the progrm
 * 
 * every time create an object will make an new object in the memory, so if we create other object there is two objects here
 * But if he check if there is not any object in the memory, if there is not any object create one 
 * else make the new object points to the old one
 * 
 */

package include;

import java.sql.*;

public class DBConnectionSingleton {

    private static String url = "jdbc:mysql://localhost:3306/temp";
    private static String username = "root";
    private static String password = "rootpassword";
    private static Connection connection = null; // class connection in java

    private DBConnectionSingleton() { // private to prevent object creation
    }

    public static Connection getConnection() {  // will return connection

        if (connection == null) { // this means there is not any objects in the memory
            try {
                connection = DriverManager.getConnection(url, username, password); // this way we make a connection with
                                                                                   // the DB
            } catch (SQLException e) {
                System.out.println("there is an error in the connection");
                // Set connection to null to allow retry in the next call
                // connection = null;
                throw new RuntimeException(e);
            }

        }
        return connection; // return the connection, if the is no object will make object
                           // and return it else will return the created one.

    }
}

// try {
// Connection connection = DriverManager.getConnection(url, username, password);
// System.out.println("data base connected successfully");
// Statement statement = connection.createStatement();
// ResultSet resultSet = statement.executeQuery("select * from users");
// while (resultSet.next()) {
// System.out.println(resultSet.getString("name"));

// }
// } catch (SQLException e) {
// System.out.println("there is an error in the connection");
// throw new RuntimeException(e);
// }
