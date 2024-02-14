package LinkedList;

public class FindNthEle {
	static ListNode head;
	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head= first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		printList();
		
		findNth(2); //5
		findNth(3); //4
		findNth(4); //3

	}

	private static void findNth(int n) {
		ListNode current = head;
		ListNode mainPtr = head;
		
		int count = 0;
		while(count < n) {
			current = current.next;
			count++;
		}
		
		while(current != null) {
			mainPtr = mainPtr.next;
			current = current.next;
		}
		
		System.out.println(mainPtr.data);
	}

	private static void printList() {
		ListNode current = head;
		
		while(current !=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
}
