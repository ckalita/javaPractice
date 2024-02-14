package LinkedList;

public class ListSort {
	static ListNode head;
	
	public static void main(String[] args) {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(2);
		ListNode fifth = new ListNode(6);
		ListNode sixth = new ListNode(5);
		
		head= first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println("before sort");
		printList();
		
		sortList();
		System.out.println("After sort");
		printList();
		
		reverseList();
		System.out.println("After reverse");
		printList();
		
	}
	private static void reverseList() {
		ListNode current = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	private static void sortList() {
		ListNode current = head;
		ListNode index = head;
		
		while(current !=null) {
			index = current.next;
			while(index != null) {
				if(index.data < current.data) {
					int temp = index.data;
					index.data = current.data;
					current.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
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
