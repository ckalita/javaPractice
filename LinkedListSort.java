import java.util.List;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListSort {
	Node head;

	public static void main(String[] args) {
		LinkedListSort list = new LinkedListSort();
		
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);
		list.print();
		
		list.sort();
		System.out.println("After sort");
		list.print();
	}

	private void sort() {
		Node current = head;
		Node index = head;
		
		while(current !=null) {
			index = current.next;
			
			while(index!=null) {
				if(current.data > index.data) {
					int temp = current.data;		
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
		}
	}

	private void print() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data +" ->");
			current = current.next;
		}
		
	}

	private void add(int i) {
		Node node = new Node(i);
		
		if(head == null) {
			node.next = head;
			head = node;
			
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		
	}

}
