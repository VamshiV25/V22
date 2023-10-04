package Arrays;
public class Array5 {
	public static void main(String[] args) {
		int[] arr=new int[] {10,9,8,7,6,5,4,3,2,1};
		int sum=0;
		System.out.println("Array Elements");
		for(int item:arr) {
			System.out.println(item+" ");
			sum=sum+item;
		}
		System.out.println("Reverse Sum = "+sum);
	}
}
