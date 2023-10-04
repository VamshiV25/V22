package Strings;
public class IndexOf {
	public static void main(String[] args) {
		String str="String Handling in Java";
		System.out.println("The String is :"+str);
		
		int index=str.indexOf("in");
		System.out.println("The Pattern Found at :"+index);
		
		int index1=str.indexOf("in",4);
		System.out.println("The Pattern again found at :"+index1);
		
		int index2=str.indexOf("in",17);
		System.out.println("The Pattern again found at :"+index2);
	}
}
