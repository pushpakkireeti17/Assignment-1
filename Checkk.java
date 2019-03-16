class Checkk
{
	int a,i;
	final result=10;// it gives error that we cannot assign value to final variable
	public float Average(int a)
	{
		for(i=1;i<=a;i++)
		{
			result =result+i;
		}
		float avg=(result/a);
		return avg;
	}
public static void main(String args[])
{
	Checkk obj=new Checkk();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number");
	int a=s.nextInt();
	System.out.println(obj.Average(a));
}
}*/
/*class Checkk
{
	static int a;
	int result=0,i;
	public float Average(int a)
	{
		for(i=1;i<=a;i++)
		{
			result =result+i;
		}
		float avg=(result/a);
		return avg;
	}
public static void main(String args[])
{
	Checkk obj=new Checkk();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number");
	int a=s.nextInt();
	System.out.println(obj.Average(a));
}
}*/

/*class Checkk
{
	int a,result=0,i;
	public Checkk(int a)
	{
		this.a=a;
	}
	public float Average()
	{
		for(i=1;i<=a;i++)
		{
			result =result+i;
		}
		float avg=(result/a);
		return avg;
	}
public static void main(String args[])
{
	Checkk obj=new Checkk();// it says that argument is required 
	System.out.println(obj.Average());
}
}
