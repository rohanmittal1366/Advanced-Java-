

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql:///prac5", "root", "");
//            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prac5?zeroDateTimeBehavior=convertToNull", "root", "");
            //Peoples?autoReconnect=true&amp;useSSL=false&amp;allowPublicKeyRetrieval=true
            //?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
