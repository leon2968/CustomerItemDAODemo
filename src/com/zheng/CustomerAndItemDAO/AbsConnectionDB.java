package com.zheng.CustomerAndItemDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.mariadb.jdbc.Driver;

public abstract class AbsConnectionDB {
	private final Driver driver = new org.mariadb.jdbc.Driver();
	private final String URL = "jdbc:mariadb://localhost:3306/customer_item_schema";
	private final String USER = "user1";
	private final String PASS = "user1";
	
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	public void connectDB() throws Exception{
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(URL, USER, PASS);
		
	}
	
	public void closeConnection() throws Exception {
		if(conn!=null && !conn.isClosed())
			conn.close();
		if(ps!=null && !ps.isClosed())
			ps.close();
		if(rs!=null && !rs.isClosed())
			rs.close();
	}
}
