package com.cjc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cjc.util.DBUtil;

public class Test2 {

	 public static void main(String[] args) throws Exception {
			
		 Connection con = DBUtil.getConnection();
		 
		 String select = "select * from product where pname like ?";
		    // >, < , >= , <= , between
		    // select * from product where pname like = 'W%'
		  PreparedStatement ps = con.prepareStatement(select);
		    ps.setString(1, "W%");
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			    int pid = rs.getInt(1);
			    String pname = rs.getString(2);
			    float price = rs.getFloat(3);
			    String dealer = rs.getString(4);
			    System.out.println(pid+"   "+pname+"   "+price+"    "+dealer);
		   }
		  
		  System.out.println("main-------End");
	}

}
