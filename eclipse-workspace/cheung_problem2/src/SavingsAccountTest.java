
public class SavingsAccountTest {
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		SavingsAccount.modifyInterestRate(4.0);
		System.out.println("Month \t\t Saver 1 \t  Saver 2");
		for(int month=1;month<=12;month++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.print("Month "+month+": \t");
			saver1.showBalance();
			System.out.print("\t");
			saver2.showBalance();
			System.out.println();
		}
		SavingsAccount.modifyInterestRate(5.0);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.print("Month 13 @ 5%: \t");
		saver1.showBalance();
		System.out.print("\t");
		saver2.showBalance();
		System.out.println();
	}
}
