import java.util.*;
class Prime
{
	public static void main(String args[])
	{	
		Prime obj=new Prime();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		int count=0;
		if(a==1||a==0)
		System.out.println("Not a prime Number");
		else
		{
			for(int i=2;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;	
				}
			}
			if(count==1)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
			}	
		}
		
	}
}