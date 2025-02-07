//An e-commerce platform wants to track product ratings. Given an array of product ratings, find the rating that appears most frequently.

package placement;

import java.util.Arrays;
import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total ratings");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the ratings(1 to 5):");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The ratings are");
			System.out.print("[");
		
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("]");
			
		//LOgic
			
		int maxCount=0;
		int freq=arr[0];
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				freq=arr[i];
			}
		}
		
		System.out.println("Rating of "+freq+" appeared "+maxCount+" times");

	}

}
