package Exerice2;
import java.util.Random ;
import java.util.ArrayList ;
public class Question5 {
   
   static ArrayList<Integer> tab = new ArrayList<Integer>() ; 
   
   public static void main(String args[]) {
	   Random rand = new Random();
	   int upperbound = 25 ; 
	   for(int i = 0 ; i<10 ; i ++) {
		   tab.add(rand.nextInt(upperbound)) ; 
	   }
	   for(int i = 0 ; i < tab.size();i++) {
		   System.out.println(tab.get(i));
	   }
   }
   
}
