/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio5.pkg2;

/**
 *
 * @author Errikos
 */
public interface Queue {
    
    public int size();
    //epistrefei to megethos tis ouras
    
    public boolean isEmpty();
    //epistrefei true ean einai adeia
    
    public boolean isFull();
    //epistrefei true ean einai gemati
    
    public Object front() throws QueueEmptyException;
    //epistrefei to proto stoixeio tis ouras
    
    public void add(Object item) throws QueueFullException;
    //prosthetei ena epipleon item sto telos tis ouras
    
    public Object remove() throws QueueEmptyException;
    //afairei ena stoixeio apo tin oura
}
