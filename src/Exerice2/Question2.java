package Exerice2;
import java.util.*;

public class Question2 {
	private static ArrayList<Integer> tab = new ArrayList<Integer>()  ; 
  public static void main(String args[]) {
	  Random rand = new Random() ; 
	  for(int i = 0 ; i < 10 ; i++) {
		 tab.add(rand.nextInt(25)) ; 
	  }
	  for(int i = 0 ; i<tab.size(); i++) {
		  System.out.println(tab.get(i));
	  }
  }
}
