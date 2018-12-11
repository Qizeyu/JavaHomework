package com.jdbc.util;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCutil {
	static String driverclass = null;
	static String url = "";
	static String user= "";
	static String password = "";
	
	static {
		try {
			//1创建一个属性配置对象
			Properties properties = new Properties();
			InputStream is = new FileInputStream("jdbc.properties");
			
			
			//使用类加载器，去读取src下的资源文件
			//jdbc.properties要放在src下，在加载类时同时将其加载
			//InputStream is = JDBCutil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			
			properties.load(is);
			//读取属性
			driverclass=properties.getProperty("driverClass");
			url=properties.getProperty("url");
			user=properties.getProperty("user");
			password=properties.getProperty("password");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	/**
	 * 建立连接
	 * @return conn 返回连接
	 */
	public static Connection getConn() {
		Connection conn = null;
		
		try {
			Class.forName(driverclass).newInstance();
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception s) {
			// TODO: handle exception
			s.printStackTrace();
		}
		
		return conn;
	}
	/**
	 * 释放资源
	 * @param conn
	 * @param rs
	 * @param st
	 */
	public static void release(Connection conn,ResultSet rs,Statement st) {
		closeRs(rs);
		closeSt(st);
		closeConn(conn);
	}
	public static void closeRs(ResultSet rs)
	{
		try {
			if(rs!=null)
				rs.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			rs =null;
		}
	}
	public static void closeSt(Statement st)
	{
		try {
			if(st!=null)
				st.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			st =null;
		}
	}
	public static void closeConn(Connection conn)
	{
		try {
			if(conn!=null)
				conn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}finally {
			conn =null;
		}
	}
	

}
