package JDBC;
import java.sql.*;
public class InsertValues {

	public static void main(String[] args) {
		String sql="insert into queen(sname,dob) values('Vamshi','2000-05-25')";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded..!!");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306","root","2059");
			System.out.println("Connection Opened..!!");
			Statement stmt=con.createStatement();
			int rows=stmt.executeUpdate(sql);
			if(rows>0)
			System.out.println(rows+" row(s) inserted");
			stmt.close();
			con.close();
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
	}

}
