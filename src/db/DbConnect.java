package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement s;
    static {
        try{
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "123456");
        s = c.createStatement();
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
        }
    }
}
