package Exercice4;
import java.util.Scanner;

public class Question1 {
   public static void print(int x, int y) {	  
	   System.out.println(x);
	   System.out.println(y);
   }
   
   public static void main(String args[]) {
	   Scanner obj = new Scanner(System.in);
	   int x = obj.nextInt() ; 
	   int y = obj.nextInt() ;
	   print(x,y);
   }
}
