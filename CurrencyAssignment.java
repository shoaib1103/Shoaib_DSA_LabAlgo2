package Currency;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyAssignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denomination");
		int size = scanner.nextInt();
		
		int[]denominations = new int [size];
		System.out.println("Enter the currency denominations values");
		for (int i = 0; i < size; i++) {
			denominations[i]= scanner.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = scanner.nextInt();
		
		Arrays.sort(denominations);
		reverseArray(denominations);
		
		System.out.println("Your payment approach in order to give the minimum number of notes will be");
		for (int i = 0; i<size; i++) {
			int count = amount/ denominations[i];
			if(count>0) {
				System.out.println( denominations[i] + ":"+ count);
				amount %= denominations[i];
				
			}
		}
		scanner.close();
	}
	public static void reverseArray(int[]arr) {
		int start = 0;
		int end = arr.length - 1;
		while ( start< end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
	}
	

}
