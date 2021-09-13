package ergastirio4;

public class SimpleLinkedList implements List {
    
    private SLListNode firstNode,lastNode;
    private int size=0;

    @Override
    public boolean isEmpty() {
       return (firstNode==null);
    }

    @Override
    public int size() {
       return size;
    }

    @Override
    public void insertFirst(Object data) {
        size++;
        if(isEmpty())
            firstNode=lastNode=new SLListNode(data,null);
        else
            firstNode=new SLListNode(data,firstNode);
    }

    @Override
    public void insertLast(Object data) {
        size++;
        if(isEmpty())
            firstNode=lastNode=new SLListNode(data,null);
        else{
           lastNode.setNextNode(new SLListNode(data,null)); 
           lastNode=lastNode.getNextNode();
        }
            
    }

    @Override
    public Object removerFirst() throws ListEmptyException {
        size--;
       if(isEmpty())
           throw new ListEmptyException("Error: Empty List!");
       Object removeItem=firstNode.getNodeData();
       if(firstNode==lastNode)
           firstNode=lastNode=null;
       else
       {
          firstNode=firstNode.getNextNode();
       }
       return removeItem;
    }

    @Override
    public Object removerLast() throws ListEmptyException {
        size--;
         if(isEmpty())
           throw new ListEmptyException("Error: Empty List!");
         Object removeItem=lastNode.getNodeData();
          if(firstNode==lastNode)
           firstNode=lastNode=null;
          else{
               SLListNode current=firstNode;
           while(current.getNextNode() != lastNode)
               current=current.getNextNode();
           lastNode=current;
           current.setNextNode(null);///////////////////////////////////////
           current=current.getNextNode();
          }
          return removeItem;
    }
    
    public void printList(){
        if(isEmpty())
            System.out.println("Error: Empty List");
        else{
            SLListNode current=firstNode;
            while(current !=null){
                System.out.println(current.getNodeData().toString()+"");
                current=current.getNextNode();
            }
            System.out.println("\n");
        }
    }
    
}
