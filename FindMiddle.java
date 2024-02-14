package LinkedList;

class Node1 {
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedList1{
	Node1 head;

	public void add(int i) {
		Node1 node = new Node1(i);
		if(head == null) {
			head = node;
		}else {
			Node1 n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {
		System.out.println("List is : ");
		Node1 n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}

	public void printMiddleIndex() {
		Node1 n = head;
		int count = 0;
		Node1 mid = head;
		while(n != null) {
			if(count % 2 == 1) {
				mid = mid.next;
			}
			count++;
			n = n.next;
		}
		System.out.println("Size is : "+count);
		System.out.println("Middle index is : "+count/2);
		System.out.println("Middle element is : "+mid.data);
	}

	public void printMiddleEle() {
		Node1 slowIndex = head;
		Node1 fastIndex = head;
		int count = 0;
		while(fastIndex!=null  && fastIndex.next !=null) {
			slowIndex = slowIndex.next;
			fastIndex = fastIndex.next.next;
			count++;
		}
		System.out.println("Middle ele is : "+slowIndex.data);
		System.out.println("Middle index is : "+count);
	}
}

public class FindMiddle {

	public static void main(String[] args) {
		LinkedList1 ll = new LinkedList1();
		
		for(int i =1; i<=6;i++) {
			ll.add(i);
		}
		
		ll.show();
		//ll.printMiddleIndex();
		ll.printMiddleEle();
	}

}
