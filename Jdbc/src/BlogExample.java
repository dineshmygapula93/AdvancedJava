import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlogExample {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
			PreparedStatement ps=con.prepareStatement("insert into images values(?,?)");
			ps.setString(1, args[0]);
			FileInputStream fis=new FileInputStream(args[1]);
			ps.setBlob(2, fis, fis.available());
			ps.executeUpdate();
			System.out.println("one row inserted sucussfully");
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
