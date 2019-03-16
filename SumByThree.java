import java.util.*;
class SumByThree{
	static int num;
	public static int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if((i%3==0)||(i%5==0)){
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String... a){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=s.nextInt();
		int sum=calculateSum(num);
		System.out.println(sum);
	}
}