package Week7.UserManagementApp.core;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {

    public static Connection connection(){

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/example",
                    "postgres",
                    "0508"
            );

        }catch (Exception e){
            e.printStackTrace();
        }

        return connection;
    }
}
