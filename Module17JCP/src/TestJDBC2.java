import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class TestJDBC2 {

	public static void main(String[] args) {
		//Connection
		//Statement
		//ResultSet
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
		String query = "SELECT * FROM tabla_test";
		try(Connection connection = DriverManager.getConnection(url,usernName, password);
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(query)){
			while(rs.next()){
				System.out.println("entero: " + rs.getInt(1));
			}
			
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}

	}

}
