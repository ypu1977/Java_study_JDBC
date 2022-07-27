package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector 
{
	//DB연동
	//필요한 정보
	
	public static Connection getConnection() throws Exception
	{
		//1. 접속 정보 작성		
		//id
		String user="hr";
		//pw
		String password = "hr";
		//ip:port
		String url = "jdbc:oracle:thin:@192.168.7.63:1521:xe";
		//driver명
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//2. driver 메모이레 로딩
		Class.forName(driver);
		
		//3. DB 연결 후 Connection 객체 반환
		Connection con = DriverManager.getConnection(url, user, password);
		
		System.out.println(con);
		
		return con;
	}
	
	public static void disConnect(ResultSet rs, PreparedStatement st, Connection con)
	{
		try {
			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}