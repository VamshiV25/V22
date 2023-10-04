package Strings;
import java.util.Scanner;
public class VowelCount {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter an String");
		String str=in.nextLine();
		int vowels=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				vowels++;
		}
		System.out.println("Vowel Count : "+vowels);
	}
}