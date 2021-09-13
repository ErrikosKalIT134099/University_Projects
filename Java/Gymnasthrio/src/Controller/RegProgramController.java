/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.LoginController.driverClassName;
import Model.*;
import View.*;
import Controller.*;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class RegProgramController {
    //private userdia1 dia=new userdia1();
    private UIProgramRegister uiRegProg;
    public ArrayList <Synedria> synedriaList = new ArrayList<>();
    private String gymn="",mathima="";
    private static int seat=0;
   ArrayList <String> mathimataLesson = new ArrayList<>();
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
   
   public RegProgramController() throws SQLException{
        try {
           // TODO code application logic here
          uiRegProg = new UIProgramRegister(this);
           Class.forName (driverClassName);
           Connection conn=DriverManager.getConnection (url, dbusername, dbpasswd);
           java.sql.Statement st= conn.createStatement();
           ResultSet rs=st.executeQuery("select * from GYMPROG");
           //String hmera, int thesis, int wra, Aithousa aith, Gymnastis gymn, eidiko_programma eidiko
            while (rs.next()){
                 Synedria Synedries = new Synedria(rs.getString(2),rs.getInt(7),rs.getString(3),new Aithousa(rs.getInt(5)),new Gymnastis(rs.getString(6),new eidiko_programma(rs.getString(4),rs.getInt(5))),new eidiko_programma(rs.getString(4),rs.getInt(5)));
                 gymn=Synedries.getGymnasti();
                 mathima=Synedries.getEidiko().getTitlos();
                 synedriaList.add(Synedries);
                 
                 //uiRegProg.getComponents();
                 //System.out.println("Ar Gymnastes"+gymn);
                System.out.println("Arrlist Eggrafes"+Synedries.toString());
            }
           
           
           
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(GymSys.class.getName()).log(Level.SEVERE, null, ex);
       }
        
           uiRegProg = new UIProgramRegister(this);
           uiRegProg.setVisible(true);
          
   }
   
   public String getGymnastis(){
       return gymn;
   }
   
   public String getMathita(){
       return mathima;
   }
   
   public void proSetUp(int buttonID){
        String day="",time="";
        int id=buttonID-1;
          System.out.println("Mera:"+synedriaList.get(id).getHmera()+"Wra" +synedriaList.get(id).getWra());
          uiRegProg.SetProg(synedriaList.get(id).getHmera(), synedriaList.get(id).getWra(),synedriaList.get(id).getGymnasti(),synedriaList.get(id).getAith().getArAith(),synedriaList.get(id).getEidiko().getTitlos(),synedriaList.get(id).getThesis());

     
   }
   public int decThesi(int buttonID) throws SQLException{
        int id=buttonID-1;
        int theseis=0,newtheseis=0,out=0;
         System.out.print(buttonID);
         Connection conn=DriverManager.getConnection (url, dbusername, dbpasswd);
               Statement st= conn.createStatement();
               ResultSet rs;
               Component frame = null;
               
        //if (buttonID==1){
           theseis=synedriaList.get(id).getThesis();
           newtheseis=theseis-1;
           out=newtheseis;
           seat=out;
           synedriaList.get(0).setThesis(newtheseis);
           rs=st.executeQuery("UPDATE GYMPROG SET  THESIS='"+newtheseis+"' where PROID='D"+buttonID+"'");    
           System.out.print("neea thesi: "+synedriaList.get(0).toString());
       // }
        JOptionPane.showMessageDialog(frame,"Εγγραφη Επιτυχης!.");
       return out;
   }
   
   public int newThesi(){
       return seat;
   }
   
   public ArrayList<String> btnText(){
       
       for(int i=1; i<synedriaList.size(); i++){
           mathimataLesson.add(synedriaList.get(i).getEidiko().getTitlos());
       } System.out.println("mathimata:: "+mathimataLesson.toString());
      return mathimataLesson;
       
   }
   
   
  
    
}
