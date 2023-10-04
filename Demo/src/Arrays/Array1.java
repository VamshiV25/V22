package Arrays;
public class Array1 {
	public static void main(String[] args) {
		int[] days=new int[12];
		for(int i=0;i<12;i++) {
			if(i==1)
				days[i]=28;
			else if(i==3||i==5||i==8||i==10)
				days[i]=30;
			else
				days[i]=31;
		}
		System.out.println("Month\tDays");
		for(int i=0;i<12;i++) {
			System.out.println((i+1)+"\t"+days[i]);
		}
	}
}
