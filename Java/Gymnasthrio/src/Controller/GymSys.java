/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Eggrafi;
import Model.Gymnastirio;
import View.*;
import java.beans.Statement;
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
public class GymSys {

    /**
     * @param args the command line arguments
     */

   
   public static void main(String[] args) throws SQLException {
   
     Gymnastirio gym=new Gymnastirio("Euexia","Paulou mela");
    //LoginController cLogin = new LoginController(); 
    gym.Start();

   }
    
}
