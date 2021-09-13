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
public class LinkedQueue implements Queue{
    
    private SimpleLinkedList Q;
    
    public LinkedQueue(){
        Q=new SimpleLinkedList();
    }

    @Override
    public int size() {
        return Q.size();
    }

    @Override
    public boolean isEmpty() {
       return Q.isEmpty();
    }
    
    @Override
    public Object front() throws QueueEmptyException {
       Object temp;
     if (Q.isEmpty()) throw new QueueEmptyException("Empty Queue!");
        temp = Q.removerFirst();
        Q.insertFirst(temp);
        return temp;

    }

  public Object dequeue( ) throws QueueEmptyException{
    try {
        return Q.removerFirst();
        }
        catch (ListEmptyException str) {
            throw new QueueEmptyException("EmptyQueue");
}
}
  
 public void enqueue(Object item) throws QueueFullException{
    
Q.insertLast(item);
}

    @Override
    public boolean isFull() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Object item) throws QueueFullException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove() throws QueueEmptyException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 public SLListNode getFirst(){
        return Q.getFirst();
    }
    
    public void printPinakida(){
       Q.printPinakida();
        }
    }

