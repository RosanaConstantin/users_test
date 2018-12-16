package user.crud_test.services;

import user.crud_test.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetUsers {
    public static List<User> getAllUsers(Connection con) throws SQLException {
        String query = "SELECT * FROM users";
        User user = new User("", "", "", 0);
        List<User> dbUsers= new ArrayList<>();
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            user.setFirstName(rs.getString("firstname"));
            user.setLastName(rs.getString("lastname"));
            user.setEmail(rs.getString("email"));
            user.setAge(rs.getInt("age"));
            dbUsers.add(user);
        }
        return dbUsers;
    }
}
