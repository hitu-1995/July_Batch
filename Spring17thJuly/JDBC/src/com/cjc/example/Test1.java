package com.cjc.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cjc.util.DBUtil;

public class Test1 {

	 public static void main(String[] args) throws Exception {
		
		 Connection con = DBUtil.getConnection();
		 
		 String select = "select * from product where price between ? and ?";
		    // >, < , >= , <= , between
		 
		  PreparedStatement ps = con.prepareStatement(select);
		    ps.setFloat(1, 10000);
		    ps.setFloat(2, 25000);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()) {
			    int pid = rs.getInt(1);
			    String pname = rs.getString(2);
			    float price = rs.getFloat(3);
			    String dealer = rs.getString(4);
			    System.out.println(pid+"   "+pname+"   "+price+"    "+dealer);
		   }
		  
		  
	}
}
