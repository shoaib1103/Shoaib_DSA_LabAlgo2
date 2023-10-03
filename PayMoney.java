package Currency;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array ");
		int size = scanner.nextInt();
		int[]transactions = new int [size];
		System.out.println("enter the values of array");
		for (int i = 0;i< size;i++) {
			transactions[i]= scanner.nextInt();
			
		}
		System.out.println("Enter the total number of targets that need to be achieved ");
		int totalTargets = scanner.nextInt();
	    for(int i = 1; i<= totalTargets; i++) {
	    	System.out.println("enter the value" + i + ":");
	    	int target = scanner.nextInt();
	    	
	    	int sum = 0;
	    	int transactionsRequired = 0;
	    	
	    	for (int j =0;j< size; j++) {
	    		sum += transactions[j];
	    		transactionsRequired++;
	    		
	    		if (sum>= target) {
	    			System.out.println("Target achieved after " + transactionsRequired + " transaction" + (transactionsRequired > 1 ? "s" : ""));
	    			break;
	    		}
	    		if(sum< target) {
	    			System.out.println("given target is not achieved");
	    			
	    		}
	    	}
	    }
		scanner.close();
		

	}
	
     
}
