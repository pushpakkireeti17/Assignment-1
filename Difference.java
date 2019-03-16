import java.util.*;
class Difference{
	static int num;
	public static int calculateDifference(int n){
		int s=0;
		int ss=0;
		for(int i=1;i<=n;i++){
			s=s+i;
		}
		for(int i=1;i<=n;i++){
			int temp=i*i;
			ss=ss+temp;
		}
		return ss-s;
	}
	public static void main(String... a){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		int diff=calculateDifference(num);
		System.out.println(diff);
		
	}
}