import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx3 {

	public static void main(String[] args) {
		 try {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter roll no");
			 int roll=sc.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
			 PreparedStatement ps=con.prepareStatement("select marks from students where rollno=?");
			 ps.setInt(1,roll);
			ResultSet rs= ps.executeQuery();
			rs.next();
			System.out.println("Marks :"+rs.getInt(1));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		 
	}

}
