package lab18;

//Created by Brian Seyferth on 8/8/2018

import java.util.HashMap;

public class AlgorithmsApp {

	public static void main(String[] args) {
		
		
		//Created the test string of integers.
		int[] test = { 1, 2, 3, 2, 2, 4, 5, 5, 7, 8, 4, 4, 1, 0, 10 };
		
		
		//Frequency using the HashMap method.
	      HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
	        for(int i=0; i<test.length; i++){
	            if(hash.containsKey(test[i])){
	                hash.put(test[i], hash.get(test[i]) + 1);
	            } else {
	                hash.put(test[i], 1);
	            }
	        }
	        System.out.println(hash);
		
	      //Calculating frequency using an array.
			int[] sort = new int[11];
	        for(int i=0; i<test.length; i++) {
	            if (test[i] == 0) {
	            	sort[0]++;
	            } else if (test[i] == 1) {
	            	sort[1]++;
	            }else if (test[i] == 2) {
	            	sort[2]++;
	            } else if (test[i] == 3) {
	            	sort[3]++;
	            } else if (test[i] == 4) {
	            	sort[4]++;
	            } else if (test[i] == 5) {
	            	sort[5]++;
	            } else if (test[i] == 6) {
	            	sort[6]++;
	            } else if (test[i] == 7) {
	            	sort[7]++;
	            } else if (test[i] == 8) {
	            	sort[8]++;
	            } else if (test[i] == 9) {
	            	sort[9]++;
	            } else {
	            	sort[10]++;
	            }
	        }
	        
	        //prints out array frequency
	        System.out.println("Frequency chart:");
	        System.out.println("0: " + sort[0]);
	        System.out.println("1: " + sort[1]);
	        System.out.println("2: " + sort[2]);
	        System.out.println("3: " + sort[3]);
	        System.out.println("4: " + sort[4]);
	        System.out.println("5: " + sort[5]);
	        System.out.println("6: " + sort[6]);
	        System.out.println("7: " + sort[7]);
	        System.out.println("8: " + sort[8]);
	        System.out.println("9: " + sort[9]);
	        System.out.println("10+: " + sort[10]);
	        
	}

}
