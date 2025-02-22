package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement s;
    static {
        try{
        c = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com/sql12764148"+"?useSSL=false", "sql12764148", "UYXcwAj8L1");
        s = c.createStatement();
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }
}
