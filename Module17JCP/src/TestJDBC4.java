
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestJDBC4 {

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
		try (Connection connection = DriverManager.getConnection(url, usernName, password);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(query)) {
			DatabaseMetaData dbm = connection.getMetaData();

			System.out.println("*******************************************");
			int n = 1;
			while (rs.next()) {
				System.out.print(n++ + " " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}
			
			System.out.println("-------------------------------------------");
			System.out.println("Previous:::");
			
			while (rs.previous()) {
				System.out.print(--n + " " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}
			
			System.out.println("-------------------------------------------");
			System.out.println("Absolute (7):");
			//rs.absolute(19); //manda error si no existe
			if(rs.absolute(7)){
				System.out.print("Nombre Completo: " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}
			
			System.out.println("----------------------------------");
			
			System.out.println("Relative (-2):");
			//rs.relative(-9);// manda error si no existe yh esta fuera del if
			if(rs.relative(-5)){
				System.out.print("Nombre Completo: " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}
			
			System.out.println("----------------------------------");
			System.out.println("Before First");
			rs.beforeFirst();
			if(rs.next()){
				System.out.print("Nombre Completo: " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}
			
			System.out.println("----------------------------------");
			System.out.println("After last");
			rs.afterLast();
			if(rs.previous()){
				System.out.print("Nombre Completo: " + rs.getString("first_name"));
				System.out.println(" " + rs.getString("last_name"));
			}


		} catch (SQLException sqle) {
			//while(sqle != null){
				System.err.println("SQLState: " + sqle.getSQLState());
				System.err.println("Error Code: " + sqle.getErrorCode());
				System.err.println("Message: " + sqle.getMessage());
				Throwable t = sqle.getCause();
				while(t != null){
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			//}
			sqle = sqle.getNextException();
		}

	}

}
