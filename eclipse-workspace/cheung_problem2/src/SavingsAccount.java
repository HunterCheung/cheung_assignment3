
public class SavingsAccount {
	public static double annualInterestRate=0.0;
	private double savingsBalance;
	
	public SavingsAccount(double amt) {
		this.savingsBalance = amt;
	}
	
	public void calculateMonthlyInterest() {
		double interest;
		interest= (this.savingsBalance *(annualInterestRate/100))/12;
		this.savingsBalance += interest;
	}
	
	public static void modifyInterestRate(double Rate) {
		annualInterestRate = Rate;
	}
	
	public void showBalance() {
		System.out.printf("$%.2f",this.savingsBalance);
	}
}
