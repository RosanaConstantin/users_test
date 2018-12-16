package user.crud_test.services;

import java.sql.*;

public class AddUser {
    public static void insertUserToDB(Connection con, String firstName, String lastName, String email, Integer age) throws SQLException {
        String query = "INSERT INTO users(age, firstname, lastname, email) VALUES(?, ?, ?, ?)";
        try(PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, age);
            pst.setString(2, firstName);
            pst.setString(3, lastName);
            pst.setString(4, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
           System.out.println("Error while insert into db");
        }
    }
}
