package Arrays;
import java.util.Scanner;
public class Array2DAddition {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		System.out.println("Enter 1st Array elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				a[i][j]=in.nextInt();
			}
			System.out.println();
		}
		System.out.println("\nEnter 2nd Array Elements");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				b[i][j]=in.nextInt();
				c[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		System.out.println("\nResult of Array");
		for(int k=0;k<c.length;k++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[k][j]+" ");
			}
			System.out.println();
		}
	}
}
