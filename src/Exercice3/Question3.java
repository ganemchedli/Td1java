package Exercice3;
import java.util.*;

public class Question3 {
   public static void main(String args[]) {
	   Scanner input = new  Scanner(System.in);
	   String str = input.nextLine();
	   String rts = "" ;
	   for(int i = 0 ; i < str.length() ; i++) {
		   rts+=str.charAt(str.length()-i-1) ; 
	   }
	   System.out.println(rts);
	   if(str.equals(rts)) {
		   System.out.println("palindrome");
	   }else {
		   System.out.println("not");
	   }
   }
}
