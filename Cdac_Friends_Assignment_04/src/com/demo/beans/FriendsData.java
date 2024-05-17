package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FriendsData {
	private int id;
	private String name;
	private String lastname;
	private List<String> hobbies;
	private long mobno;
	private String email;
	private LocalDate bdate;
	private String address;
	
	public FriendsData() {
		super();
	}

	public FriendsData(int id, String name, String lastname, List<String> hobbies, long mobno, String email,
			LocalDate bdate, String address) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.hobbies = hobbies;
		this.mobno = mobno;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBdate() {
		return bdate;
	}

	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "FriendsData [id=" + id + ", name=" + name + ", lastname=" + lastname + ", hobbies=" + hobbies
				+ ", mobno=" + mobno + ", email=" + email + ", bdate=" + bdate + ", address=" + address + "]";
	}
	
}
