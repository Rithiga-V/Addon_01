package session5;

public class AbstractEmployee2 extends AbstractEmployeeEx {

	@Override
	public void futureDesignation() {
		System.out.println("Developer");
	}
	public static void main(String[] args) {
		AbstractEmployee2 ae = new AbstractEmployee2();
		ae.name();
		ae.designation();
		ae.futureDesignation();
		
	}
}
