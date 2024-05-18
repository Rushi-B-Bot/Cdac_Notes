package com.demo.dao;

import java.util.List;

public interface CityDao {

	List<String> getTreeByCity(String city);

	public List<String> ShowAll();
	public void AddCity(String c);
	public Boolean RemoveCity(String c);
}