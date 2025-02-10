package placement;

public class DistinctDigits {

	public static void main(String[] args) {
		
		int arr[] = {111, 222, 333, 4444, 666};
		boolean digits[]=new boolean[10];
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			
			while(num>0) {
				int digit=num%10;
				digits[digit]=true;
				num=num/10;
			}
		}
		
		boolean first =true;
		
		for(int i=0;i<10;i++) {
			if(digits[i]) {
				if(!first) {
					System.out.print(",");
				}
				System.out.print(i);
				first=false;
			}
		}
	}

}
