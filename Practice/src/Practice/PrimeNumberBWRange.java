package Practice;
import java.util.Scanner;
public class PrimeNumberBWRange {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Lower and Upper limits");
		int lower=in.nextInt();
		int upper=in.nextInt();
		for(int n=lower;n<=upper;n++) {
			int factors=0,num=n;
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					factors++;
			}
			if(factors==2)
				System.out.print(num+" ");
		}
	}
}