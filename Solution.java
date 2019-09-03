import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter the Number");
		int n = s.nextInt();
		if(n%2!=0) {
			System.out.println("Weird");
		}
		else
		if(n%2==0) {	
		if((n>=2 && n<=5)) {	
			System.out.println("Not Weird");
		}
		else
		if( (n>=6 && n<=20)) {	
			System.out.println("Weird");
		}
		else
		if(n>20) {	
			System.out.println("Not Weird");
		}
		}
		//System.out.println("N is "+n);
		s.close();

	}

}
