
public class BMW implements Car {
	
	void powerWindow() {
		System.out.println("Power Window");
	}
	void automatic() {
		System.out.println("Automatic Gears");
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		powerWindow();
		
	}

	@Override
	public void gears() {
		automatic();
		// TODO Auto-generated method stub
		
	}

}
