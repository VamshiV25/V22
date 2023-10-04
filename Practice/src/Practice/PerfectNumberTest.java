package Practice;
import java.util.Scanner;
public class PerfectNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer Number");
		int num = sc. nextInt();
		int sum=0;
		// i is a factor of a given number
		for( int i=1 ; i<num ;i++) {
			if( num%i==0)
				sum = sum + i;
		}
		if( sum==num)
			System.out.println("Given Number is a Perfect Number");
		else
			System.out.println("Given number is not a perfect number");	
	}
}
