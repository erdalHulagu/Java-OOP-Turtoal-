package Statics;

public class Student {
	
	String name;
	int age;
	
	static int numberOfStudents; // static field
	
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
		numberOfStudents++; // result 3
	
//			if (age >= 40) {
//			numberOfStudents++; // result 2
//			}
//				
		}
	
	// static method
	static void viewStudents () {
		
		System.out.println("we called static method = Students are "+numberOfStudents);
//		
	}
	

}
