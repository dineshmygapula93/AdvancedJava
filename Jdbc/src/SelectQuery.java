import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {
	public static void main(String args []) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select*from Students");
		ResultSetMetaData rsmd=rs.getMetaData();
		int n=rsmd.getColumnCount();
		for(int i=1 ;i<=n ;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
