/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package errikoskaltsopoulos134099;

/**
 *
 * @author user
 */
public interface LabInterface {
    
    public void insert(Student s);
    
    public void delete(int am)throws NoStudentException;
    
    public double averageGrade();
    
    
}
