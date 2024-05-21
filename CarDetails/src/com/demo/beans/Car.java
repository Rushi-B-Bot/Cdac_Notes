package com.demo.beans;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Car {

	private int carid,price;
	private String ownername,salesmanname,modelname;
	private LocalDate dateofpurchase,manifacturedate;
	public Car() {
		super();
	}
	
	public Car(int carid, int price, String ownername, String salesmanname, String modelname, LocalDate dateofpurchase,
			LocalDate manifacturedate) {
		super();
		this.carid = carid;
		this.price = price;
		this.ownername = ownername;
		this.salesmanname = salesmanname;
		this.modelname = modelname;
		this.dateofpurchase = dateofpurchase;
		this.manifacturedate = manifacturedate;
	}

	

	public Car(String ownername) {
		super();
		this.ownername = ownername;
	}

	public Car(int id) {
		this.carid=id;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getSalesmanname() {
		return salesmanname;
	}

	public void setSalesmanname(String salesmanname) {
		this.salesmanname = salesmanname;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public LocalDate getDateofpurchase() {
		return dateofpurchase;
	}

	public void setDateofpurchase(LocalDate dateofpurchase) {
		this.dateofpurchase = dateofpurchase;
	}

	public LocalDate getManifacturedate() {
		return manifacturedate;
	}

	public void setManifacturedate(LocalDate manifacturedate) {
		this.manifacturedate = manifacturedate;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carid == other.carid;
	}

	@Override
	public String toString() {
		return "Car [carid=" + carid + ", price=" + price + ", ownername=" + ownername + ", salesmanname="
				+ salesmanname + ", modelname=" + modelname + ", dateofpurchase=" + dateofpurchase
				+ ", manifacturedate=" + manifacturedate + "]";
	}
	
}
