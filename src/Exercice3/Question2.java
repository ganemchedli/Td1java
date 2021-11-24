package Exercice3;
import java.util.*;

public class Question2 {
   private static String newStr;

public static void main(String args[]) {
	   Scanner myObj=new Scanner(System.in);
	   String str = myObj.nextLine() ;
	   char c = myObj.next().charAt(0);
	   for(int i = 0 ; i<str.length() ; i++) {
		   char cStr = str.charAt(i) ; 
		   if(cStr == c ) {
			   newStr = str.substring(0,i)+' '+str.substring(i+1);
			   break ; 
		   }
	   }
	   System.out.println(newStr);
   }
}
