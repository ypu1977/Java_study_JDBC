package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.print.DocFlavor.READER;

import com.iu.util.DBConnector;

public class CountriesDAO 
{
	//getDetail : conutries_id
	public void getDetail(String country_id) throws Exception 
	{
		//1. DB 연결
	    Connection con = DBConnector.getConnection();
	    
	    //2. SQL 작성
	    String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
	    
	    //3. 미리보내기
	    PreparedStatement st = con.prepareStatement(sql);
	      
	    st.setString(1, country_id);
	      
	    //4. 최종전송 후 결과 처리
	    ResultSet rs = st.executeQuery();
	      
	    if(rs.next()) 
	    {
	       String cid = rs.getString("COUNTRY_ID");
	       String cname = rs.getString("COUNTRY_NAME");
	       int rid = rs.getInt("REGION_ID");
	       System.out.println(cid);
	       System.out.println(cname);
	       System.out.println(rid);
	    }
	    
	    //6. 자원해제
	    DBConnector.disConnect(rs, st, con);
	}
	
	public void getList() throws Exception
	{
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. SQL 작성
		String sql = "SELECT * FROM COUNRTIES";
		
		//3. 미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. 최종전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next())
		{
			String cid = rs.getString("country_id");
			String cName = rs.getString("country_name");
			int rid = rs.getInt("region_id");
			System.out.println(cid);
			System.out.println(cName);
			System.out.println(rid);
		}
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);		
	}
}
