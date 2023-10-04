package Arrays;
import java.util.Random;
public class ArrayBubbleSort {
	public static void main(String[] args) {
		int[] arr=new int[10];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100);
		}
		System.out.println("Array Elements are");
		for(int item:arr) {
			System.out.print(item+" ");
		}
		// Sort logic
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nAfter Sorting");
		for(int item:arr) {
			System.out.print(item+" ");
		}
	}
}