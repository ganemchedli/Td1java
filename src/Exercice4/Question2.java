package Exercice4;
import java.util.Scanner;
public class Question2 {
   public static int printSum(int x , int y) {
	   return x+y;
   }
   public static void main(String args[]) {
	   Scanner obj = new Scanner(System.in);
	   int x = obj.nextInt();
	   int y = obj.nextInt();
	   int sum = printSum(x,y);
	   System.out.println(sum);
   }
}
