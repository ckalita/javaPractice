import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChangeProgram {

	public static void main(String[] args) {
		
		ChangeProgram(10, 20);
	}

	private static void ChangeProgram(double d, double e) {
		HashMap<Double, String> hm = new HashMap<Double, String>();
		
		hm.put(.01, "PENNY");
		hm.put(.02, "DIRHAM");
		hm.put(.05, "YEN");
		hm.put((double) 10, "DOLLAR");
		hm.put((double) 20, "EURO");
		hm.put((double) 100, "RUPEE");
		
		//DecimalFormat df = new DecimalFormat("#.##");
		double result = e-d;
		result = (double)Math.round(result * 100d) / 100d;
		System.out.println(result);
		
		if(result < 0) {
			System.out.println("ERROR");
		}
		
		if(result == 0)
			System.out.println("ZERO");
		
		for(Entry<Double, String> entry: hm.entrySet()) {
			Double key = entry.getKey();
			if(key <= result) {
				System.out.print(entry.getValue()+" ");
			}
		}
		
	}

}
