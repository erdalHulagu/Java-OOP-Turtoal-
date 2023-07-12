package Statics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.AuthenticationException;

public class Main {
	
//---- Static= modifier. Asingle copy of a variable and method is created and shared
//	                     AuthenticationException class has to have static field.-------------------------
//                        if you want to use static you need to call Class example (Student.numberOfStudent)
	
	public static void main(String[] args) {
		
		Student student1 = new Student("erdal",39);
		Student student2 = new Student("ilyas", 40);
		Student student3 = new Student("Ali", 42);
		
		//---------we called static field
		System.out.println("we called static field = "+Student.numberOfStudents);
		
		System.out.println();
		//---------we called static method
		Student.viewStudents();
		
		System.out.println();
		
//		System.out.println(student1.numberOfStudents);  // if only we want student 1 to work than we have to remove 
		                                                //the static block in student class we created
	
		
		
		//------------ we add all students in to list an opend all the object with using lambda
		List<Student> list= new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
	     List<String> names	=list.stream().map(t->"\n"+"name = "+t.name+"  "+t.age+" years old"+"\n").collect(Collectors.toList());
	
	System.out.println("we opened all the object = "+names);
		
		//----------- Math is a static class
	double randomNumber=Math.random();
	System.out.println(randomNumber);
	}
	

}
