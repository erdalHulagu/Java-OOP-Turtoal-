package SuperClass;

public class SchoollClass {
	
	String className;
	String sujectOfLesson;
	
	public SchoollClass(String className, String sujectOfLesson) {
		this.sujectOfLesson=sujectOfLesson;
		this.className=className;
		
	}
	
	// creating METHOD to call from Student class with Super() key 
	public String toString() {
return this.className +"\n"+ this.sujectOfLesson+"\n";
		
	}

}
