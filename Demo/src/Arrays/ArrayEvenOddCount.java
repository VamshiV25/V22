package Arrays;
public class ArrayEvenOddCount {
	public static void main(String[] args) {
		int[] arr=new int[] {10,9,8,7,6,5,4,3,2,1};
		int evens=0,odds=0;
		System.out.println("Array Elements");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
			if(arr[i]%2==0)
				evens++;
			else
				odds++;
		}
		System.out.println("\nEven : "+evens+"\nOdds : "+odds);
	}
}
