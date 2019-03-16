package pro;

import java.util.Scanner;

abstract class Account{
	double intrestRate;
	double amount;
	abstract double calculateIntrest();
}

class FDAccount extends Account{
	double intrestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	double intrest;
	
	public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
		super();
		this.amount = amount;
		this.noOfDays = noOfDays;
		this.ageOfACHolder = ageOfACHolder;
	}

	@Override
	double calculateIntrest() {
		if(amount<10000000) {
			
			if(ageOfACHolder<60) {
				
				if((noOfDays>=7)&&(noOfDays<=14))
					intrestRate=4.50;
				else if((noOfDays>=15)&&(noOfDays<=29))
					intrestRate=4.75;
				else if((noOfDays>=30)&&(noOfDays<=45))
					intrestRate=5.50;
				else if((noOfDays>=46)&&(noOfDays<=60))
					intrestRate=7.00;
				else if((noOfDays>=61)&&(noOfDays<=184))
					intrestRate=7.50;
				else if((noOfDays>=185)&&(noOfDays<=365))
					intrestRate=8.00;
				
			}
			
			else if(ageOfACHolder>60) {

				if((noOfDays>=7)&&(noOfDays<=14))
					intrestRate=5.00;
				else if((noOfDays>=15)&&(noOfDays<=29))
					intrestRate=5.25;
				else if((noOfDays>=30)&&(noOfDays<=45))
					intrestRate=6.00;
				else if((noOfDays>=46)&&(noOfDays<=60))
					intrestRate=7.50;
				else if((noOfDays>=61)&&(noOfDays<=184))
					intrestRate=8.00;
				else if((noOfDays>=185)&&(noOfDays<=365))
					intrestRate=8.50;
				
			}
		}
		
		else if(amount>10000000) {

			if((noOfDays>=7)&&(noOfDays<=14))
				intrestRate=6.50;
			else if((noOfDays>=15)&&(noOfDays<=29))
				intrestRate=6.75;
			else if((noOfDays>=30)&&(noOfDays<=45))
				intrestRate=6.75;
			else if((noOfDays>=46)&&(noOfDays<=60))
				intrestRate=8.00;
			else if((noOfDays>=61)&&(noOfDays<=184))
				intrestRate=8.50;
			else if((noOfDays>=185)&&(noOfDays<=365))
				intrestRate=10.00;
			
		}
		intrest=amount*(intrestRate/100);
		return intrest;
	}
}

class RDAccount extends Account{
	
	double intrestRate;
	double amount;
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	int quarters;
	public RDAccount(double monthlyAmount, int noOfMonths, int ageOfACHolder) {
		super();
		this.monthlyAmount = monthlyAmount;
		this.noOfMonths = noOfMonths;
		this.ageOfACHolder = ageOfACHolder;
	}

	@Override
	double calculateIntrest() {
		if(ageOfACHolder<60) {
			
			if(noOfMonths==6) {
				intrestRate=7.50;
				quarters=2;
			}
			else if(noOfMonths==9) {
				intrestRate=7.75;
				quarters=3;
			}
			else if(noOfMonths==12) {
				intrestRate=8.00;
				quarters=4;
			}
			else if(noOfMonths==15) {
				intrestRate=8.25;
				quarters=5;
			}
			else if(noOfMonths==18) {
				intrestRate=8.50;
				quarters=6;
			}
			else if(noOfMonths==21) {
				intrestRate=8.75;
				quarters=7;
			}
		}
		
		else if(ageOfACHolder>60) {

			if(noOfMonths==6) {
				intrestRate=8.00;
				quarters=2;
			}
			else if(noOfMonths==9) {
				intrestRate=8.25;
				quarters=3;
			}
			else if(noOfMonths==12) {
				intrestRate=8.50;
				quarters=4;
			}
			else if(noOfMonths==15) {
				intrestRate=8.75;
				quarters=5;
			}
			else if(noOfMonths==18) {
				intrestRate=9.00;
				quarters=6;
			}
			else if(noOfMonths==21) {
				intrestRate=9.25;
				quarters=7;
			}
			
		}
		while(quarters>=2) {
			amount=amount+(monthlyAmount*quarters*intrestRate);
			quarters--;
		}
		return amount;
	}
	
}

class SBAccount extends Account{

	double intrestRate;
	double amount;
	double intrest;
	int flag;
	
	public SBAccount(double amount, int flag) {
		super();
		this.amount = amount;
		this.flag = flag;
	}

	@Override
	double calculateIntrest() {
		
		if(flag==1)
			intrestRate=6.00;
		else if(flag==2)
			intrestRate=4.00;
		
		intrest=amount*(intrestRate/100);
		return intrest;
	}
	
}

public class IntrestCalculator {
	
	static int f;
	public static void main(String[] as) {
		int ch=1;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Select an option: ");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			
			f=sc.nextInt();
			if(f==1) {
				System.out.println("Enter Amount in the account: ");
				double amount=sc.nextDouble();
				while(amount<0) {
					System.out.println("Enter valid amount");
					amount=sc.nextDouble();
				}
				System.out.println("If the account holder is an NRI press 1\nIf the coount holder is an Indian resident press 2");
				int flag=sc.nextInt();
				SBAccount s=new SBAccount(amount,flag);
				double intrest=s.calculateIntrest();
				System.out.println(intrest);
			}
			else if(f==2) {
				System.out.println("Enter Amount: ");
				double amount=sc.nextDouble();
				while(amount<0) {
					System.out.println("Enter valid amount");
					amount=sc.nextDouble();
				}
				System.out.println("Enter no of days: ");
				int noOfDays=sc.nextInt();
				while(noOfDays<0) {
					System.out.println("Enter valid number of days");
					noOfDays=sc.nextInt();
				}
				System.out.println("Enter Age of Account holder: ");
				int age=sc.nextInt();
				while(age<0) {
					System.out.println("Enter valid age");
					age=sc.nextInt();
				}
				FDAccount f=new FDAccount(amount,noOfDays,age);
				double intrest=f.calculateIntrest();
				System.out.println(intrest);
			}
			else if(f==3) {
				System.out.println("Enter Monthly Amount: ");
				double amount=sc.nextDouble();
				while(amount<0) {
					System.out.println("Enter valid amount");
					amount=sc.nextDouble();
				}
				System.out.println("Enter no of quarters(2-7): ");
				int noOfMonths=(sc.nextInt())*3;
				while(noOfMonths<0) {
					System.out.println("Enter valid number of Months");
					noOfMonths=sc.nextInt();
				}
				System.out.println("Enter Age of Account holder: ");
				int age=sc.nextInt();
				while(age<0) {
					System.out.println("Enter valid age");
					age=sc.nextInt();
				}

				RDAccount r=new RDAccount(amount,noOfMonths,age);
				double intrest=r.calculateIntrest();
				System.out.println(intrest);
			}
			else if(f==4) {
				System.out.println("Thank you for using the service..!!");
				sc.close();
				ch--;
				return;
			}
		}while(ch==1);
		sc.close();
	}
}
