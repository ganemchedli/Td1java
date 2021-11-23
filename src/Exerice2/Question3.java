package Exerice2;
import java.util.* ; 
public class Question3 {
	static int var = 0 ;
	static ArrayList<Integer> tab = new ArrayList<Integer>() ;
    
	public static void main(String args[]) {
		for(int i = 0 ; i < 31 ; i++) {
			tab.add(var);
			var++ ; 
		}
		for(int i = 0 ; i < 31 ; i++) {
			System.out.println(tab.get(i));;
		}
	}

}
