package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class ArrayQueue implements Queue{
	public static final int CAPACITY = 100;
	private int capacity;
	private Object Q[];
	private int first = 0;
	private int last = 0;

	public ArrayQueue() {
		this(CAPACITY);
	}

	public ArrayQueue(int cap) {
		capacity = cap;
		Q = new Object[capacity];
	}

	public int size() {
		return (last-first);
	}

	public boolean isEmpty() {
		return (first==last);
	}	
        
        public boolean isFull() {
		return (size()==capacity);
	}

	public void enqueue(Object item) throws QueueFullException {
            if (isFull())
		throw new QueueFullException("Queue overflow");		
	    if (last == capacity)
		getHelp();		
	    Q[last++] = item;	
	    }
		
        private void getHelp(){             
            for (int i=0;i<size();i++){
                Q[i]=Q[first+i];            
            }     
            last=size();
            first=0;
        }
        
        public Object front() throws QueueEmptyException {
            if (isEmpty()){
		throw new QueueEmptyException("Queue is empty");
                }
            return Q[first];
	}

	public Object dequeue() throws QueueEmptyException {
		if (isEmpty()){
			throw new QueueEmptyException("Queue is empty");
		}
		Object item = Q[first];
		Q[first++] = null; 
		return item;
	}

	public String toString(){
		if (isEmpty())
			return "System msg: The Queue is empty";
		else{
			String out="";
			for (int i=first;i<last;i++)
				out += "\n" + Q[i];
			return out;
		}
	}   		
}
