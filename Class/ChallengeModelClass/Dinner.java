package Class.ChallengeModelClass;

public class Dinner {

	public static void main(String[] args) {
		
		FoodClass f1 = new FoodClass("Chinken", 0.5);
		FoodClass f2 = new FoodClass("Bean", 0.2);
		
		PeopleClass P = new PeopleClass("Dória", 65.8); 
		
		P.eat(f1);
		P.eat(f2);
		
		System.out.println("The " + P.People + " eat " + f1.People + " and " 
							+ f2.Weight + " and new, have " + P.Weight + "Lb");
		
		P.eat(f1);
		P.eat(f2);
		
		System.out.println("The " + P.People + " eat " + f1.People + " and " 
				+ f2.Weight + " and new, have " + P.Weight + "Lb");
		
		P.eat(f1);
		P.eat(f2);
		
		System.out.println("The " + P.People + " eat " + f1.People + " and " 
				+ f2.Weight + " and new, have " + P.Weight + "Lb");
	}
}
