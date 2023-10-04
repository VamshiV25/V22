package OOPs;
import java.util.Scanner;
public class CalculatorTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two Double Values");
		double d1=in.nextDouble();
		double d2=in.nextDouble();
		System.out.printf("D1=%.2f, D2=%.2f",d1,d2);
		Calculator cal=new Calculator();
		System.out.printf("\nD1+D2=%.2f",cal.add(d1,d2));
		System.out.printf("\nD1-D2=%.2f",cal.sub(d1,d2));
		System.out.printf("\nD1*D2=%.2f",cal.mul(d1,d2));
		System.out.printf("\nD1/D2=%.2f",cal.div(d1,d2));
	}
}
interface cal1{
	public double add(double d1,double d2);
	public double sub(double d1,double d2);
}
interface cal2{
	public double mul(double d1,double d2);
	public double div(double d1,double d2);
}
class Calculator implements cal1,cal2{
	public double add(double d1,double d2) {
		return d1+d2;
	}
	public double sub(double d1,double d2) {
		return d1-d2;
	}
	public double mul(double d1,double d2) {
		return d1*d2;
	}
	public double div(double d1,double d2) {
		return d1/d2;
	}
}