package Abstraction;

public class Main {
	
	
public static void main(String[] args) {
	
	// abstract =  abstract classes cannot be instantiated but they can have subClasess
	//             Abstract methods do not specify a body
	//            abstract methods are declared without an implementation
	
	Car car =new Car();
	car.feature();
	System.out.println(car.go());
}
}
