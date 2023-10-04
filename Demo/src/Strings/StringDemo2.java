package Strings;
public class StringDemo2 {
	public static void main(String[] args) {
		String str="Hello World";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();	
		String str1="Hello Java";
		char[] charArray=str.toCharArray();
		for(char c:charArray) {
			System.out.print(c);
		}
		System.out.println();
		String str2="Hello World";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		String str3="Hello World";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}
