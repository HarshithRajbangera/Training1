package placement;

public class IPAddress {
	public static boolean isValid(String ip) {
		
		String[] parts=ip.split("\\.");
		
		if(parts.length!=4) {
			return false;
		}
		
		for(String part:parts) {
			
			if(!part.matches("\\d+")){
				return false;
			}	

			int num=Integer.parseInt(part);
			
			if(num<0 || num>255 || !part.equals(String.valueOf(num))) {
				return false;
			}		
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		String ip="222.211.111.111";
		
		System.out.println(isValid(ip));

	}

}
