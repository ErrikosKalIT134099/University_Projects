package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class SLListNode {
    
	private Object data;
	private SLListNode nextNode;
	
	public SLListNode(){
		data = null;
		nextNode = null;
	}
	
	public SLListNode(Object data, SLListNode nextNode){
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public Object getNodeData(){
		return data;
	}
	
	public SLListNode getNextNode(){
		return nextNode;
	}
	
	public void setNodeData(Object d){
		this.data = d;
	}
	
	public void setNextNode(SLListNode n){
		this.nextNode = n;
	}
	
	public String toString(){
		return data.toString();
	}
}
