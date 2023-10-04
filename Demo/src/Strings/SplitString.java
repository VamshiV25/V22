package Strings;
public class SplitString {
	public static void main(String[] args) {
		String str="String Handling in java";
		String[] words=str.split(" ");
		String LongestWord="";
		for(String word:words) {
			if(word.length()>LongestWord.length()) {
				LongestWord=word;
			}
		}
		System.out.println("Longest Word :"+LongestWord);
	}
}
