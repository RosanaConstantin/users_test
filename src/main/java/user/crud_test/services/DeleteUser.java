package user.crud_test.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {
    public static void deleteFromDB(Connection con, String email) throws SQLException {
        String sql = "DELETE FROM users WHERE email = '" + email + "';";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.commit();
    }
}
