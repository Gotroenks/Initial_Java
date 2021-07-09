package Fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
		//Scanner enter = new Scanner (System.in);
		
		//byte
		Byte b = 127;
		Short s = 1000;
		
		Integer i = 10000; // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123F;
		
		System.out.println(f);
		
		Double d = 1234.20;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character cha = '@';
		
		System.out.println(cha.toString()); // char
		
		//enter.close();
	}
}
