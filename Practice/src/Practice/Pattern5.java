package Practice;
public class Pattern5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int ch=65;
			for(int j=1;j<=i;j++,ch++) {
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
	}
}