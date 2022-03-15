// This class holds the bank account details of a person.

public class SavingsAccount {
	private static float annualInterestRate;
	private float savingsBalance;
	private float monthlyInterest;

	

	public SavingsAccount(float balance) {
		this.savingsBalance = balance;
	}


	public static void modifyInterestRate(float interestRate) {
		annualInterestRate = interestRate / 100; 
	}

	public void calculateMonthlyInterest() {
		monthlyInterest = savingsBalance * annualInterestRate / 12;
		System.out.println("The monthly interest is: $" + monthlyInterest);
	}

	
	private void calculateSavings() {
		savingsBalance += monthlyInterest;
	}

	

	public void displaySavings() {
		calculateSavings();
		System.out.println("The total balance is : $ " + savingsBalance);
	}

}