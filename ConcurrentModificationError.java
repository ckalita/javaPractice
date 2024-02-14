import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationError {

	public static void main(String[] args) {
		/*
		 * List<String> list = new ArrayList<String>(Arrays.asList("a", "b","c","d"));
		 * 
		 * for(String value: list) { if(value.equals("c")) { list.remove(value); } }
		 * System.out.println(list);
		 */
		
		List<String> deviceList = new ArrayList<>();
		deviceList.add("tomcat");
		deviceList.add("IBM server");
		deviceList.add("Amazon server");
		System.out.println(deviceList);
		
		for(String name : deviceList){
			if(name.equals("tomcat")){
				//deviceList.remove(name);
				//deviceList.add("apache"); //concurrent modification exception
			}
		}
		
		Iterator<String> iterator = deviceList.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			if(s.equals("tomcat")){
				iterator.remove();
			}
		}
		System.out.println(deviceList);
		
	}

}
