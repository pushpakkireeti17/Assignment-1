class Sort
{
	public static void main(String args[])
	{
		int a[]=new int[]{5,3,1,2,4};
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}