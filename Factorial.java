package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int fact = 1;
		for (int i = n; i >= 1 ; i--) {
			
				fact =i*fact;
			
		}
System.out.println("Factorial of number "+n+ " is " +fact);
	}

}
