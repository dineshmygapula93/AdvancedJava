import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
			CallableStatement ct=con.prepareCall("{call insertpro(?,?,?)}");
			ct.setInt(1, Integer.parseInt(args[0]));
			ct.setString(2, args[1]);
			ct.setInt(3, Integer.parseInt(args[2]));
			ct.executeUpdate();
			System.out.println("one row inserted sucessfully");
			
		} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
		}
		

	}

}
