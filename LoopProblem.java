package LinkedList;


class ListNode{
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class LoopProblem {
	ListNode head;
	
	public static void main(String[] args) {
		LoopProblem loopProblem = new LoopProblem();
		
		loopProblem.creatLoop();
		System.out.println("IS LOOP : "+loopProblem.detectLoop());
		
		loopProblem.startOfLoop();
		loopProblem.removeLoop();
		loopProblem.printList();
		
		loopProblem.reverseList();
		
		loopProblem.sort();
	}

	private void sort() {
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
		
		ListNode current = head;
		ListNode index = head;
		while(current !=null) {
			index = current.next;
			
			while (index != null ) {
				if(current.data > index.data) {
					int temp = current.data;
					current.data = index.data;
					index.data = temp;
					
				}
				index = index.next;
			}
			current = current.next;
		}
		
		System.out.println("After sort");
		printList();
		
	}

	private int removeLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				ListNode current = head;
				while(slowPtr.next != current.next) {
					current = current.next;
					slowPtr = slowPtr.next;
				}
				System.out.println("remove of loop : "+slowPtr.data);
				slowPtr.next = null;
				return 0;
			}
		}
		return 0;
	}

	private boolean startOfLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				ListNode current = head;
				while(current != slowPtr) {
					current = current.next;
					slowPtr = slowPtr.next;
				}
				System.out.println("starting of loop : "+slowPtr.data);
				return true;
			}
		}
		return false;
	}

	private boolean detectLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr == fastPtr) {
				System.out.println(slowPtr.data +" ; "+fastPtr.data);
				return true;
			}
		}
		return false;
	}

	private void creatLoop() {
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
		sixth.next = third;
		
		//printList(head);
	}

	private void reverseList() {
		ListNode current = head;
		ListNode next = null;
		ListNode prev = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
		printList();
	}

	private void printList() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

}
     