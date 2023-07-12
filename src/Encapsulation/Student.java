package Encapsulation;

public class Student {
	 private String name;
	 private int age;
	 
	

	public int getAge() {
		return age;
	}

	public void setAge(int encapsuleAge) {
		age = encapsuleAge;
	}
//	public void setAge(int age) {  // field ismi ile  argumant olarak girilen obje ismi ayni oldugu zaman sistemin ayirt edebilmesi icin (this.age_) koyuyoruz
//		this.age = age;
//	}

	public String getName() {
		return name;
		
	}
	public void setName(String encapsuleName ) {
		name=encapsuleName;
	}

		
	
	
	
	 

}
