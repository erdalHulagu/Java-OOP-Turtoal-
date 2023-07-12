package inheritance1;

import java.util.ArrayList;
public class MercedesBClass extends MercedesAClass{
	MercedesAClass mercedesAClass =new MercedesAClass();
	public void name() {
		
		System.out.println(mercedesAClass.color ="blue" +
		(mercedesAClass.age =22));
		
	}
	
	public ArrayList<Object> name1() {
		
		
	String newColor=mercedesAClass.color="mavi";	
		String newFuel= mercedesAClass.fuel="super";
		String newModel=mercedesAClass.model="bmw";
		Object newAge =mercedesAClass.age;
		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add(newModel);
		arrayList.add(newFuel);
		arrayList.add(newColor);
		arrayList.add(newAge);
		return  arrayList;
		
	}
	
	
	

}



