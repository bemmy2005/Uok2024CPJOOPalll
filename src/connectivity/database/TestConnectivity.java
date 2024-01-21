package connectivity.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TestConnectivity {
	public static void main(String[] args) {
		//Variable preparation
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		//SQL statement creation
		String sql = "SELECT * FROM user";

		try {
			//JDBC driver loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Database connection
			con = DriverManager.getConnection("jdbc:mysql://localhost/appmanagement", "root", "");
			//SQL execution preparation
			stmt = con.prepareStatement(sql);
			//Get execution result
			rs = stmt.executeQuery();

			//Until there is no data(rs.next()Until becomes false)repeat
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("username");
				String pwd = rs.getString("password");
				System.out.println(id + " : " + name +" : " +pwd);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("An error occurred while loading the JDBC driver");
		} catch (SQLException e) {
			System.out.println("There was an error accessing the database.");
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("There was an error accessing the database.");
			}
		}
	}

}