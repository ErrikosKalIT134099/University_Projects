/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio2;

/**
 *
 * @author user
 */
public interface stack {
    
    public int size();
    //returns the size of the stack
    
    public boolean isEmpty();
    //returns true if the stack is empty
    
    public boolean isFull();
    //returns true if the  stack is full;
    
    public student top() throws stackEmptyException;
    //returns the top item of the stack
    
    public void push(student obj) throws stackFullException;
    //adds a new item into the stack
    
    public student pop() throws stackEmptyException;
    //return the top item of the stack
    
}
