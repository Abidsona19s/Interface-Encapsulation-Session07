package session.seven.Interface.com;

public class DividedZeroEncapsulation {

	public static void main(String[] args) {
		System.out.println(" divided by zero");int a=30,b=0,r=0;
		try {
		r=a/b;
		System.out.println(r);
		}
		catch(ArithmeticException ae )
		{
		System.out.println("can not divided by zero posible"+ae);
		}
	}

}
