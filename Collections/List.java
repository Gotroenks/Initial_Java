package Collections;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList<User> Listing = new ArrayList<>();
		
		Listing.add(new User("Pixega"));
		Listing.add(new User("É"));
		Listing.add(new User("Uma"));
		Listing.add(new User("Pitola"));
		
		System.out.println(Listing.get(0)); // Acessa pelo índice
		
		Listing.remove(2);
		Listing.remove(new User("É"));
		
		if(Listing.contains(new User("Pixega")) == true) {
			
			System.out.println("Tem sim meu querido, fica tranks");
		}
		
		for (User user : Listing) {
			
			System.out.println(user);
		}
		
	}
}
