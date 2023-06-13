package session.seven.Interface.com;

public class Cat implements Animal,WildAnimal{

	@Override
	public void roam() {
		System.out.println("single huntting");
		
	}

	@Override
	public void speed() {
		System.out.println("speed of cat is 40km/h");
		
	}


	@Override
	public void eat() {
		System.out.println("milk");
		
	}

	@Override
	public void sound() {
		System.out.println("meow meow");
		
	}
	

}
