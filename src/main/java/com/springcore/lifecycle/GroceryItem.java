package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GroceryItem implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GroceryItem(double price) {
		super();
		System.out.println("Setting price of grocery item");
		this.price = price;
	}

	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GroceryItem [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Implementing init method of grocery using interface");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Implementing destroy method of grocery using interface");
	}
	
	
	
}
