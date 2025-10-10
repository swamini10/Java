package com.jdbcfirst;
import java.sql.DriverManager;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/sbpcoe";
			String username = "root";
			String password="root@123";
			DriverManager.getConnection(url, username, password);
			System.out.println("Connected....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
