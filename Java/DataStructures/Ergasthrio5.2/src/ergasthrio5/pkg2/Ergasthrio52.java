
package ergasthrio5.pkg2;

public class Ergasthrio52 {

    public static void menuDisplay(){
        System.out.println("======Menou Display======");
        System.out.println("");
        System.out.println("1.Afixi Autokinitoy");
        System.out.println("2.Anaxwrisi Autokinitou");
        System.out.println("3.Katastatsh ouras");
        System.out.println("4.Exodos");
        System.out.println("Dwse epilogi 1-4:");
    }
    
   public static void swap(LinkedQueue lista){
        
        LinkedQueue temp=new LinkedQueue();
        int size=lista.size();
      
        for(int i=0;i<size;i++){
            String tablet=((Car)lista.front()).getPinakida();
            temp.enqueue(lista.dequeue());     
            System.out.println("To ama3i einai sthn oura einai : "+tablet);
            lista.enqueue(temp.dequeue());         
        }
           
    }
    
   
    

    public static void main(String[] args) {
        
        int choice=0,arKukloforias,pin=0;
        String marka,pinakida;
        String tablet;
       
        Car[] car = new Car[200]; 
        LinkedQueue lista=new LinkedQueue();
        
//        Car auto[]=new Car[4];
//        auto[0]=new Car("Bmw","AOE 5764",3597);
//        auto[1]=new Car("Audi","ENZ 4574",9854);
//        auto[2]=new Car("Mercedes","KOM 5452",3267);
//        auto[3]=new Car("Porsche","XAN 1235",1237);
//        lista.enqueue(auto[0]);
//        lista.enqueue(auto[1]);
//        lista.enqueue(auto[2]);
//        lista.enqueue(auto[3]);
//        

    
    while(choice != 4){
        menuDisplay();
        choice=UserInput.getInteger();
    switch(choice){
        case 1: 
            System.out.print("Dwse tin marka tou autokinitoy: ");
            marka=UserInput.getString();
            System.out.print("Dwse tin pinakida tou autokinitoy: ");
            pinakida=UserInput.getString();
            System.out.print("Dwse ton Arithmo kukloforias: ");
            arKukloforias=UserInput.getInteger();
             car[pin]= new Car(marka,pinakida,arKukloforias);
                lista.enqueue(car[pin]);
                pin++;
            break;
            
        case 2:
             System.out.println("To Autokinito me Stoixeia: "+lista.dequeue()+" Briskete prwto stin oura kai anaxwri ");
            break;
            
        case 3:
             swap(lista);
            break;
        case 4:
            System.out.println("Ginete Exodos programmatos!!");
            choice=4;
            break;
        
        default:
            System.out.println("Mh Egkuros arithmos Dwse anamesa se 1-4  ");
           
            break;
    }//end of switch
    }//end of while
    }  
}
