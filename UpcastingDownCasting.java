abstract class Loan{
	int amount;
	int duration;
	int id;
	abstract void emi();
		
	
	Loan(){
		System.out.println("Loan Class Default Cons");
	}
	Loan(int x){
		this();
		System.out.println("Loan Class Param Cons");
	}
	void gurantee() {
		System.out.println("Need gurantee");
	}
	void docSubmit() {
		System.out.println("Submit Doc");
	}
	void apply() {
		System.out.println("Apply for Loan");
	}
	void roi() {
		System.out.println("ROI 7%");
	}
}
class HomeLoan extends Loan{
	@Override
	void emi() {
		
	}
	HomeLoan(){
		super(100);
		// super();  // Implicit super call
		System.out.println("HL Default Cons");
	}
	HomeLoan(int x){
		this();
		//super(1000); // parent param cons call
		// super();  // Implicit super call
		System.out.println("HomeLoan Param Cons");
		//super(1000); 
	}
	@Override
	void roi() {
		System.out.println("ROI 9%");
	}
	void insurance() {
		System.out.println("Must Have Insurance in HL");
	}
	void security() {
		System.out.println("Give Security to HL");
	}
}
class AutoLoan extends Loan{
	@Override
	void roi() {
		System.out.println("ROI 11%");
	}
void depsecurity() {
		System.out.println("Dep Security in AL");
	}
@Override
void emi() {
	// TODO Auto-generated method stub
	
}
}
class PersonalLoan extends Loan{
	@Override
	void roi() {
		System.out.println("ROI 15%");
	}
	void lessDuration() {
		System.out.println("Less Duration in PL");
	}
	void highRisk() {
		System.out.println("High Risk in PL");
	}
	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}
}
class LoanCaller{
	void call(Loan loanObject) {
		
		loanObject.apply();
		loanObject.gurantee();
		loanObject.docSubmit();
		loanObject.roi();
		if(loanObject instanceof HomeLoan) {
			HomeLoan hl = (HomeLoan) loanObject; // Downcasting
			hl.insurance();
		}
		if(loanObject instanceof AutoLoan) {
			AutoLoan al = (AutoLoan) loanObject; // Downcasting
			al.depsecurity();
		}
		System.out.println("**********************");
		
		
	}
}
public class UpcastingDownCasting {

	public static void main(String[] args) {
		LoanCaller lc = new LoanCaller();
		//lc.call(new Loan());
		lc.call(new HomeLoan(1000));
		//lc.call(new AutoLoan());
		//lc.call(new PersonalLoan());
		// TODO Auto-generated method stub
		//AutoLoan al =new AutoLoan();
//		Loan al = new AutoLoan(); // Upcasting
//		al = new HomeLoan();
//		al.apply();
//		al.gurantee();
//		al.docSubmit();
//		al.roi();
//		al.depsecurity();
//		
//		HomeLoan hl =new HomeLoan();
//		hl.apply();
//		hl.gurantee();
//		hl.docSubmit();
//		hl.roi();
//		hl.insurance();
//		

	}

}
