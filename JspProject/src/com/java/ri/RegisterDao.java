package com.java.ri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterDao {
	
	public static int register(User u){  
		int status=0;  
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
		      
		      PreparedStatement ps =con.prepareStatement("insert into student(name,grade1,grade2,grade3,grade4,grade5,grade6,password,email) values(?,?,?,?,?,?,?,?,?)");  
		  
		
		      ps.setString(1, u.getUname());
		      ps.setString(2, u.getGrade1());
		      ps.setString(3, u.getGrade2());
		      ps.setString(4, u.getGrade3());
		      ps.setString(5, u.getGrade4());
		      ps.setString(6, u.getGrade5());
		      ps.setString(7, u.getGrade6());
		      ps.setString(8, u.getUemail());
		      ps.setString(9, u.getUpass());
		      
		      if( u.getUname()=="" || u.getUemail()=="" || u.getUpass()=="" || u.getGrade1()=="" || u.getGrade2()=="" || u.getGrade3()=="" || u.getGrade4()=="" || u.getGrade5()=="" ||  u.getGrade6()=="" ){
		    	  
		    	  status=0;
		    	  
		      }
		      else{
		    	  status = ps.executeUpdate();
		    	  
		      }	      
		}catch (Exception e2) {System.out.println(e2);}   
		
	return status;
		      
	}
}
