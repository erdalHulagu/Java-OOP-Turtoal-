package SendingObjectWithMethod;

public class Animal {
	
	// we are sending object with 2 argumant 
	void feature(Dog dog, Cat cat) {
		System.out.println("The name of the dog is "+dog.name +" and it is "+dog.size+" meter tool");
		System.out.println("The name of the cat is "+cat.name+" and it is "+cat.size+" meter tool ");
		
	}
	// we are sending object with 1 argumant 
	void feature(Dog dog) {
		
		System.out.println("The name of the dog is "+dog.name +" and it is "+dog.size+" meter tool");
	}
	// we are sending object with 1 argumant 
void feature(Cat cat) {
		
	System.out.println("The name of the cat is "+cat.name+" and it is "+cat.size+" meter tool ");
	}

}
// THIS IS SENDING OBJECT WITH ARGUMANT AND OVERLOADING