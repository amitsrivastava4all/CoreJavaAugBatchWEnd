import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1000);
		l.add(10);
		l.forEach((ele)->System.out.println("Ele is "+ele));
//		for(Integer i : l) {
//			System.out.println(i);
//		}
		// Java 8
		
		//l.remove(0);
		//l = null;  // Eligable GC
		
		int arr [] = new int[100];
		//int arr [] = {10,20,30,40,50,90,100};
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// 1.5  Enhance for Loop
		for(int ele : arr) {
			System.out.println(ele);
		}
		
		

	}

}
