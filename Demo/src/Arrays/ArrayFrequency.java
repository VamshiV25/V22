package Arrays;
import java.util.Scanner;
public class ArrayFrequency {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int frequency=0;
		System.out.println("Enter key element");
		int key=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				frequency++;
		}
		System.out.println("Frequency of "+key+" in the array is "+frequency);
	}

}
