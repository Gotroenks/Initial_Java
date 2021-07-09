package Class;

public class CircularArea {

	double Lightning, pi;
	
	CircularArea(double InitialLightning) {
		
		pi = 3.14;
		Lightning = InitialLightning;
	}
	
	double Area() {
		
		return Lightning * Lightning * pi;
	}
}
