//package OOPs;
//public class HierarchialInheritance {
//	public static void main(String[] args) {
//		Office emp1=new Office("Vamshi",12,35000);
//		Factory emp2=new Factory("Surendra",13,33000);
//		System.err.println("Emp1 Details");
//		emp1.calculateSal();
//		emp1.show();
//		System.err.println("\nEmp2 Details");
//		emp2.calculateSal();
//		emp2.show();
//	}
//}
//class Employee{
//	String name;
//	int id;
//	double basicSal;
//	public Employee(String n,int id,double sal) {
//		this.name=n;
//		this.id=id;
//		this.basicSal=sal;
//	}
//	public void show() {
//		System.out.println("Name:"+name+"\nID:"+id+"\nBasic Sal:"+basicSal);
//	}
//}
//class Office extends Employee{
//	double HRA,DA,PF,GS,NS;
//	public Office(String name,int id,double basicSal) {
//		super(name,id,basicSal);
//	}
//	public void calculateSal() {
//		HRA=basicSal*25/100;
//		DA=basicSal*20/100;
//		PF=basicSal*15/100;
//		GS=basicSal+HRA+DA;
//		NS=GS-PF;	
//	}
//	@Override
//	public void show() {
//		super.show();
//		System.out.println("HRA:"+HRA+"\nDA:"+DA+"\nPF:"+PF+"\nGS:"+GS+"\nNS:"+NS);
//	}	
//}
//class Factory extends Employee{
//	double FA,MA,SA,PF,GS,NS;
//	public Factory(String name,int id,double basicSal) {
//		super(name,id,basicSal);
//	}
//	public void calculateSal() {
//		FA=basicSal*20/100;
//		MA=basicSal*15/100;
//		SA=basicSal*10/100;
//		PF=basicSal*8/100;
//		GS=basicSal+FA+MA+SA;
//		NS=GS-PF;	
//	}
//	public void show() {
//		super.show();
//		System.out.println("FA:"+FA+"\nMA:"+MA+"SA:"+SA+"\nPF:"+PF+"\nGS:"+GS+"\nNS:"+NS);
//	}
//}