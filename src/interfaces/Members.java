package interfaces;

public class Members implements Family {

	@Override
	public void message() {
		System.out.println("im looking for interface");
		
	}
	
	public void fields() {
		System.out.println(name+age);
	}

}
