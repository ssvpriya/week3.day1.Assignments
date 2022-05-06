package week3.day1.Assignment3;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("Deposited amount for axis bank is rs 5000");
		super.deposit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
		

	}

}
