package Class;

public class NullValue {

	public static void main(String[] args) {
		
		String Name = "";
		
		System.out.println(Name.concat("é mole"));
		
		String Name2 = null;
		System.out.println(Name2);
		
		// System.out.println(Name2.equals(Name));
		// Objetos não inicializados (diferentes do valor padrão),
		// não podem ser atribuidos a outros valores até que seja inicializado
		// com um valor diferente
	}
}
