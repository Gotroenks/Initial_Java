package Class;

public class Product {

	String Name;
	double price; 
	static double discount = 0.25;

	Product(String InitialName, double InitialPrice) {
		// passando par�metro para outro arquivo //passando par�metro para outro arquivo

		Name = InitialName;
		price = InitialPrice;
	}
	
	Product() {

		// Construtor padr�o atribuido novamente, programa volta a funcionar sem
		// men��o do contrutor explicito (Par�metros)
	}

	double DiscountWithPrice(/* double Price, double Discount */) {

		var Value = (float) price * (1 - discount);
		return Value;
	}
}
