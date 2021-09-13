package ergasthrio5.pkg2;

public class SLListNode {
    
    private Object data;
    private SLListNode  nextNode;
    
    public SLListNode(){
      this(null,null);
    }

    SLListNode(Object data, SLListNode nextNode) {
        this.data=data;
        this.nextNode=nextNode;
    }
    
    public Object getNodeData(){
            return data;
    }
    
    public SLListNode getNextNode(){
        return (nextNode);
    }
    
    public void setNodeData(Object d){
        this.data=d;
    }
    
    public void setNextNode(SLListNode n){
        this.nextNode=n;
    }
    
    public String toString(){
        return "Data: "+data+"\n"+
                "Next Node: "+nextNode;
    }
    
}
