package Arrays;
public class Array3 {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		System.out.println("Array Elements");
		for(int item:arr) {
			System.out.println(item+" ");
			sum=sum+item;
		}
		System.out.println("Sum = "+sum);
	}
}
