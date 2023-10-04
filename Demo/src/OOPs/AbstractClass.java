package OOPs;
public class AbstractClass {
	public static void main(String[] args) {
		Employee emp=new Office(12,"Vamshi",54000.75);
		System.out.println("Details of Office Employee");
		emp.calculateSal();
		emp.showEmp();
		System.out.println("\nDetails of Factory Employee");
		emp=new Factory(34,"Suri",4000.45);
		emp.calculateSal();
		emp.showEmp();	
	}
}
abstract class Employee{
	int eid;
	String ename;
	double basicSal;
	double gs;
	double pf;
	double ns;
	public Employee(int id,String name,double sal) {
		eid=id;
		ename=name;
		basicSal=sal;
	}
	public void showEmp() {
		System.out.println("ID:"+eid+"\nName:"+ename+"\nSal:"+basicSal);
	}
	public abstract void calculateSal();
}
class Office extends Employee{
	double hra,da;
	public Office(int eid,String ename,double basicSal) {
		super(eid,ename,basicSal);
	}
	@Override
	public void calculateSal() {
		hra=basicSal*25/100;
		da=basicSal*20/100;
		pf=basicSal*15/100;
		gs=basicSal+hra+da;
		ns=gs-pf;
	}
	@Override
	public void showEmp() {
		System.out.println(hra);
		System.out.println(da);
		System.out.println(pf);
		System.out.println(gs);
		System.out.println(ns);
	}
}
class Factory extends Employee{
	double fa,sa,ma;
	public Factory(int eid,String ename,double basicSal) {
		super(eid,ename,basicSal);
	}
	@Override
	public void calculateSal() {
		fa=basicSal*20/100;
		sa=basicSal*15/100;
		ma=basicSal*10/100;
		pf=basicSal*8/100;
		gs=basicSal+fa+sa+ma;
		ns=gs-pf;
	}
	@Override
	public void showEmp() {
		System.out.println(fa);
		System.out.println(ma);
		System.out.println(sa);
		System.out.println(pf);
		System.out.println(gs);
		System.out.println(ns);
	}
}