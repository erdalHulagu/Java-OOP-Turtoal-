package inheritance;

public class Main {

	public static void main(String[] args) {
		Car car =new Car();
		
		double carSpeed= car.speed=100.000;
		String carType= car.name="Mercedes";
		
		System.out.println(carType+" is " +carSpeed+" mill faster in an hour");
		
		System.out.println(car.wheels +"  ,"+ car.wheels);
		
		car.go();
		System.out.println("--------------------------");
	//-------------------------------------	
		
		
		MotorBike motorBike=new MotorBike();
		
		motorBike.stop();
		
		double morirBikeSpeed= motorBike.speed=70.0;
	String vehicleType=	motorBike.name=" scother";
		System.err.println(vehicleType+" is "+ morirBikeSpeed+" mil faster in one hour"); // error type

		System.out.println(motorBike.pedal+"  ,"+ motorBike.wheels);
	}

}
