import java.util.*;
class Increasing{
	public static void main(String... as){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int flag=0;
		int a=0;
		int b=0;
		for(int i=0;num>0;i++){
			a=num%10;
			num=num/10;
			b=num%10;
			if(a<b){
				System.out.println("Number is not an increasing number");
				return;
			}
			else
				flag++;
		}
		if(flag>0){
			System.out.println("Number is an increasing number");
		}
	}
}