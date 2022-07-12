package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 18;
		int counter = 0;
		for (int i=2 ; i<n-1 ; i++)
		{			
			if (n%i == 0)
			{				
				counter = 1;		
			}
		}
		if (counter == 1)
		{
			System.out.println(n+ " is not a prime no");
			
		}
		else
		{
			System.out.println(n+ " is a prime no");
			
		}
	}

}
