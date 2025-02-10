package placement;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("ENter the size of array:");
		int n=sc.nextInt();
		
		int sales[]=new int[n];
		
		System.out.println("ENter the value of array:");
		
		for(int i=0;i<sales.length;i++) {
			sales[i]=sc.nextInt();
		}
		
		for(int i=1;i<sales.length;i++) {
			sales[i]=sales[i]+sales[i-1];
		}
		
		for(int i=0;i<sales.length;i++) {
			System.out.print(sales[i]+" ");
		}
	}

}
