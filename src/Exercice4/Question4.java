package Exercice4;
import java.util.Random;

public class Question4 {
   public static void randomNumbers() {
	   Random rand = new Random();
	   int upperbound = 30 ;   
	   int x = rand.nextInt(upperbound);
	   int y = rand.nextInt(upperbound);
       System.out.println(x);
       System.out.println(y);
       System.out.println("the maximum number is :");
       System.out.println(Math.max(x,y));
       System.out.println("the sum is :");
       System.out.println(x+y);
   }
   public static void main(String arg[]) {
	   randomNumbers();
   }
}
