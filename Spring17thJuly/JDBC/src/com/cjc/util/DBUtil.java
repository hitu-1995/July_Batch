package com.cjc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static Connection con;

	public static Connection getConnection() {

		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				return con;
			} catch (Exception e) {
				System.out.println("Exception : " + e.getMessage());
			}

		}

		return con;
	}
}
