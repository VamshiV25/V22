package Practice;
public class Pattern4 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++,count++) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
}
