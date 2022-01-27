package Orderstatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Order {

	
	public static void main(String[] args) {
		int[] arr = {12,5,3,19,7};
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENter K:");
			int k = sc.nextInt();
			
			
			int output = Order.Order(arr, k);
			System.out.println(output);
		}
	}
	
	
	static int Order(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}
}
