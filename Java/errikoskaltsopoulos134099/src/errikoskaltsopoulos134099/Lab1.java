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
public class Lab1 implements LabInterface {

  private LinkedList foit=new LinkedList();
  private LinkedStack temp=new LinkedStack();
  
    public Lab1() {
      
    }
    
    
//dokimasa na kanw enan prosorino pinaka wste na min xanonte ta dedomena ,etsi ta metefera se ena prosorino
   //wste na kanw tin douleia m kai meta na epistrefonte  stin arxiki lista alla dustixws dne prolava na to ulopiiso
    //kai na kanw tis aparetites allages
    public void swap(){
        int size=foit.size();
        for(int i=0;i<size;i++){
            try {
                temp.push(foit.removeFirst());
            } catch (ListEmptyException ex) {
                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }
    }
   
@Override
    public void insert(Student s) {
    
       foit.insertFirst(s);
       
    }



    @Override
    public void delete(int am) throws NoStudentException {
        int size=foit.size();
        for(int i=0;i<size;i++){
            try {
                if (((Student)foit.removeFirst()).getAM()==am){
                    System.out.print("To am vrethike!"+am);
                    foit.removeFirst();
                }
            } catch (ListEmptyException ex) {
                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    @Override
    public double averageGrade() {
        double result=0,res=0;
        int size=foit.size();
       while(!foit.isEmpty()){
            try {
                res=((Student)foit.removeFirst()).getVathmos()+res;
            } catch (ListEmptyException ex) {
                Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       result=res/size;
       return result;
    }
    
    public void printList() throws ListEmptyException{
		if(foit.isEmpty())
			throw new ListEmptyException("List is Empty.");
		foit.printList();
	}
    
}
