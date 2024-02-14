
public class SingleTon {
	
	//static member 
	private static SingleTon singleTon;
	
	//private constructor
	private SingleTon() {
		
	}
	
	//static method with class return type
	public static SingleTon getInstance() {
		if(singleTon == null) {
			synchronized (singleTon) {
				if(singleTon == null) {
					singleTon = new SingleTon();
				}
			}
		}
		
		return singleTon;
	}
}
