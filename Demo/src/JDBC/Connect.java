package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Successfully Loaded....");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306","root","2059");
			System.out.println("Connection Opened..");
			con.close();
		}
		catch(ClassNotFoundException exp) {
			System.out.println("Problem in Loading Driver..");
		}
		catch(SQLException exp) {
			System.out.println("Problem in opening Connection");
		}
	}

}
