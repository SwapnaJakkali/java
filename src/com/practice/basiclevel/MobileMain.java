package com.practice.basiclevel;

class Mobile{
	String model;
	double price;
	
	public Mobile(String model , double price) {
		this.model=model;
		this.price=price;
	}
	
	public void showDetails() {
		System.out.println(model);
		System.out.println(price);
	}
}
public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile("OPPO",15000);
		m.showDetails();
		
	}

}
