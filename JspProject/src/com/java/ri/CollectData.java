package com.java.ri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CollectData {

	
	public static User getdata(int id){
		
		User u= null;
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
		      
		   PreparedStatement ps =con.prepareStatement("select * from student where id=?");
		   ps.setInt(1, id);
		   ResultSet rs= ps.executeQuery();
		   
		   while(rs.next()){
			    u = new User();
			   u.setId(rs.getInt(1));
			   u.setUname(rs.getString(2));
			   u.setGrade1(rs.getString(3));
			   u.setGrade2(rs.getString(4));
			   u.setGrade3(rs.getString(5));
			   u.setGrade4(rs.getString(6));
			   u.setGrade5(rs.getString(7));
			   u.setGrade6(rs.getString(8));
			   u.setUpass(rs.getString(9));
			   u.setUemail(rs.getString(10));
			    
		   }
		   
		   
		   con.close();
		}
		catch(Exception ex){ex.printStackTrace();}  
		return u;
		
	}
	
	public static int update(User u){
		
		int status =0;
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
		      
		   PreparedStatement ps =con.prepareStatement("update student set name=?,grade1=?,grade2=?,grade3=?,grade4=?,grade5=?,grade6=?,email=?,password=? where id=?");
		   
		  
		   ps.setString(1, u.getUname());
		      ps.setString(2, u.getGrade1());
		      ps.setString(3, u.getGrade2());
		      ps.setString(4, u.getGrade3());
		      ps.setString(5, u.getGrade4());
		      ps.setString(6, u.getGrade5());
		      ps.setString(7, u.getGrade6());
		      
		      ps.setString(8, u.getUpass());
		      ps.setString(9, u.getUemail());
		      
		      ps.setInt(10, u.getId());
		      
		      
		     status =ps.executeUpdate();
		   
		   con.close();
		}
		catch(Exception ex){ex.printStackTrace();} 
		return status;
		
	}
	
	public static List<User> getAllRecords(){  
	    List<User> list=new ArrayList<User>();  
	      
	    try{  
	    	Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");   
	        PreparedStatement ps=con.prepareStatement("select * from student");  
	        
	        ResultSet rs=ps.executeQuery();  
	        
	        while(rs.next()){  
	            User u=new User();  
	            
	            u.setId(rs.getInt(1));  
	            u.setUname(rs.getString(2));  
	            u.setGrade1(rs.getString(3));
	            u.setGrade2(rs.getString(4));
	            u.setGrade3(rs.getString(5));
	            u.setGrade4(rs.getString(6));
	            u.setGrade5(rs.getString(7));
	            u.setGrade6(rs.getString(8));
	            u.setUpass(rs.getString(9));
	            u.setUemail(rs.getString(10));
	            
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}
	
	public static List<User> StudentProfile(String name){  
	    List<User> list=new ArrayList<User>();  
	      
	    try{  
	    	Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");   
	        PreparedStatement ps=con.prepareStatement("select * from student where name=?");  
	        
	        ps.setString(1, name);
	        ResultSet rs=ps.executeQuery();  
	        
	        while(rs.next()){  
	            User u=new User();  
	            
	            u.setId(rs.getInt(1));  
	            u.setUname(rs.getString(2));  
	            u.setGrade1(rs.getString(3));
	            u.setGrade2(rs.getString(4));
	            u.setGrade3(rs.getString(5));
	            u.setGrade4(rs.getString(6));
	            u.setGrade5(rs.getString(7));
	            u.setGrade6(rs.getString(8));
	            u.setUpass(rs.getString(9));
	            u.setUemail(rs.getString(10));
	            
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}
}
