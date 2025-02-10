package placement;

import java.util.Scanner;

public class Inversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the size of array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("ENter the value of array:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<arr.length;i++) {

			int inverse=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<inverse) {
					count++;
				}
			}
			
		}
		System.out.println("Inversion count is:"+count);
	}

}
