package SuperClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		// super = keyword refers to the superClass (parent class) of an object
		//         very smiller to this keyword;
		
		Students student1=new Students("5 B","Maths" , "Mustafa", 18);
		Students student2=new Students("5 B","Maths" , "Ahmet", 18);
		Students student3=new Students("5 B","Maths" , "Ali", 18);
		
		// 1-
		//toString method we created in School class and we called it from student class with using super calss items
		System.out.println(student1.toString()); // super class 
		System.out.println("----------------------------");
		
		//2-
		// Open method we created in student class and added supper class fields 
		System.err.println(student2.open());  // child class with super class 
		System.out.println("----------------------------");
		
		
		
		List<Students>list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		
		
		// we opened with lambda express
	List<String> newList=	list.stream()
		.map(student->"\n Class name= "+student.className
				     +"\n Lesson name = "+student.sujectOfLesson
				     +"\n Student name= "+student.nameOfStudent
				     +"\n Student age= "+student.age
				     +"\n")
		.collect(Collectors.toList());
		
	System.out.println(newList);
	
		 

	}

}
