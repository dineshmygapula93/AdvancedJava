import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PreparedStatementSimpleDateFormat {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date ud=sdf.parse(args[1]);
			long l=ud.getTime();
			java.sql.Date sd=new java.sql.Date(l);
			pstmt.setDate(2, sd);
			pstmt.executeUpdate();
			System.out.println("One Row inserted Sucessfully");
		} catch (ClassNotFoundException | SQLException | ParseException e) {
				e.printStackTrace();
		}
		

	}

}
