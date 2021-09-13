package errikoskaltsopoulos134099;


/**
 *
 * @author Demos
 */

public class Student{
	
	private int am;
	private String onoma;
	private int vathmos;
	
	public Student(int am,String onoma,int vathmos){
		
		this.am=am;
		this.onoma=onoma;
		this.vathmos=vathmos;	
	}
        	
	public void setAm (int am){
		this.am=am;
	}
	
	public void setOnoma (String onoma){
		this.onoma=onoma;
	}
		
	public void setVathmos (int vathmos){
		this.vathmos=vathmos;
	}
	
	public int getAM(){
		return am;
	}
	
	public String getOnoma(){
		return onoma;
	}
				
	public double getVathmos(){
		return vathmos;
	}

	public String toString(){
		return ("AM:"+am+"\nOnoma:"+onoma+"\nVathmos:"+vathmos);	
	}
	
}

