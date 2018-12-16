package user.crud_test.services;

import user.crud_test.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetUser {
    public static User getUserFromDB(Connection con, String email) throws SQLException{
        String query = "SELECT * FROM users WHERE email = '" + email + "'";
        User user = new User("", "", "", 0);
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            user.setFirstName(rs.getString("firstname"));
            user.setLastName(rs.getString("lastname"));
            user.setEmail(rs.getString("email"));
            user.setAge(rs.getInt("age"));
        }
        return user;
    }
}
