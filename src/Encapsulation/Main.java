package Encapsulation;

public class Main {

	public static void main(String[] args) {

      
		// Constructor no argument
		//1-
		Student student=new Student();	
	student.setName("Erdal"+" "+"Hulagu");
	student.setAge(2*5+29);
	System.out.print(student.getName()+" is "+student.getAge()+" years old\n");
      System.out.println("----------------------");
     
     
   //----------------------------------------------------------------------------  
     //2-
   // Constructor with argument
	Student student1=new Student("Ali",8);
	
	System.out.println(student1.getName()+"\n"+student1.getAge());
	
	//3-
	//we copied the student1 in to student 2 with copy method we created
	Student student2=new Student();
	student2.copy(student1);
	
	System.out.println(student2.getName()+"\n"+student2.getAge());
	
	//4-
	// we created an contructor  with calling copy method we created and 
	// we call that constructor from here as object and copied student2 in student3
	Student student3 =new Student(student2);
	
	System.out.println(student3.getName()+"\n"+student3.getAge());
	
	
	}
	
	

}
