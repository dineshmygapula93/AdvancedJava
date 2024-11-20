import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
			Statement stmt=con.createStatement();
			stmt.execute("create table students(rollno number(3),name varchar2(10),marks number(3))");
			System.out.println("Table Created Sucessfull");
		} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
		}
	}

}
