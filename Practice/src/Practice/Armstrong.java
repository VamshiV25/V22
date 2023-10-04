package Practice;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Integer Number");
		int num=in.nextInt();
		int temp=num;
		int temp1=num;

		int digits=0;
		while(num!=0) {
			digits++;
			num/=10;
		}

		int sum=0;				
		while(temp!=0) {
			int rem=temp%10;
			sum=sum+(int)Math.pow(rem,digits);
			temp/=10;
		}
		if(sum==temp1)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}
}
