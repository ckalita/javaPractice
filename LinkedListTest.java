import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		   
        ll.add("Geeks");
        ll.add("Geeks");
        ll.set(1, "For");
        
       
        ll.add(1, "Chandan");
        System.out.println(ll);
        ll.set(1, "Pallabi");
        System.out.println(ll);
	}

}
