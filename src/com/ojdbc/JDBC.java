package com.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "Naren7921");
	
	String s = "select * from employees";
	
	PreparedStatement p = c.prepareStatement(s);
	ResultSet r = p.executeQuery();
	
	while (r.next()) { 
		int i = r.getInt("employee_id");
		System.out.println(i);
		
		
	}
}
}
