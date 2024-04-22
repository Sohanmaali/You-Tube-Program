import java.util.Scanner;
class CheckPrimeNumberOrNot{
	
	public static void main(String arg[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int count = 0;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Enter Number Is Prime");
		}
		else{
			System.out.println("Enter Number Is Prime not prime");
		}
	}
}