import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryex2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from students");
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			for(int i=1 ;i<=n ;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1 ;i<=n ;i++) {
				System.out.print(rs.getString(i)+"\t");
				}
				System.out.println();
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
