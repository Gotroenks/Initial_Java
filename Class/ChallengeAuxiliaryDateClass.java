package Class;

public class ChallengeAuxiliaryDateClass {

	int day, mouth, year;

	String FormatedDate() {
				
		return String.format("%d/%d/%d", day, mouth, year);
	}
	
	ChallengeAuxiliaryDateClass(Integer Day, Integer Mouth, Integer Year){
		
		day = Day;
		mouth = Mouth;
		year = Year;
	}
	
	ChallengeAuxiliaryDateClass(){
		
		day = 1;
		mouth = 1;
		year = 1970;
	}
}
