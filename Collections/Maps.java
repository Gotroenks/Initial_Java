package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> Users = new HashMap<>(); 
	
		//put -> insere e troca;
		Users.put(1, "Pitola");
		Users.put(2, "Pixega");
		Users.put(3, "Pitola");
		Users.put(4, "Pixega");
		Users.put(5, "Pitola");
		Users.put(6, "Pixega");
		Users.put(7, "Pitola");
		Users.put(8, "Pixega");
		
		System.out.println(Users.size());
		System.out.println(Users.isEmpty());
		System.out.println(Users.keySet());
		System.out.println(Users.entrySet());
		
		System.out.println(Users.containsKey(3));
		System.out.println(Users.containsValue("Pixega"));
		
		System.out.println(Users.get(2));
		System.out.println(Users.remove(3));
		System.out.println(Users.remove(3, "Test"));
		
		System.out.println("\n\n");
		
		for (int key : Users.keySet()) {
			
			System.out.println(key);
		}
		
		System.out.println("\n\n");

		for (String value : Users.values()) {
			
			System.out.println(value);
		} 
		
		System.out.println("\n\n");

		for(Entry<Integer, String> registers : Users.entrySet()) {
			
			System.out.print(registers.getKey());
			System.out.println("\t" + registers.getValue());
		}
	}
}
