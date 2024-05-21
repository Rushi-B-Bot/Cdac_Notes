package com.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Car;

public interface CarServiceInterface {

	boolean addNewData(Car c);

	boolean deleteData(int id);

	List<Car> seachByManufactureDate(LocalDate ldt1);

	List<Car> seachByPrice(int price);

	List<Car> sortByName();

	void writeInFile();

	
}
