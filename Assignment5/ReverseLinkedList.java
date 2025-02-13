package placement;
import java.util.*;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val){
		this.val=val;
		this.next=null;
	}
}

public class ReverseLinkedList {
	
	public static ListNode reverseList(ListNode head) {
		
		if(head==null) {
			return null;
		}
		
		List<ListNode> nodeList=new ArrayList<>();
		ListNode current=head;
		
		
		while(current!=null) {
			nodeList.add(current);
			current=current.next;
		}
		
		Collections.reverse(nodeList);
		
		for(int i=0;i<nodeList.size()-1;i++) {
			nodeList.get(i).next=nodeList.get(i+1);
		}
		
		nodeList.get(nodeList.size()-1).next=null;
		
		return nodeList.get(0);
	}
	public static void printList(ListNode head) {
		while(head!=null) {
			System.out.print(head.val+" ->");
			head=head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		ListNode head=new ListNode(1);
		
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		
		
		System.out.println("OriginalList::");
		printList(head);
		
		
		head=reverseList(head);
		
		System.out.println("ReversedList::");
		printList(head);
		
		
		

	}

}
