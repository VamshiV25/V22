package OOPs;

public class MethodOverRiding {

	public static void main(String[] args) {
		Marks s1=new Marks(12,"Vamshi",90,91);
		s1.show();
	}
}
class Student{
	int rollno;
	String name;
	public Student(int r,String n) {
		this.rollno=r;
		this.name=n;
	}
	public void show() {
		System.out.println("Roll no : "+rollno);
		System.out.println("Name : "+name);
	}
}
class Marks extends Student{
	int m1,m2;
	public Marks(int rollno,String name,int m1,int m2) {
		super(rollno,name);
		this.m1=m1;
		this.m2=m2;
	}
	@Override
	public void show() {
		super.show();
		int total=m1+m2;
		double avg=(m1+m2)/2.0;
		System.out.println("m1:"+m1+"\nm2:"+m2+"\nTotal:"+total+"\navg:"+avg);
	}
}