package SuperClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		Students student1=new Students("5 B","Maths" , "Mustafa", 18);
		Students student2=new Students("5 B","Maths" , "Ahmet", 18);
		Students student3=new Students("5 B","Maths" , "Ali", 18);
		
		
		
		List<Students>list=new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		
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
