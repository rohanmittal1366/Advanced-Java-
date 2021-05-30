package lpw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lpw {

    public static void main(String[] args) throws SQLException {

        Connection c;
        Statement s;

        Class.forName("com.mysql.jdbc.Driver");

        c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        s = c.createStatement();
        String one = id.getText();
        String two = name.getText();
        String three = mobile.getText();
        String four = null;
        String five = null;

        String query = "UPDATE db SET Name=?,Mobile=?,Gender=?,Semester=? WHERE ID=?";

        PreparedStatement st = c.prepareStatement(query);

        st.setString(1, two);
        st.setString(2, three);
        st.setString(3, four);
        st.setString(4, five);
        st.setString(5, one);
        int x = st.executeUpdate();

    }

}
