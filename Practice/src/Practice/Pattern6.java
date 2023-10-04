package Practice;
public class Pattern6 {
	public static void main(String[] args) {
		int ch=65;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++,ch++) {
				System.out.print((char)ch+" ");
			}
			System.out.println();
		}
	}

}