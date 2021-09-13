/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package errikoskaltsopoulos134099;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ErrikosKaltsopoulos134099 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student stud[]=new Student[3];
        stud[0]=new Student(1234,"Errikos",10);
         stud[1]=new Student(124,"giwrgos",3);
          stud[2]=new Student(134,"petros",3);
          
          Lab1 domes=new Lab1();
          
          //eisagwgi foititwn sto tmhma
          domes.insert(stud[0]);
          domes.insert(stud[1]);
          domes.insert(stud[2]);
           
        //ektipwsh listas
          try {
            domes.printList();
        } catch (ListEmptyException ex) {
            Logger.getLogger(ErrikosKaltsopoulos134099.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        //ektipwsh mesou vathmou
          System.out.print("Result:"+domes.averageGrade());
          
       //diagrafi mathiti
        try {
            domes.delete(124);
        } catch (NoStudentException ex) {
            Logger.getLogger(ErrikosKaltsopoulos134099.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
          
    }
}
