import java.util.*;
class Power
{
	public static void main(String... a){
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int flag=0;
		int base=2;
		for(int i=1;i<num/2;i++){
			if(Math.pow(base,i)==num){
				System.out.println("Number is a power of 2");
				return;
			}
			else
				flag++;
		}
		System.out.println("Number is not a power of 2");
	}
}