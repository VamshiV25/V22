package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Date;

public class InsertScanner {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Queen Sid");
		int sid=in.nextInt();
//		System.out.println("Enter Queen dob");
//		String dob=in.next();
		//Date mydate=new Date(0000-00-00);
		String sql="delete from queen where sid=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/king","root","2059");
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setInt(1,sid);
			int rows=stmt.executeUpdate();
			if(rows>0)
				System.out.println(rows+" row(s) Succesfully Deleted");
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println("Caught:"+e);
		}
	}
}
