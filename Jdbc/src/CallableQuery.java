import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableQuery {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
			CallableStatement cs=con.prepareCall("{call getmarks(?,?)}");
			cs.setInt(1,Integer.parseInt(args[0]));
			cs.registerOutParameter(2,Types.INTEGER);
			cs.executeQuery();
			System.out.println(cs.getInt(2));
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
