package Control;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String Value = JOptionPane.showInputDialog("Informe um número: ");
		
		int Number = Integer.parseInt(Value);
		
		if(Number % 2 == 0) System.out.println("Par");
	
		else System.out.println("Impar");
	}
}
