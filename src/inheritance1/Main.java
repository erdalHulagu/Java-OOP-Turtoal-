package inheritance1;

public class Main {


	public static void main(String[] args) {
		MercedesBClass mercedesBClass = new MercedesBClass();
		
		System.out.println("fuel = "+mercedesBClass.fuel+"\n"+
				("model = "+mercedesBClass.model) + "\n"+"color = "+ mercedesBClass.color+"\n"+"age = "+mercedesBClass.age+" yers old");
		System.out.println("-------------------------------");
		
		//---------------------------
		System.out.println(mercedesBClass.fuel="motorin"+"\n"+
		(mercedesBClass.model="changed")+"\n"+mercedesBClass.color+"\n"+mercedesBClass.age+" yers old");
		System.out.println("-------------------------------");
	
	//---------------------------
		MercedesAClass mercedesAClass =new MercedesAClass();
	int age =	mercedesAClass.age;
	String fuel = mercedesAClass.fuel;
	String model =mercedesAClass.model;
	String color= mercedesAClass.color;
	
	System.out.println("model = "+model+ "\n"+"fuel = "+fuel+"\n"+"color = "+color+"\n"+"age = "+age);
		System.out.println("-------------------------------");
	
	
	//----------------------ArryListecevirdik----
	Object changedNameString1 = mercedesBClass.name1();
	System.out.println(changedNameString1);

	System.out.println("-------------------------------");
	
	mercedesBClass.setName1(model, fuel, color, age);
String newModel=model="Murat"; int newAge = age = 1; String newFuel=fuel="Mazot"; String newColor= color="red";
	System.out.println(newModel+"\n"+newAge+"\n"+newColor+"\n"+newFuel);

	System.out.println("-------------------------------");
	
	
	}

}
