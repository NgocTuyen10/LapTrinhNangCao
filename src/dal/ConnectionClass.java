package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	protected Connection connection = null;
	String url = "jdbc:mysql://localhost:3306/cua_hang_ban_giay";
	String username = "root";
	String password = "anhtuyen";

	public void initConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = (Connection) DriverManager.getConnection(url, username, password);
	}
	public void closeConnection() throws SQLException {
		connection.close();
	}

}
