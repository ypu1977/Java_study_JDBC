package com.iu.test;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.util.DBConnector;

public class TestMain 
{
	public static void main(String[] args) 
	{
		RegionsDAO regionDAO = new RegionsDAO();
	    CountriesDAO countriesDAO = new CountriesDAO(); 
	    try 
	    {
	         //regionDAO.getList();
	         //regionDAO.getDetail(2);
	         //countriesDAO.getList();
	         countriesDAO.getDetail("IT");
	    } 
	    catch (Exception e) 
	    {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	    }
		
//		try 
//		{
//			DBConnector.getConnection();
//		} 
//		catch (Exception e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		RegionsDAO da = new RegionsDAO();
//		try {
//			da.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
	}
}