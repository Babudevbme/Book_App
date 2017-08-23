package com.revature.Util;
    
    import java.sql.Connection;
import java.sql.DriverManager;
    public class ConnectionUtil {
 
	    public static Connection getConnection()throws Exception{
	 
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/book_tags", "root", "babudev");
			return con;
	    }
	
	 
	    }


	
		
	 
	


