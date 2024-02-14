package LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
};

public class LinkedList {
	Node head;

	
	
	public void show() {
		System.out.print("List is : ");
		Node n = head;
		while(n !=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void show1(){
		System.out.println("Show1 list is: ");
		Node n = head;
		if(n!=null) {
			if(n.next == null) {
				System.out.print(n.data+" ");
			}else {
				while(n.next !=null) {
					System.out.print(n.data+" ");
					n = n.next;
				}
				System.out.println(n.data+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.show1();
		
		linkedList.add(4);
		linkedList.show();
       
		linkedList.add(5);
		linkedList.add(6);
		linkedList.show();
		
		linkedList.addFirst(3);
		linkedList.show();
		
		linkedList.add(2,9);
		linkedList.add(0,1);
		linkedList.add(1,2);
		linkedList.add(4,8);
		linkedList.show();
		
		linkedList.remove();
		linkedList.show();
		
		linkedList.remove(4);
		linkedList.show();
	}

	private void remove(int index) {
		Node node = head;
		if(index == 0) {
			head = head.next;
		}else {
			for (int i = 0; i < index -1; i++) {
				node = node.next;
			}
			Node remove = node.next;
			node.next = node.next.next;
			remove = null;
		}
	}

	private void remove() {
		head = head.next;
	}

	public void add(int data) {
		Node node = new Node(data);
		if(head == null){
			System.out.println("Adding head : "+node.data);
			head = node;
		}else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	private void add(int index, int data) {
		Node node = new Node(data);
		if(index == 0) {
			node.next = head;
			head = node;
		}else {
			Node n = head;
			for (int i = 0; i < index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	private void addFirst(int data) {
		System.out.println("AddFirst");
		Node node = new Node(data);
		
		//Node n = head;
		node.next = head;
		head = node;
		
	}

	public void printMiddle() {
		Node n = head;
		int count = 0;
		Node mid = head;
		while(n!=null) {
			if(count %2 ==1) {
				mid = mid.next;
			}
			count++;
			n = n.next;
		}
		System.out.println("Method1 - Middle ele is at index "+count+" and ele is : "+mid.data);
	}

	public void reverse(LinkedList ll) {
		Node current = head;
		Node next = null;
		Node prev = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}


}
