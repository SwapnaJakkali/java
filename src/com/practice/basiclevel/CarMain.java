package com.practice.basiclevel;

class Car{
	String brand;
	String speed;
	
	public Car(String brand , String speed) {
		this.brand=brand;
		this.speed=speed;
	}
	
	public void drive() {
		System.out.println("car is running");
	}

}
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("suzuki" , "120km/hr");
		c.drive();

	}

}
