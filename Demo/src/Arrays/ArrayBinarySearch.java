package Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class ArrayBinarySearch {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=in.nextInt();
		int[] arr=new int[size];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
		}
		Arrays.sort(arr);
		System.out.println("Array Elements are");
		for(int item:arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		int upper,lower;
		lower=0;
		upper=arr.length-1;
		System.out.println("\nEnter Key element");
		int key=in.nextInt();
		boolean found=false;
		while(upper>=lower) {
			int midpos=(upper+lower)/2;
			if(key==arr[midpos]) {
				found=true;
				break;
			}
			else if(key<arr[midpos])
				upper=midpos-1;
			else
				lower=midpos+1;
		}
		if(found)
			System.out.println("Search Successful...");
		else
			System.out.println("Search Failed...");
	}
}
