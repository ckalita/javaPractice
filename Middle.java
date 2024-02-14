package LinkedList;

public class Middle {
	
	

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		for(int i=1; i<=5; i++) {
			ll.add(i);
		}
		
		ll.show();
		//printMiddle(ll);
		//deleteMiddle(ll);
		
		printMiddle1(ll);
		deleteMiddle1(ll);
		ll.show();
	}

	private static void printMiddle1(LinkedList ll) {
		Node slowIndex = ll.head;
		Node fastIndex = ll.head;
		int count = 0;
		while(fastIndex !=null && fastIndex.next !=null) {
			count++;
			slowIndex = slowIndex.next;
			fastIndex = fastIndex.next.next;
		}
		System.out.println("Method2 - Middle ele is at index "+count+" and ele is : "+slowIndex.data);
	}

	private static void deleteMiddle1(LinkedList ll) {
		Node midPtr = ll.head;
		Node prevPtr = null;
		Node fastPtr = ll.head;
		int count = 0;
		while(fastPtr!=null && fastPtr.next!=null) {
			prevPtr = midPtr;
			fastPtr = fastPtr.next.next;
			midPtr = midPtr.next;
			count++;
		}
		System.out.println("deleteMiddle1 - Middle ele is at index "+count+" and ele is : "+midPtr.data);
		
		prevPtr.next = midPtr.next;
		System.out.println("after DELETE");
		//ll.show();
		
	}



	

}
