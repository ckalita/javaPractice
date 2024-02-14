package LinkedList;

class LNode {
	int data;
	LNode next;
	
	public LNode(int data) {
		this.data = data;
		this.next = null;
	}
}



public class MergeTwoList {
	LNode head;
	
	public static void main(String[] args) {
		//{ 1, 3, 4, 5}, b[] = {2, 4, 6, 8}
		
		MergeTwoList a = new MergeTwoList();
		a.add(1);
		a.add(6);
		a.add(4);
		//a.add(5);
		//list.createList();
		
		show(a.head);
		
		MergeTwoList b = new MergeTwoList();
		
		b.add(2);
		b.add(4);
		b.add(8);
		//b.add(8);
		//b.add(10);
		//b.add(12);
		
		show(b.head);
		
		//merge(a.head, b.head);
		
		LNode head = reverse(a.head);
		System.out.println("First reverse array : ");
		show(head);
		
		LNode head1 = reverse(b.head);
		
		System.out.println("Second reverse array : ");
		show(head1);
		
		add(head, head1);
		//add(a.head, b.head);
	}

	private static void add(LNode a, LNode b) {
		LNode dummy = new LNode(0);
		LNode tail = dummy;
		int carry = 0;
		while(a!=null && b!=null) {
			int x = (a!=null)?a.data:0;
			int y = (b!=null)?b.data:0;
			/*
			 * if(b !=null) { y = b.data; }else { y=0; }
			 */
			
			int sum = carry+x+y;
			carry = sum/10;
			
			tail.next = new LNode(sum%10);
			tail = tail.next;
			
			if(a!=null) a= a.next;
			if(b!=null) b= b.next;
		}
		if(carry > 0) {
			tail.next = new LNode(carry);
		}
		show(dummy.next);
	}

	private static LNode reverse(LNode head) {
		LNode current = head;
		LNode next = null;
		LNode prev = null;
		while(current !=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		
		//System.out.println(" reverse array : ");
		//show(head);
		
		return head;
	}

	private static void merge(LNode a, LNode b) {
		LNode dummy = new LNode(0);
		LNode tail = dummy;
		while(a!= null && b!= null) {
			if(a.data <= b.data) {
				tail.next = a;
				a = a.next;
			}else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if(a==null) {
			tail.next = b;
		}else {
			tail.next = a;
		}
		
		System.out.println("After merge");
		show(dummy.next);
	}

	private void add(int i) {
		LNode node = new LNode(i);
		if(head == null) {
			head = node;
		}else {
			LNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		
	}

	private void createList() {
		LNode first = new LNode(1); 
		LNode sec = new LNode(2); 
		LNode third = new LNode(3); 
		LNode fourth = new LNode(4); 
		LNode fifth = new LNode(5);

		head= first;
		first.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = fifth;
	}

	private static void show(LNode head) {
		LNode current = head;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}

}
