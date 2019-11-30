package com.brainmentors.ims.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public interface ConnectionUtils {
	static ResourceBundle  rb = ResourceBundle.getBundle("db");;
	
	static Connection createConnection() throws ClassNotFoundException, SQLException{
		
		Connection con = null;
		// Step - 1 Load Driver (Driver is a class) Class Load
		
		Class.forName(rb.getString("driver"));
		// http://
		//String dburl = "jdbc:mysql://localhost:3306/ims";
		con = DriverManager.getConnection(rb.getString("url")
				,rb.getString("userid"),rb.getString("password"));
		
		return con;
	}

}
