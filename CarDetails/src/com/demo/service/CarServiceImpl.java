package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Car;
import com.demo.dao.CarDaoImpl;
import com.demo.dao.CarDaoInterface;

public class CarServiceImpl implements CarServiceInterface{

	CarDaoInterface cdao;
	public CarServiceImpl() {
		cdao=new CarDaoImpl();
	}
	
	@Override
	public boolean addNewData(Car c) {
		return cdao.insertData(c);
	}

	@Override
	public boolean deleteData(int id) {
		return cdao.removeData(id);
	}

	@Override
	public List<Car> seachByManufactureDate(LocalDate ldt1) {
		return cdao.searchByM(ldt1);
	}

	@Override
	public List<Car> seachByPrice(int price) {
		return cdao.searchByPrice(price);
	}

	@Override
	public List<Car> sortByName() {
		return cdao.sortByN();
	}

	@Override
	public void writeInFile() {
		cdao.write();
		
	}
	
	
}
