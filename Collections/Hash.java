package Collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<User> user = new HashSet<>();
		
		user.add(new User("Pixega"));
		user.add(new User("Pitola"));
		user.add(new User("Pibao"));
		
	
		System.out.println(user.contains(new User("Pitola")));
		
		
	}
}
