package user.crud_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import user.crud_test.models.User;
import user.crud_test.services.AddUser;
import user.crud_test.services.GetUser;
import user.crud_test.services.GetUsers;
import user.crud_test.services.UpdateUser;
import user.crud_test.services.DeleteUser;
import java.sql.*;
import java.util.List;

@SpringBootApplication
public class UserTest {
    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5433/user_test";
        String user = "postgres";
        String password = "Rosana.12mai";

       try{
            Connection con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            Statement st = con.createStatement();
            AddUser.insertUserToDB(con, "Constantin", "Rosana", "rosana@yahoo.com",24);
            User dbUser = GetUser.getUserFromDB(con, "rosana@yahoo.com");
            List<User> dbUsers = GetUsers.getAllUsers(con);
            UpdateUser.updateLastNameFromDB(con, "rosana@yahoo.com", "Rosana");
            DeleteUser.deleteFromDB(con, "rosana@yahoo.com");
        } catch (SQLException ex) {
            System.out.println("Error while connecting to your database!" );
        }
        SpringApplication.run(UserTest.class, args);
    }
}
