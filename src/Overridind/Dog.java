package Overridind;

public class Dog extends Animal{

	@Override  // we need to put this only because maybe other users would know this is over riding
	void speak() {
		System.out.println("Dogs barks");
	}
}
