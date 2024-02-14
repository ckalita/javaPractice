import java.util.Date;

//final class which cant be extended
final class CustomImmutable {
	
	//private and final member
	private final String name;
	private final int regNo;
	private final Date date;
	
	//parameterized constructor
	public CustomImmutable(String name, int regNo, Date date) {
		this.name = name;
		this.regNo = regNo;
		
		//deep copy of any immutable object/member instead of using it directly
		this.date = (Date) date.clone();
		//this.date = date;
	}
	
	//only getter
	public String getName() {
		return name;
	}
	
	public int getRegNo() {
		return regNo;
	}
	
	public Date getDate() {
		//deep copy of any immutable object/member instead of using it directly
		return (Date) date.clone();
		//return date;
	}
}

public class CheckImmutable{
	public static void main(String[] args) {
		
		String name = "Chandan";
		int regNo = 1;
		Date date = new Date("01/20/2022");
		CustomImmutable customImmutable = new CustomImmutable(name, regNo, date);
		System.out.println(customImmutable.getName()+" : "+customImmutable.getRegNo()+" : "+customImmutable.getDate());
		name = "pallabi";
		regNo = 2;
		date.setYear(2021);
		System.out.println(customImmutable.getName()+" : "+customImmutable.getRegNo()+" : "+customImmutable.getDate());
		
	}
	
}
