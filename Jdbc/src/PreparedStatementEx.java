import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {
		public static void main(String[] args) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
				PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
				//Taking values from command line arguments
				ps.setInt(1, Integer.parseInt(args[0]));
				ps.setString(2, args[1]);
				ps.setInt(3, Integer.parseInt(args[2]));
				ps.executeUpdate();
				System.out.println("one row inserted sucessfully");
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		}
}
