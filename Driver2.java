
public class Driver2 {

	public static void main(String[] args) {
		//Car obj = new Maruti800();
		Car obj = CarFactory.getCar();
		obj.gears();
		obj.window();
		
	}

}
