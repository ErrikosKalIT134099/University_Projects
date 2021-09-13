package ergastirio4;

public class Ergastirio4 {

  public static void menuDisplay(){
        System.out.println("======Menou Display======");
        System.out.println("");
        System.out.println("1.INSERT ELEMENT AT THE BEGINNING OF THE LIST");
        System.out.println("2.INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("3.DELETE FROM THE BEGINNING OF THE LIST");
        System.out.println("4.DELETE FROM THE END OF THE LISTs");
        System.out.println("5.LIST Length");
        System.out.println("6.IS THE LIST EMPTY");
        System.out.println("7. PRINT LIST");
        System.out.println("8.EXIT");
        System.out.println("Dwse epilogi 1-8:");
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int choice=0,am=0,pin=0;
         String onoma,eponymo;
        Student stud[]=new Student[100];
        SimpleLinkedList studList=new SimpleLinkedList();
        
       
        
      
                
                   
    while(choice != 8){
        menuDisplay();
        choice=UserInput.getInteger();
    switch(choice){
        case 1: 
            System.out.print("Dwse TO onoma tou foititi: ");
            onoma=UserInput.getString();
            System.out.print("Dwse to eponymo: ");
            eponymo=UserInput.getString();
            System.out.print("Dwse ton AM: ");
            am=UserInput.getInteger();
             stud[pin]= new Student(onoma,eponymo,am);
                studList.insertFirst(stud[pin]);
                pin++;
            break;
            
        case 2:
           System.out.print("Dwse TO onoma tou foititi: ");
            onoma=UserInput.getString();
            System.out.print("Dwse to eponymo: ");
            eponymo=UserInput.getString();
            System.out.print("Dwse ton AM: ");
            am=UserInput.getInteger();
             stud[pin]= new Student(onoma,eponymo,am);
                studList.insertLast(stud[pin]);
                pin++;
            break;
            
        case 3:
            studList.removerFirst();
            break;
        case 4:
            studList.removerLast();
            break;
        case 5:
            System.out.println("Size: "+studList.size());
            break;
        case 6:
            System.out.println("IsEmpty:"+studList.isEmpty());
            break;
        case 7:
             studList.printList();
            break;
        case 8:
            System.out.println("Ginete Exodos programmatos!!");
            choice=8;
            break;
        
        default:
            System.out.println("Mh Egkuros arithmos Dwse anamesa se 1-8  ");
           
            break;
    }//end of switch
    }//end of while
    }
}
