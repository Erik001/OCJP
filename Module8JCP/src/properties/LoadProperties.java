package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class LoadProperties {

	public static void main(String[] args) {
		Properties myProp = new Properties();
		try {
			FileInputStream fis = new FileInputStream("ServerInfo.properties");
			myProp.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Server: " + myProp.getProperty("hostName"));
		System.out.println("User: " + myProp.getProperty("userName"));
		System.out.println("Password: " + myProp.getProperty("password"));

		System.out.println("*************************************************");
		Properties prop = System.getProperties();
		prop.list(System.out);
		Enumeration en = prop.propertyNames();
		while (en.hasMoreElements()) {
			String key = en.nextElement().toString();
			System.out.println(key + "--------->" + prop.getProperty(key));
		}
		// To add properties through command line java -DMYNAME=Erik
		// -DLASTNAME=Torres properties.LoadProperties
		System.out.println("*************" + prop.getProperty("MYNAME") + "*************");
	}

}
