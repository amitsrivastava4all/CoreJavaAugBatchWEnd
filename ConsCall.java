import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

class A{
	void show() {
		System.out.println("I am A Show");
	}
	A(){
		System.out.println("A Cons Call");
	}
	A(int x){
		System.out.println("A Cons Param Call");
		
	}
	static {
		System.out.println("A Static call");
	}
}
class C{
	static {
		System.out.println("C Static call");
	}
	C(){
		System.out.println("C Cons Call");
	}
	C(int x){
		System.out.println("C Cons Param Call");
		
	}
}
class B{
	static {
		System.out.println("B Static call");
	}
	B(){
		System.out.println("B Cons Call");
	}
	B(int x){
		System.out.println("B Cons Param Call");
		
	}
}
public class ConsCall {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		System.out.println("Enter the class name");
		String className = new Scanner(System.in).next();
		Class.forName(className).newInstance();
		Class.forName(className)
		.getDeclaredConstructor(int.class)
		.newInstance(1000);
		//A1 obj = new A1();
		A obj = new A();
		obj.show();
//		A obj2 = new A(100);
		//new A(1000);
		new A().show();
		

	}

}
