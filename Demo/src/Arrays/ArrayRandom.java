package Arrays;
import java.util.Random;
public class ArrayRandom {
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
	}
}
