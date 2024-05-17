package com.demo.enums;

public enum Grade {
	Distinction(80,100),First(65,79),Second(50,64),Pass(40,49),Fail(0,39);

	private int max,min;

	private Grade(int i, int j) {
		this.min = i;
		this.max = j;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	
}
