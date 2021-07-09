package Fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumber {

	public static void main(String[] args) {
		
		String Name = JOptionPane.showInputDialog(
				"Digite um nome: ");
		String Name2 = JOptionPane.showInputDialog(
				"Digite um segundo nome: ");
		
		System.out.println(Name + Name2);
	
		double num1 = Double.parseDouble(Name);
		double num2 = Double.parseDouble(Name2);
		
		System.out.println(num1 + num2);
		
	
	}
}
