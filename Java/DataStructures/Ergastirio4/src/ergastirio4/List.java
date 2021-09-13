package ergastirio4;

public interface List {
    
    
    public boolean isEmpty();
    
    public int size();
    
    public void insertFirst(Object data);
    
    public void insertLast(Object data);
    
    public Object removerFirst()throws ListEmptyException;
    
    public Object removerLast()throws ListEmptyException;
    
}
