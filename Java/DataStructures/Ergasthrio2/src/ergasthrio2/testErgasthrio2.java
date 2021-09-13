/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio2;


/**
 *
 * @author user
 */
public class testErgasthrio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        arrayStack sa=new arrayStack(1);   
        
        student stud1=new student(123,"er","as");
        
        try {
            sa.push(stud1);
        } catch (stackFullException ex) {
           System.out.println(ex);
        }
    }
}
