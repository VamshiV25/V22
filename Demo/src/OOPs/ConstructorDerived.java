//package OOPs;
//public class ConstructorDerived {
//	public static void main(String[] args) {
//		Marks s1=new Marks(123,"Vamshi",90,91,92);
//		System.out.println("Student Details");
//		s1.getStudent();
//		s1.getMarks();
//	}
//}
//class Student{
//	int rollno;
//	String name;
//	public Student(int rollno,String name) {
//		this.rollno=rollno;
//		this.name=name;
//	}
//	public void getStudent() {
//		System.out.println("Roll no : "+rollno);
//		System.out.println("Name : "+name);
//	}
//}
//class Marks extends Student{
//	int m1,m2,m3;
//	public Marks(int rollno,String name,int m1,int m2,int m3) {
//		super(rollno,name);
//		this.m1=m1;
//		this.m2=m2;
//		this.m3=m3;
//	}
//	public void getMarks() {
//		System.out.println("M1 : "+m1);
//		System.out.println("M2 : "+m2);
//		System.out.println("M3 : "+m3);
//	}
//}