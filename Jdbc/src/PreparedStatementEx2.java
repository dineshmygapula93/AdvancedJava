import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx2 {
		public static void main(String[] args) {
			try {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter roll no");
				int r=sc.nextInt();
				System.out.println("Enter name");
				String n=sc.next();
				System.out.println("Enter marks");
				int m=sc.nextInt();
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dinesh", "dinesh9999");
				PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?)");
				ps.setInt(1, r);
				ps.setString(2, n);
				ps.setInt(3, m);
				ps.executeUpdate();
				System.out.println("one row inserted sucessfully");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
