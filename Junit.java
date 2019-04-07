package test;

public class Junit {
	
	public int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
	
	public int sumOdds(int sum) {
		
		sum = 0;
		 
		for (int i = 1; i <=10 ; i++) 
		{
			if (i % 2 != 0) 
			{
				sum += i;
			}
		}
		System.out.println("The Sum Of 100 Odd Numbers are:" + sum);
		return sum;
	}
	
	public String ConcateTextthat(String s1, String s2)
	{
		String s3 = s1+s2;
		return s3;
	}
}