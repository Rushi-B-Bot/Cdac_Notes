package com.demo.beans;

public class Stream {

	private String name;

	public Stream() {
		super();
	}

	public Stream(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stream [name=" + name + "]";
	}
	
	
}
