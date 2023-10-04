package Arrays;
import java.util.Scanner;
public class ArrayEvenOdd {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int even =0,odd=0;
		System.out.println("Array Elements are");
		for(int item:arr) {
			System.out.print(item+" ");
			if(item%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("\nEven count : "+even+"\nOdd Count : "+odd);
	}
}
