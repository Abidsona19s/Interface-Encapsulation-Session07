package session.seven.Interface.com;

public class VehicleInterfaceMain {

	public static void main(String[] args) {
		Car cr=new Car();
		System.out.println(" -----------creating car----------------");
		cr.changeGear();
		cr.applyBreak();
		System.out.println("------------creating bike--------------");
		Bike bk=new Bike();
		bk.activateHighSpeed();
		bk.changeGear();
		bk.applyBreak();

	}

}
