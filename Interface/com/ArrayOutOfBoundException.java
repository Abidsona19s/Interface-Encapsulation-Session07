package session.seven.Interface.com;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		int a[]=new int[20];
		a[19]=230;
		System.out.println(a[19]);
		// array out of bound exception 
		try {
			a[20]=455;
			System.out.println(a[20]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("cant not posible");
		}

	}

}
