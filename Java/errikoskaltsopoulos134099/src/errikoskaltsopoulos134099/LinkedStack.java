package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class LinkedStack implements Stack {

    private LinkedList l = new LinkedList();
        
    public SLListNode getFirst(){
        return l.getFirst();
    }

    public int size() {
        return l.size();
    }

    public boolean isEmpty() {
        return l.isEmpty();
    }

    public boolean isFull(){
        return false;
    }

    public Object top() throws StackEmptyException {
        try {
            Object topObject = l.removeFirst();
            l.insertFirst(topObject);
            return topObject;
        }
	catch (ListEmptyException e) {
            throw new StackEmptyException("Stack is Empty.");
	}
    }

    public void push(Object item) throws StackFullException {
        l.insertFirst(item);
    }

    public Object pop() throws StackEmptyException {
        try {
            return l.removeFirst();
        }    
	catch (ListEmptyException e) {
            throw new StackEmptyException("Stack is Empty.");
	}
    }
}

