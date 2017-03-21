import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conn {
	public static void main(String[] args) {
		try {
			//1.¼ÓÔØÇý¶¯
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("12222");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=master";
		try {
			Connection con = DriverManager.getConnection(url, "sa", "yh_415");
			System.out.println("5555555555555");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
