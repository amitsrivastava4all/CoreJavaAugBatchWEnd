import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id ");
		int id = s.nextInt();
		System.out.println("Enter the Name");
		String name = s.next();
		System.out.println("Enter the Salary");
		double salary = s.nextDouble();
		Employee emp = new Employee(id, name, salary);
		String result = emp.salarySlip("\t", "\n");
		System.out.println(result);
		s.close();

	}

}
