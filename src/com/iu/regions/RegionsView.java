package com.iu.regions;

public class RegionsView 
{
	//view
	public void view(RegionsDTO regionsDTO)
	{
		System.out.println("Region_ID\t Region_name");
		System.out.println("-----------------------------");
		System.out.print(regionsDTO.getRegion_id()+"\t");
		System.out.println(regionsDTO.getRegion_name());
		System.out.println("-----------------------------");
	}
}
