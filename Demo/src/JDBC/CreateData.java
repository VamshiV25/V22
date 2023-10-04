package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class CreateData {

	public static void main(String[] args) {
		String sql="create database KING";
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Successfully Loaded...");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306","root","2059");
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Database Succesfully Created...");
			con.close();
			stmt.close();
		}
		catch(SQLException exp) {
			exp.printStackTrace();
		}
		catch(ClassNotFoundException exp) {
		exp.printStackTrace();
		}
	}
}
