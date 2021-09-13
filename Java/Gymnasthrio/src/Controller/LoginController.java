/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.*;
import View.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Errikos
 */
public class LoginController {
      private UILogin uiLogin;
    private ArrayList <Eggrafi> accountList = new ArrayList<>();
    private String user="";
   
   static String     driverClassName = "oracle.jdbc.OracleDriver" ;
   static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;    
   static String     dbusername = "IT134099";
   static String     dbpasswd = "123456"; 
   static Connection dbConnection    = null;
   static java.sql.Statement  statement = null;
   static ResultSet  rs = null; 
   static ResultSet  rs2 = null;  
   static ResultSetMetaData rsmd     = null;
   static DatabaseMetaData dbmd      = null;
   static PreparedStatement insertData = null;
   
    public LoginController() throws SQLException {
        
            try {
           // TODO code application logic here
          
           Class.forName (driverClassName);
           Connection conn=DriverManager.getConnection (url, dbusername, dbpasswd);
           java.sql.Statement st= conn.createStatement();
           ResultSet rs=st.executeQuery("select * from USERTABLE");
            while (rs.next()){
                 Eggrafi accounts = new Eggrafi(rs.getString(2),rs.getNString(3));
                accountList.add(accounts);
                System.out.println("Arrlist Eggrafes"+accounts.accountPrint());
            }
           
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(GymSys.class.getName()).log(Level.SEVERE, null, ex);
       }
            uiLogin = new UILogin(this);
        uiLogin.setVisible(true);
    }
    
   public Eggrafi login(String username, String password) {
        user = "";
        for (Eggrafi account : accountList) {
            if (account.validate(username, password)) {
                user = account.getUsername();
                return account;
            }
        }
         uiLogin.showMsg("la8osss");
        return null;
    } 
    
   public String getUser() { 
        return user;
    }
    
}
