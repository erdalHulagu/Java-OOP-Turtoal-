package SuperClass;

public class Students extends SchoollClass {
	
//	public Students(String className, int sujectOfLesson) {
//		super(className, sujectOfLesson);
//	}
	String nameOfStudent;
	int age;
	
	public Students(String clasName, String subjectOfClass,String nameOfStudent, int age) {
		super(clasName, subjectOfClass);
		this.age=age;
		this.nameOfStudent=nameOfStudent;
		
	}

	// creating method to call from Student class with Super key 
	// and added local fielsd which are age and namsOfStudent
	
	public String open() {
		
return super.toString()+this.age+this.nameOfStudent;

	
	}
}
