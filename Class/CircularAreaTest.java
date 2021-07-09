package Class;

public class CircularAreaTest {

	public static void main(String[] args) {
		
		CircularArea a = new CircularArea(8.0);
		a.pi = 10;
		
		System.out.println(a.Area());

		CircularArea a2 = new CircularArea(5.0);
		a2.pi = 7;
				
				System.out.println(a2.Area());
	}
}
