package com.demo.beans;

public class TreeCity {
	private String Treename;
	private int quantity;
	public String getTreename() {
		return Treename;
	}
	public void setTreename(String treename) {
		Treename = treename;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public TreeCity(String treename, int quantity) {
		super();
		Treename = treename;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "\n[Treename=" + Treename + ", quantity=" + quantity + "]";
	}
	
}
