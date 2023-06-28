package week2.day3assignments;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("child deposit");
		
	}
 public static void main(String[] args) {
	 
	 AxisBank as = new AxisBank();
	 as.fixed();
	 as.saving();
	 as.deposit();
	
}
}
