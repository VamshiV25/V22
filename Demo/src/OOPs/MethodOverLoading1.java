package OOPs;

public class MethodOverLoading1 {

	public static void main(String[] args) {
		show(7);
		show("Vamshi");
		show(123.45);
	}
	public static void show(int n) {
		System.out.println("Number is : "+n);
	}
	public static void show(String str) {
		System.out.println("Name : "+str);
	}
	public static void show(double d) {
		System.out.println("Double is : "+d);
	}
}
