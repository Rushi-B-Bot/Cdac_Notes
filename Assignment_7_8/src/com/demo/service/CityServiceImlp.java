package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.dao.CityDao;
import com.demo.dao.CityDaoImpl;

public class CityServiceImlp implements CityService{
       CityDao cdao=new CityDaoImpl();
	@Override
	public List<String> getTreeList(String city) {
	
		return 	cdao.getTreeByCity(city);
	}
	
	@Override
	public Map show() {
		System.out.print(cdao.ShowAll());
		return null;
	}
	
	

}
