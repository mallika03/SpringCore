package com.springcore.lifecycle;

public class Product {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}

	public Product(double price) {
		super();
		System.out.println("Constructor called!");
		this.price = price;
	}
	
	public void init1() {
		System.out.println("Bean initialization occurring! : 1");
	}
	
	public void destroy1() {
		System.out.println("Bean destruction occurring : 1");
	}
}
