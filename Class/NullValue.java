package Class;

public class NullValue {

	public static void main(String[] args) {
		
		String Name = "";
		
		System.out.println(Name.concat("� mole"));
		
		String Name2 = null;
		System.out.println(Name2);
		
		// System.out.println(Name2.equals(Name));
		// Objetos n�o inicializados (diferentes do valor padr�o),
		// n�o podem ser atribuidos a outros valores at� que seja inicializado
		// com um valor diferente
	}
}
