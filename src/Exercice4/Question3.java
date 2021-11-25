package Exercice4;
import java.util.Scanner ;
public class Question3 {
   public static int max(int x , int y) {
	   return (x>y) ? x : y ; 
   }
   
   public static void main(String args[]) {
	   Scanner obj = new Scanner(System.in) ; 
	   int x = obj.nextInt() ; 
	   int y = obj.nextInt() ;
	   int max = max(x,y) ; 
	   System.out.println(max);
   }
}
