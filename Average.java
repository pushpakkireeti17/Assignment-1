class Assignment
{
	int a,result=0,i;
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
	Assignment obj=new Assignment();
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number");
	int a=s.nextInt();
	System.out.println(obj.Average(a));
}
}