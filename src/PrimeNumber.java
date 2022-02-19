import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int i,m=0;      
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.print("Enter the number: ");  
			int n=scanner.nextInt();     
			m=n/2;
		
			if(n==0||n==1) //0 & 1 is not considered as Prime Number
			{  
				System.out.println(n+" is not prime number");      
			}
			else
			{  
				for(i=2;i<=m;i++)
				{      
					if(n%i==0)
					{      
						System.out.println(n+" is not prime number");      	      
						break;      
					}  
					else
					{
						System.out.println(n+" is prime number");
						break;
					}
				}      
			}//end of else  
		}
	}

}
