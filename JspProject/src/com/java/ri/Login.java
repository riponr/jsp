package com.java.ri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

public class Login {
	
	public static boolean validate(String name,String password){  
		boolean status=false;  
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			PreparedStatement ps=con.prepareStatement(   
		 "select * from student where name=? and password=?");  
		  
		 ps.setString(1,name);  
		 ps.setString(2, password);  
		               
		 ResultSet rs=ps.executeQuery();  
		 status=rs.next();  
		              
		}catch(Exception e){}  
		  
		return status;  
		  
	}

}
