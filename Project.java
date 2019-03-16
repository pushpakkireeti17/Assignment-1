import java.util.*;
class Project
{
	int basic,hra,it;
	String emp_name,dept,emp_no,jd,desig_co;
	public Project(String emp_no,String emp_name,String jd,String desig_co,String dept,int basic,int hra,int it)
	{
		this.emp_no=emp_no;
		this.emp_name=emp_name;
		this.jd=jd;
		this.desig_co=desig_co;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	}
	public static void main(String[] args)
	{
		Project p[]=new Project[7];
		p[0]=new Project("1001","Ashish","01/04/2009","e","R&D",20000,8000,3000);	
		p[1]=new Project("1002","sushma","23/08/2012","c","PM",30000,12000,9000);
		p[2]=new Project("1003","rahul","12/11/2008","k","Acct",10000,8000,1000);
		p[3]=new Project("1004","chahat","29/01/2013","r","Front Desk",12000,6000,2000);
		p[4]=new Project("1005","ranjan","16/07/2005","m","Engg",50000,20000,20000);
		p[5]=new Project("1006","suman","01/01/2000","e","Manufacturing",23000,9000,4400);
		p[6]=new Project("1007","tanmay","12/06/2006","c","PM",29000,12000,10000);
		
		String desig_co1="";
		int count=0,salary=0,da;
		//Scanner s=new Scanner(System.in);
		//System.out.println("Enter Id");
		//String Id=s.nextLine();
		String Id=args[0];
		for(Project p1:p)
		{
			if(p1.emp_no.equals(Id))
			{
				
				switch(p1.desig_co)
				{
					case "e":
					{
						desig_co1="Engineer";
						da=20000;
						salary=p1.basic+da+p1.hra+p1.it;
						break;
					}
					case "c":
					{
						desig_co1="Consultant";
						da=32000;
						salary=p1.basic+da+p1.hra+p1.it;
						break;
					}
					case "k":
					{
						desig_co1="Clark";
						da=12000;
						salary=p1.basic+da+p1.hra+p1.it;
						break;
					}
					case "r":
					{
						desig_co1="Representative";
						da=15000;
						salary=p1.basic+da+p1.hra+p1.it;
						break;
					}case "m":
					{
						desig_co1="manager";
						da=40000;
						salary=p1.basic+da+p1.hra+p1.it;
						break;
					}
				}
				System.out.println(p1.emp_no+"\n"+p1.emp_name+"\n"+p1.dept+"\n"+desig_co1+"\n"+salary);
				break;
			}
		}
		
		
	}
}