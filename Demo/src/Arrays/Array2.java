package Arrays;
public class Array2 {
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
		int m=1;
		for(int item:days) {
			System.out.println(m+"\t"+item);
			m++;
		}
	}
}
