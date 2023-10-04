package Strings;
public class Palindrome {
	public static void main(String[] args) {
		String s1="Hello World";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println("The String is : "+s1);
		System.out.println("Revers of String is : "+s2);
		if(s1.equals(s2)) 
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}

