package com.iu.regions;

import java.security.KeyStore.ProtectionParameter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO 
{
	
	//2. Regions 에서 하나의 결과(row)
	public void getDetail(int region_id) throws Exception
	{
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query 문 작성
		String sql="SELECT * FROM REGIONS WHERE REGION_ID=?";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setInt(1, region_id);
		
		//5. 최종 전송 후 결과 처리	
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) 
		{
			int rId = rs.getInt(1);
			String rName = rs.getString(2);
			System.out.println(rId);
			System.out.println(rName);
		}
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
	}
	
	//1. Regions 의 모든 데이터 가져오기
	public void getList() throws Exception
	{
		ArrayList<RegionsDTO> ar = new RegionsDAO();
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. Query 문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//5. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			RegionsDTO regionsDTO = new RegionsDTO();
			regionsDTO.getRegion_id(rs.getInt("Region_id"));
			regionsDTO.getRegion_name(rs.getString("Region_Name"));
			System.out.println(id);
			System.out.println(name);
		}
		
		//6. 자원해제
		DBConnector.disConnect(rs, st, con);
	}
}