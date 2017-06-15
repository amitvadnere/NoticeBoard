package db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class userdb {
   
    static private Statement st=null;
    static private Connection con=null;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trial","root","");
            System.out.println("userdb Connected");
            st=con.createStatement();
        }
        catch(SQLException e)
        {
            System.out.println("userdb Error" +e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userdb.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    public Statement getstatement(){
        return st;
    }
}
