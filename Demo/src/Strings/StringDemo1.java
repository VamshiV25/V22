package Strings;
public class StringDemo1 {
	public static void main(String[] args) {
		String str1="Vamshi";
		String str2=new String(str1);
		System.out.println("String object is : "+str1);
		System.out.println("String object using another String is: "+str2);
		
		char[] charArray=new char[] {'s','t','r','i','n','g'};
		String s1=new String(charArray);
		System.out.println("\nString using charArray : "+s1);
		
		String name="Vamshi";
		System.out.println("Name is : "+name);
		name=name.concat(" Reddy");
		System.out.println("Name After concat : "+name);
	}
}
