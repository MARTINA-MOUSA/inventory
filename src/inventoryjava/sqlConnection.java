/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryjava;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class sqlConnection {
    public static void main(String[] args) {
       sqlConnection pro=new sqlConnection();
       pro.createConnection();
       
   
}
    void createConnection() 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Myinventory","root","root");
            System.out.println("Database connection success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(sqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}