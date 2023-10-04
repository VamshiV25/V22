package Arrays;
import java.util.Scanner;
public class ArrayMaxMin {
	public static void main(String[] args) {
		int[]arr=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int min,max;
		min=max=arr[0];
		System.out.println("Array Elements are");
		for(int item:arr) {
			System.out.print(item+" ");
		}
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println();
		System.out.println("\nMax : "+max+"\nMin : "+min);
		
	}
}
