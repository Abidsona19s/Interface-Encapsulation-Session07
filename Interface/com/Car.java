package session.seven.Interface.com;

public class Car implements VehicleInterface {

	@Override
	public void changeGear() {
		System.out.println("change the gear");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("applying break");
		
	}
	

}
