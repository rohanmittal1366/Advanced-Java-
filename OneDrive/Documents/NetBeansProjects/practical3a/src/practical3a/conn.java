/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3a;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    public conn() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true", "root", "");
            //Peoples?autoReconnect=true&amp;useSSL=false&amp;allowPublicKeyRetrieval=true
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
