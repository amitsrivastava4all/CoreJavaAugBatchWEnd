interface X{
	void show(int x);
	
}
class Y implements X{
	public void show(int x) {
		System.out.println("Show Call");
	}
}
class T{
	class T1{
		
	}
}
public class InterfaceUse {

	public static void main(String[] args) {
		double e = Math.random();
		System.out.println(e);
		
		 e = Math.random() * 10;
		System.out.println(e);
		
		 e = Math.random() * 10;
		System.out.println(e);
		
		// TODO Auto-generated method stub
		X x3 =(int y)->System.out.println("I am Lambda Expression");
		x3.show(90);
		// During Object Creation we create a class
		
//		X x2 = new X() {
//			
//			@Override
//			public void show(int x) {
//				// TODO Auto-generated method stub
//				System.out.println("Anonymous class Show Call");
//				
//			}
//		};
//		x2.show(90);
//		X x2 = new X() {
//			public void show(int x) {
//				System.out.println("Show Call");
//			}
//		};
		Y obj = new Y();
		obj.show(900);

	}

}
