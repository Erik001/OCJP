/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanR
 */
public class TestTransaction {

    public static void main(String[] args) {
    	Properties dbProp = new Properties();

		try {
			FileInputStream fis = new FileInputStream("dbInfo.properties");
			dbProp.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://127.0.0.1:3306/human_resources";
		String username = dbProp.getProperty("userName");
		String password = dbProp.getProperty("password");
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, username, password);
            //conn.setAutoCommit(true); //can't be set to true and have rollback or commit statements it thorws an error
            conn.setAutoCommit(false); 
            String query1 = "INSERT INTO employee (first_name, last_name, age, email, phone_number, hire_date, salary, department_id) VALUES ('q1', 'Mavris', '32', 'SMAVRIS', '515.123.7777', '2011-11-16', '11500.0', '4');";
            String query2 = "INSERT INTO employee (first_name, last_name, age, email, phone_number, hire_date, salary, department_id) VALUES ('q2', 'Mavris', '32', 'SMAVRIS', '515.123.7777', '2011-11-16', '11500.0', '4');";
            String query3 = "INSERT INTO employee (first_name, last_name, age, email, phone_number, hire_date, salary, department_id) VALUES ('q3', 'Banuelos', '30', 'HABANUELOS', '515.123.7777', '2011-11-16', '11500.0', '4');";
                    
          Statement stmt = conn.createStatement();
          stmt.executeUpdate(query1);
           Savepoint s1 = conn.setSavepoint();
          stmt.executeUpdate(query2);
          Savepoint s2 = conn.setSavepoint();
          stmt.executeUpdate(query3);
          //conn.rollback(); rollback all
          conn.rollback(s2);
          conn.commit();
          System.out.println("Succesful");   
        } catch (SQLException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }finally{
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TestTransaction.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
