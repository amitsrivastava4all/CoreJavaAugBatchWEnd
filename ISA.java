class Account extends Object{
	int id;
	String name;
	double balance;
	void deposit() {
		System.out.println("Account Deposit");
	}
}
class CurrentAccount extends Account{
	void roi() {
		System.out.println("Pay 5% ROI");
	}
}
class SavingAccount extends Account{
	void roi() {
		System.out.println("3% ROI");
	}
	void showPan() {
		System.out.println("Show Pan");
	}
	void limit() {
		System.out.println("Limit is 50K");
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.roi();
		sa.limit();
		sa.deposit();
		System.out.println("*********************");
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.roi();
		
		
	}

}
