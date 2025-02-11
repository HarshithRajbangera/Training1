package placement;

public class StockPrice {

	public static void main(String[] args) {
		int[] arr =  {1, 3, 2, 4};
		int n=arr.length;
		
		int res[]=new int[n];
		
		for(int i=0;i<n;i++) {
			int max=arr[i];
			
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]>max) {
					res[i]=arr[j];
					break;
				}
				else {
					res[i]=-1;
				}
			}
		}
		res[n-1]=-1;
		
		for(int i=0;i<n;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
