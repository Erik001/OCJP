
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class TestJDBC5 {

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
		String query = "call getEmpName(?,?)";
		try (Connection connection = DriverManager.getConnection(url, usernName, password);
				CallableStatement statement = connection.prepareCall(query);) {
			//parametro de entrada
			int empId = 2;
			statement.setInt(1, empId);
			
			statement.registerOutParameter(2, java.sql.Types.VARCHAR);
			System.out.println("Ejecutando Stored Prodedure....");
			statement.execute();
			
			String empName = statement.getString(2);
			System.out.println("Empleado con Id: " + empId + " es : " + empName);
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
