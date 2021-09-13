package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class LinkedList implements List {
	
	private SLListNode first;
	private SLListNode last;
	
	public LinkedList(){
		first = last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		int size = 0;
		for(SLListNode position = first; position != null; position = position.getNextNode())
			size++;
		return size;
	}

	public void insertFirst(Object data) {
		if(isEmpty())
			first = last = new SLListNode(data, null);
		else
			first = new SLListNode(data, first);
	}

	public void insertLast(Object data) {
		if(isEmpty())
			first = last = new SLListNode(data, null);
		else{
			SLListNode temp = new SLListNode(data, null);
			last.setNextNode(temp);
			last = temp;
		}
	}

	public Object removeFirst() throws ListEmptyException {
		if(isEmpty())
			throw new ListEmptyException("List is Empty.");
		Object removedItem = first.getNodeData();
		if(first == last)
			first = last = null;
		else
			first = first.getNextNode();
		return removedItem;
	}

	public Object removeLast() throws ListEmptyException {
		if(isEmpty())
			throw new ListEmptyException("List is Empty.");
		Object removedItem = last.getNodeData();
		if(first == last)
			first = last = null;
		else{
			SLListNode position;
			for(position = first; position.getNextNode() != last; position = position.getNextNode());
			last = position;
			position.setNextNode(null);
		}	
		return removedItem;
	}
	
	public void printList() throws ListEmptyException{
		if(isEmpty())
			throw new ListEmptyException("List is Empty.");
		for(SLListNode position = first; position != null; position = position.getNextNode())
			System.out.println(position.getNodeData());
	}
        
        public SLListNode getFirst(){
            return first;
        }
    
}

