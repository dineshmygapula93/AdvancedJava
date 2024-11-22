import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryex1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh", "dinesh9999");
			Statement stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery("select * from students");
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			for(int i=1 ;i<=n ;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {
				System.out.print(rs.getInt("rollno")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.println(rs.getInt("marks"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
		}
		

	}

}
