package Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArraySearching {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
		}
		System.out.println("Array Elements are");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter Key Value");
		int key=in.nextInt();
		boolean found=false;
		for(int item:arr) {
			if(item==key)
				found=true;
		}
		if(found)
			System.out.println("Search is Succesfull...");
		else
			System.out.println("Search is Failed...");
	}
	
}
