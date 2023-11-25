package employee.tracking.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeeTrackingSystem", "root", "P@tu9183sutar");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
