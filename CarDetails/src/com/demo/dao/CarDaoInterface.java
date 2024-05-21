package com.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.demo.beans.Car;

public interface CarDaoInterface {

	boolean insertData(Car c);

	boolean removeData(int id);

	List<Car> searchByM(LocalDate ldt1);

	List<Car> searchByPrice(int price);

	List<Car> sortByN();

	void write();

}
