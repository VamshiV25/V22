package OOPs;

public class MethodOverLoading {

	public static void main(String[] args) {
		double d1=12.5,d2=13.5,d3=14.5;
		System.out.println("Adding two doubles : "+add(d1,d2));
		System.out.println("Adding 3 doubles : "+add(d1,d2,d3));
	}
	public static double add(double d1,double d2) {
		return d1+d2;
	}
	public static double add(double d1,double d2,double d3) {
		return d1+d2+d3;
	}
}
