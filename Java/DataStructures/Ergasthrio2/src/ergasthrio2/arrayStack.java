/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ergasthrio2;

/**
 *
 * @author user
 */
public class arrayStack implements stack {
    
    private int top=-1;
    private int capacity;
    private student s[];
    
    public arrayStack(){}
    
    public arrayStack(int capacity){
        
        this.capacity=capacity;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        if(top<0){
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (size()==capacity){
            return true;
        }
        return false;
    }

    @Override
    public student top() throws stackEmptyException {
       if(isEmpty()){ throw new stackEmptyException("Error: Array is Empty! ");}
       return s[top];
    }

    @Override
    public void push(student obj) throws stackFullException {
        if(size()==capacity){throw new stackFullException("Error Array is Full!");}
        s[++top]=obj;
    }

    @Override
    public student pop() throws stackEmptyException {
        student ele;
        if(isEmpty()){throw  new stackEmptyException("Error: Array is Empty! ");}
        ele=s[top];
        s[top--]=null;
        return ele;
    }
    
}
