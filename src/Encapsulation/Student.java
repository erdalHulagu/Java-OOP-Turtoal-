package Encapsulation;



public class Student {
	 private String name;
	 private int age;
	 
	
	 //1-
	 public Student() {
	}
	 
	 //2-
	 public Student(String name,int age) {
		 this.setName(name);
		 this.setAge(age);
		 
	 }
	
	 //3-
	public void copy(Student student) {
		this.setName(student.getName());
		this.setAge(student.getAge());

		
	}
	 //4-
	 // We can use copy method that we created in an constructor as below
	public Student( Student student){
		
		this.copy(student);
		 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int encapsuleAge) {
		age = encapsuleAge;
	}

	public String getName() {
		return name;
		
	}
	public void setName(String encapsuleName ) {
		name=encapsuleName;
	}

		
	
	
	
	 

}
