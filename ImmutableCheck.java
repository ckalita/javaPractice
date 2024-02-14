package Practice;

import java.util.Date;

//final class so that no one can extend
final class CustomImmutable{
	
	private final String name;
	private final int age;
	private final Date dob;
	
	//public parameterized constructor
	public CustomImmutable(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = (Date)dob.clone();
		//this.dob = dob;
	}
	
	//only getter

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDob() {
		return dob;
		//return (Date)dob.clone();
	}
	
	
}


public class ImmutableCheck {
	public static void main(String[] args) {
		String name = "Chandan";
		int age = 37;
		Date date = new Date("01/20/2022");
		CustomImmutable customImmutable = new CustomImmutable(name, age, date);
		System.out.println(customImmutable.getName()+" : "+customImmutable.getAge()+" : "+customImmutable.getDob());
		name = "pallabi";
		age = 35;
		date.setYear(2021);
		System.out.println(customImmutable.getName()+" : "+customImmutable.getAge()+" : "+customImmutable.getDob());
		
	}

}
