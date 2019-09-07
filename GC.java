
public class GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Amit";
		//String name2  = name;
		// 1st Case
		name = null;
		System.out.println();
		String name2 = "Ok";
		String name3="cancel";
		// 2nd case
		name3 = name2;
		// 3rd case
		if(10>2) {
			String z = "Hello";
		}
		System.gc();

	}

}
