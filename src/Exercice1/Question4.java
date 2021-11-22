package Exercice1;
import java.util.*;

public class Question4 {
	public static void main(String args[] ) {
		Random rand1 = new Random() ;
		Random rand2 = new Random() ;
		int number1 = rand1.nextInt();
		int number2 = rand2.nextInt();
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number1+number2);
		System.out.println(Math.max(number1,number2));
		
	}
}
