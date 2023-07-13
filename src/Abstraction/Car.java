package Abstraction;

public class Car extends Vehicle {

	String name="Mercedes";
	int doors =4;
	
	@Override
	void feature() {
		
		System.out.println("This "+this.name+" has "+this.doors+" doors");
		
		
	}

	@Override
	String go() {
		
		return "i like to drive "+this.name;
	}

}
