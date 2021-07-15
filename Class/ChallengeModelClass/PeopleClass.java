package Class.ChallengeModelClass;

public class PeopleClass {

	String People;
	double Weight;
	
	PeopleClass(String People, double Weight) {
		
		this.People = People;
		this.Weight = Weight;
	}
	
	void eat(FoodClass Food) {
		
		if(Food != null) {
			
			this.Weight += Food.Weight;
		}
	}
	
}
