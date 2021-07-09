package Class;

public class Product {

	String Name;
	double price; 
	static double discount = 0.25;

	Product(String InitialName, double InitialPrice) {
		// passando parâmetro para outro arquivo //passando parâmetro para outro arquivo

		Name = InitialName;
		price = InitialPrice;
	}
	
	Product() {

		// Construtor padrão atribuido novamente, programa volta a funcionar sem
		// menção do contrutor explicito (Parâmetros)
	}

	double DiscountWithPrice(/* double Price, double Discount */) {

		var Value = (float) price * (1 - discount);
		return Value;
	}
}
