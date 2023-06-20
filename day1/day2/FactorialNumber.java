package week1.day2;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1,2,6,24,120,720
		
		int num =6;
		int fact =1;
		
		
		for (int i = 1; i<=num; i++) {
			
			fact= fact*i;
			System.out.println(fact);
			
			
		}

	}

}
