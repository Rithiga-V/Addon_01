package Session4;

import java.lang.reflect.Constructor;

public class ConstructorOverloadingEx {

	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverloadingEx(String empname, int empid, String location) {
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	public ConstructorOverloadingEx(String empname, String location) {
		this(empname,0,location);//call invoke using this keyword
	}
	
	public ConstructorOverloadingEx(String empname, int empid) {
		this(empname,empid,null);
	}
	
	public void displayInfo() {
		System.out.println("Empname: "+this.empname);
		System.out.println("Empid: "+this.empid);
		System.out.println("Emp Location: "+this.location);
	}

	
	
	
	public static void main(String[] args) {
		ConstructorOverloadingEx cox = new ConstructorOverloadingEx("Rithiga",23455,"Tirupur");
		ConstructorOverloadingEx cox1 = new ConstructorOverloadingEx("Anitha","Saravanampatti" );
		ConstructorOverloadingEx cox2 = new ConstructorOverloadingEx("Suri", 2655567);
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	}
}
