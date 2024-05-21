package com.demo.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Car;
import com.demo.comparator.MyNameComparator;

public class CarDaoImpl implements CarDaoInterface{
	static List<Car> list;
	static {
		list=new ArrayList<>();
		list.add(new Car(1,2000000,"Bhim","Rachi","Nexon",LocalDate.of(2024, 12, 12),LocalDate.of(2024, 12, 12)));
		list.add(new Car(2,4000000,"Aamir","Akshada","Nexon",LocalDate.of(2024, 12, 04),LocalDate.of(2024, 12, 02)));
		list.add(new Car(2,1,"Aamir","Akshada","Nexon",LocalDate.of(2024, 12, 04),LocalDate.of(2024, 12, 02)));
	}
	@Override
	public boolean insertData(Car c) {
		return list.add(c);
	}
	
	@Override
	public boolean removeData(int id) {
		return list.remove(new Car(id));
	}

	@Override
	public List<Car> searchByM(LocalDate ldt1) {
		List<Car> lst = list.stream()
				.filter(ob->ob.getManifacturedate().equals(ldt1))
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}

	@Override
	public List<Car> searchByPrice(int price) {
		List<Car> lst = list.stream()
				.filter(ob->ob.getPrice()<=price)
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;
	}

	@Override
		public List<Car> sortByN() {
			List<Car> lst=new ArrayList<>();
			for(Car p:list) {
				lst.add(p);
			}
			//Collections.copy(lst, plist);
			lst.sort(new MyNameComparator());
			return lst;
		}

	@Override
	public void write() {
		try(BufferedWriter br=new BufferedWriter(new FileWriter("cardetails.txt"));)
		{
			for(Car c:list)
			{
				br.write(c.getCarid()+","+c.getModelname()+","+c.getOwnername()+","+c.getPrice()+","+c.getSalesmanname()+","+c.getDateofpurchase()+","+c.getManifacturedate());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
