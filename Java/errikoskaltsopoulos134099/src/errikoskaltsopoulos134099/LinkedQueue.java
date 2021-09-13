package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class LinkedQueue implements Queue {
	
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

    public boolean isFull() {
        return false;
    }

    public Object front() throws QueueEmptyException {
        try {
            Object frontObject = l.removeLast();
            l.insertLast(frontObject);
            return frontObject; 
        }
        catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is Empty.");
        }           
    }

    public void enqueue(Object item) throws QueueFullException {
        l.insertFirst(item);
    }

    public Object dequeue() throws QueueEmptyException {
        try {
            return l.removeLast();
        }
        catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is Empty.");
        }
    }
	
    public void printQueue(){
        try {
            l.printList();
        }
        catch (ListEmptyException e) {
            throw new QueueEmptyException("Queue is Empty.");
        }
    } 
}

