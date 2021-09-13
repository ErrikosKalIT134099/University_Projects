package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class Lab {
    
    private String LabName;
    private int capacity;
    private int size=0;
    private Student[] LabArray;
    
    public Lab(String Name, int cap){
        LabName=Name;
        capacity=cap;
        LabArray = new Student[capacity];
    }
    
    public Lab(String Name){
        this(Name,20);
    }
    
    public int size(){
        return size;
    }
    
    public String getName(){
        return LabName;
    }
            
    public boolean insert(Student S){
        if (size>=capacity)
        {   System.out.println("Lab "+LabName+" is Full");
            return false;
        }
        else
        {
            LabArray[size++]=S;
            return true;
        }
    }
    
    public boolean delete(Student S){
        for (int i=0; i<size; i++)
            if (LabArray[i]==S) 
            {   LabArray[i]=LabArray[--size];
                return true;
            }
        return false;
    }
    
    public Student search(int AM){
   
        for (int i=0; i<size; i++)
            if (LabArray[i].getAM()==AM) return LabArray[i];
        return null;
    }
    
    public void presentations(){
        for (int i=0; i<size; i++)
            System.out.println(LabArray[i].getAM()+"--"+LabArray[i].getOnoma()+"--"+LabArray[i].getVathmos());
    }
    
    public int succeded(){
        int count=0;
        for (int i=0; i<size; i++)
            if (LabArray[i].getVathmos()>=5)
                count++;
        return count;
    }
    
    public int failed(){    
        return (size-succeded());
    }
    
    public double averageGrade(){   
        double total=0.0;
        for (int i=0; i<size; i++)
            total=total+LabArray[i].getVathmos();
        return total/size;
    }
}

