import java.util.*;
public class student{
	private   int id;
	private String   name;
	private double   cgpa;
	
    
	public void setName(String name){
		this.name= name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setCgpa(double cgpa){
		this.cgpa= cgpa;
	}
	
	
	
	
	public int getId(){
		return id;
	}
	public String getName(){
		return   name;
	}
	public double getCgpa(){
		return cgpa;
	}
	
	public static void  main(String args[]){
		student s=  new student();
		
		s.setId (37577);
		s.setName("Abdullah");
		s.setCgpa(3.66);
		
		System.out.println("Id: "+s.getId());
		System.out.println("Name: "+s.getName());
		System.out.println("Cgpa: "+s.getCgpa());
	}
}