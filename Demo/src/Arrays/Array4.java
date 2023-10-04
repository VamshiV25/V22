package Arrays;
public class Array4 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println("Sum = "+sum);
	}
}
