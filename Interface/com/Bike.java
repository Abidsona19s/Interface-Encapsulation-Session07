package session.seven.Interface.com;

public class Bike implements VehicleInterface,Sports{

	@Override
	public void activateHighSpeed() {
		System.out.println("activating high speed");
		
	}

	@Override
	public void changeGear() {
		System.out.println("change the gear");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("applying break");
		
	}
	
}
