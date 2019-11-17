import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDemo {
	static Scanner s = new Scanner(System.in);
	static int firstNumber;
	static int secondNumber;
	static int result;
	static void takeFirstNumber() {
		try {
		System.out.println("Enter the First Number");
		 firstNumber = s.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("U Enter a number b/w 0-9 ");
			s.nextLine();
			takeFirstNumber();
		}
	}
	static void takeSecondNumber() {
		try {
		System.out.println("Enter the Second Number");
		 secondNumber = s.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("U Enter a number b/w 0-9 ");
			s.nextLine();
			takeSecondNumber();
		}
	}
	static void divide() {
		try {
			result = firstNumber / secondNumber;
		}
		catch(ArithmeticException e) {
			System.out.println("U Divide a Number with zero ");
			takeSecondNumber();
			divide();
		}
	}
	static void print() {
		System.out.println(result);
	}
	public static void main(String[] args) {
		
//		System.out.println("Enter the First Number");
//		int firstNumber = s.nextInt();
//		System.out.println("Enter the Second Number");
//		int secondNumber = s.nextInt();
//		int result = firstNumber / secondNumber;
//		System.out.println("Result is "+result);
		takeFirstNumber();
		takeSecondNumber();
		divide();
		print();
		s.close();

	}

}
