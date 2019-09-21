
public class Employee {
	private int id;
	private String name;
	private double salary;
	
	Employee(int id, String name, double salary ){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String salarySlip(String deli, String newLine) {
		return deli+" Salary Slip "+newLine+
				deli+" Id "+id+newLine+
				deli+" Name "+name+newLine+
				deli+" Salary "+salary+newLine+
				deli+" Hra "+hra()+newLine+
				deli+" Da "+da()+newLine;
	}
	private double ns() {
		return gs() - pf() ;
	}
	private double gs() {
		return salary + hra() + da() + ta() ;
	}
	private double pf() {
		return (salary * 0.05)*2;
	}
	private double ta() {
		return salary * 0.20;
	}
	private double da() {
		return salary * 0.10;
	}
	private double hra() {
		return salary * 0.30;
	}

}
