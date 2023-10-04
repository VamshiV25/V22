package Strings;
public class WordsCount {
	public static void main(String[] args) {
		String str="String Handling in java";
		int words=1;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c==' ')
				words++;
		}
		System.out.println("the String is :"+str);
		System.out.println("the String Words :"+words);
	}
}
