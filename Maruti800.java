
public class Maruti800  implements Car {
	public void manualWindow(){
		System.out.println("Manual Window");
	}
	public void manualGears(int noOfGears){
		System.out.println("Manual Gears "+noOfGears);
		
	}
	@Override
	public void window() {
		manualWindow();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void gears() {
		manualGears(5);
		// TODO Auto-generated method stub
		
	}
}
