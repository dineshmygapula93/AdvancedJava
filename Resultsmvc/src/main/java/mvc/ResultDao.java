package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDao {
	static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dinesh","dinesh9999");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultBean getmark(int h) {
		ResultBean rb=new ResultBean();
		try {
			PreparedStatement pstmt=con.prepareStatement("select * from marks where hno=?");
			pstmt.setInt(1, h);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				rb.setHno(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setC(rs.getInt(3));
				rb.setCpp(rs.getInt(4));
				rb.setJava(rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return rb;
	}
}
