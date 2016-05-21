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

public class TestJDBC3 {

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
			DatabaseMetaData dm = connection.getMetaData();
			ResultSetMetaData rsm = rs.getMetaData();

			int colNums = rsm.getColumnCount();

			String[] colNames = new String[colNums];
			String[] colTypes = new String[colNums];

			for (int i = 0; i < colNums; i++) {
				colNames[i] = rsm.getColumnName(i + 1);
				colTypes[i] = rsm.getColumnTypeName(i + 1);
				System.out.println(colNames[i] + " : " + colTypes[i]);
			}

			System.out.println("*************************************");
			if (dm.supportsANSI92EntryLevelSQL()) {
				rs.setFetchSize(3); //Numeor de datos a cargar
				while (rs.next()) {
					for (int i = 0; i < colNums;) {
						System.out.println(colNames[i] + " : " + rs.getString((colNames[i++])));
					}
					System.out.printf("%n%n---------------------------------------------%n");
				}
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

	}

}
