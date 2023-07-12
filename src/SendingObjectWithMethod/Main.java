package SendingObjectWithMethod;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog("Comar", 1.5);
		
		Animal animal =new Animal();
		
		Cat cat =new Cat();
		
		
		animal.feature(dog,cat);
		System.out.println();
		
		animal.feature(cat);
		System.out.println();
		
		animal.feature(dog);

	}

}
