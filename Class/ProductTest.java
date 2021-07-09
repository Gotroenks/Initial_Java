package Class;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("Computer", 4350.99); // Construtor explicito
		//p1.Name = "computer";
		//p1.price = 4350.99;
		//p1.discount = 0.5;
		
		var p2 = new Product(); // Construtor padrão
		p2.Name = "Motherboard";
		p2.price = 290.99;
		
		Product.discount = 0.25; // Desconto em ambos produtos
		
		System.out.println(p1.Name);
		System.out.println(p2.Name);
		System.out.println(p1.DiscountWithPrice());
		System.out.println(p2.DiscountWithPrice());
		//System.out.println(p1.discount);
		//System.out.println(p2.discount);
		
		// Metódo = tudo que tem parênteses == funções em C
		// Atributo = Todo o resto, definido por "."
	}
}
