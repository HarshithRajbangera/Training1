package placement;

import java.util.*;


public class MaxMeeting {

	public static void main(String[] args) {
		
		
		int arr1[]= {1,3,0,5,8,5};
		int arr2[]= {2,4,6,7,9,9};
		
		List<Meeting> meetings=new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++) {
			meetings.add(new Meeting(arr1[i],arr2[i]));
		}
		
		Collections.sort(meetings,Comparator.comparingInt(m->m.end));
		
		int max=1;
		int last=meetings.get(0).end;
		
		for(int i=1;i<arr1.length;i++) {
			
			if(meetings.get(i).start>last) {
				max++;
				last=meetings.get(i).end;
				
			}
		}
		
		
		
		System.out.println("Total no of meeting:"+max);
		
	
	}

}
class Meeting{
	int start,end;
	
	Meeting(int start,int end){
		this.start=start;
		this.end=end;
	}
}
