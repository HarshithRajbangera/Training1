//A sales company wants to analyze daily sales data. Given an array of sales numbers, find the day with the highest sales.

package placement;

import java.util.Scanner;

public class HighSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total days");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the sales for "+n+" days");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The sales of "+n+" days:");
		
			for(int i=0;i<n;i++) {
				System.out.println("day["+(i+1)+"] sales is "+arr[i]);
			}
		
		int max=arr[0];
		int day=0;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				day=i;
			}
		}
		
		System.out.println("The highest sale is in day "+(day+1)+" with sales of "+max);

	}

}
