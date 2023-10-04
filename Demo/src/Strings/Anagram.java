package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String s1=in.next();
		String s2=in.next();
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		s1=new String(a);
		s2=new String(b);
		
		if(s1.equals(s2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
