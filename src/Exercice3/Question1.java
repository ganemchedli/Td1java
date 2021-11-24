package Exercice3;
import java.util.*;

public class Question1 {
   public static void main(String args[]) {
	   Scanner myObj = new Scanner(System.in) ;
	   String string1 = myObj.nextLine();
	   String string2 = myObj.nextLine();
	   if(string1.equals(string2)) {
		   System.out.println("true");
	   }else {
		   System.out.println("false");

	   }
   }
}
