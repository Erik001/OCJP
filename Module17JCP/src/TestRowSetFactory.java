
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class TestRowSetFactory {

	public static void main(String[] args) {
		// Connection
		// Statement
		// ResultSet
		Properties dbProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream("dbInfo.properties");
			dbProp.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://127.0.0.1:3306/human_resources";
		String usernName = dbProp.getProperty("userName");
		String password = dbProp.getProperty("password");
		String query = "SELECT * FROM employee";
		try (JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
				) {
			jdbcRowSet.setUrl(url);
			jdbcRowSet.setUsername(usernName);
			jdbcRowSet.setPassword(password);
			jdbcRowSet.setCommand(query);
			jdbcRowSet.execute();
			
			while(jdbcRowSet.next()){
				int idEmployee = jdbcRowSet.getInt("id");
				String firstNameEmployee = jdbcRowSet.getString("first_name");
				String lastNameEmployee = jdbcRowSet.getString("last_name");
				System.out.println(idEmployee + " " + firstNameEmployee + " " + lastNameEmployee);
				jdbcRowSet.deleteRow();
			}
					
		} catch (SQLException sqle) {
			// while(sqle != null){
			System.err.println("SQLState: " + sqle.getSQLState());
			System.err.println("Error Code: " + sqle.getErrorCode());
			System.err.println("Message: " + sqle.getMessage());
			Throwable t = sqle.getCause();
			while (t != null) {
				System.out.println("Cause: " + t);
				t = t.getCause();
			}
			// }
			sqle = sqle.getNextException();
		}

	}

}
