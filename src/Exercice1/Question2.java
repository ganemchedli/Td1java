package Exercice1;

import java.util.Scanner;

public class Question2 {
	public static void main(String args[] ) {
		Scanner myObj1 = new Scanner(System.in);
		Scanner myObj2 = new Scanner(System.in);
	    
		System.out.println("Type the First integer");
		String obj1 = myObj1.nextLine() ;
		System.out.println("Type the Second integer");
		String obj2 = myObj2.nextLine() ;
		int number1 = Integer.parseInt(obj1);
		int number2 = Integer.parseInt(obj2);
		System.out.println("The Sum is :");
		System.out.println(number1+number2);
		
	}

}
