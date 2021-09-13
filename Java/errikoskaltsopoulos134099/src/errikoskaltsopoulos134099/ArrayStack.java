package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class ArrayStack implements Stack{
	public static final int CAPACITY = 100;
	private int capacity;
	private Object S[];
	private int top = -1;

	public ArrayStack() {
		this(CAPACITY);
	}

	public ArrayStack(int cap) {
		capacity = cap;
		S = new Object[capacity];
	}

	public int size() {
		return (top+1);
	}

	public boolean isEmpty() {
		return (top < 0);
	}	
        
        public boolean isFull() {
		return (size()== capacity);
	}

	public void push(Object item) throws StackFullException{
		if (size()== capacity)
			throw new StackFullException("Stack overflow");
		S[++top] = item;
	}
 
	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is empty");
		return S[top];
	}

	public Object pop() throws StackEmptyException {
		Object element;
		if (isEmpty())
			throw new StackEmptyException("Stack is empty");
		element = S[top];
		S[top--] = null; //!!! for garbage collector
		return element;
	}
}
