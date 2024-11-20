import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
			System.out.println("Connection Established Succfully");
		} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
		}
		

	}

}
