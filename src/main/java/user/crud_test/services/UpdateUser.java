package user.crud_test.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUser {
    public static void updateLastNameFromDB(Connection con, String email, String ln) throws SQLException {
        String sql = "UPDATE users "
                + "SET lastname = '" + ln + "' "
                + "WHERE email = '" + email + "'";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.commit();
    }

    public static void updateFirstNameFromDB(Connection con, String email, String fn) throws SQLException {
        String sql = "UPDATE users "
                + "SET firstname = '" + fn + "' "
                + "WHERE email = '" + email + "'";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.commit();
    }


    public static void updateEmailFromDB(Connection con, String email, String em) throws SQLException {
        String sql = "UPDATE users "
                + "SET email = '" + email + "' "
                + "WHERE email = '" + email + "'";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.commit();
    }

    public static void updateAgeFromDB(Connection con, String email, Integer age) throws SQLException {
        String sql = "UPDATE users "
                + "SET age = '" + age + "' "
                + "WHERE email = '" + email + "'";
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        con.commit();
    }
}
