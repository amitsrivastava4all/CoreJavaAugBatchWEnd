
public class RecursionDemo {
	static int fact(int n){
		if(n==1 || n==0) {
			return 1;
		}
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = fact(5);
		System.out.println(result);
	}

}
