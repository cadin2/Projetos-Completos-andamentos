package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.*;
//import javax.swing.*;

public class CF {
    public Connection ConectDB(){
        Connection conn = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/db_login?useSS1=false";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            System.out.println("Erro: "+e.getMessage());
            
        }
        
        return conn;
        
    }
}
