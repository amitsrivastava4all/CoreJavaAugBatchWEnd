import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int noOfInputs = s.nextInt();
		for(int i = 1; i<=noOfInputs; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			int sum = 0;
			for(int j = 0; j<=n-1 ; j++) {
				System.out.print("("+a+"+2^"+j+"*"+b+") ");
				//sum += a +  Math.pow(2, j) *b;
				//System.out.print(sum+" ");
			}
			System.out.println();
		}

	}

}
