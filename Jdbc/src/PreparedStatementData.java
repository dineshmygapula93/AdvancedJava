import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class PreparedStatementData {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			java.sql.Date sd=java.sql.Date.valueOf(args[1]);
			pstmt.setDate(2, sd);
			pstmt.executeUpdate();
			System.out.println("One row inseted sucessully");
			} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
		}
		
	}
}
