
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x = 100.20;
		Student ram = new Student();
		ram.print();
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.course);
//		System.out.println(ram.duration);
//		ram.id = -1001;
//		ram.name = "Ram";
//		ram.course="C";
//		ram.duration=-2;
		ram.takeInput(1001, "Ram", "C", -2);
		ram.print();
		//System.out.println("**************************");
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.course);
//		System.out.println(ram.duration);
		
		

	}

}
