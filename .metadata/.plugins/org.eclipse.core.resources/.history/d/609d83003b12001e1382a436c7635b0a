package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/king","root","2059");
			Statement stmt=con.createStatement();
			String sql="select*from queen";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("Queen Details");
			System.out.println("sid\tsname\tdob");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println("Caught:"+e);
		}
	}
}
