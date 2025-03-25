package Session4;

public class AccessEncapsulation {

	public static void main(String[] args) {
		Encapsulation ee = new Encapsulation();
		ee.setName("Rithiga");
		ee.setLocation("Tirupur");
		
		System.out.println(ee.getName());
		System.out.println(ee.getLocation());
	}
}
