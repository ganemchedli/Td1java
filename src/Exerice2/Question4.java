package Exerice2;

import java.util.ArrayList;

public class Question4 {
    static int  var = 0 ;
	static ArrayList<Integer> tab = new ArrayList<Integer>() ;
    
	public static void main(String args[]) {
		for(int i = 1 ; i < 51 ; i++) {
			if(i%2==0) {
				tab.add(i+1);	
			}else {
				tab.add(i);
			}	
		}
		
		for(int i = 1 ; i < 51 ; i++) {
			var+=tab.get(i);
		}
		
		for(int i = 1 ; i < 51 ; i++) {
			System.out.println(tab.get(i));
		}
		
	}

}
