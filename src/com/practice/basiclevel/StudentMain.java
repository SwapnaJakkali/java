package com.practice.basiclevel;

class Student{
	private String name;
	private double marks;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMarks(double marks) {
		this.marks=marks;
	}
	public double getMarks() {
		return marks;
	}
	
	public Student(String name , double marks) {
		this.name=name;
		this.marks=marks;
	}
	
	public void display() {
		System.out.println("name : "+name);
		System.out.println("marks : "+marks);
	}
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("hi",68);
		st.display();
		
		st.setMarks(20);
		System.out.println(st.getMarks());
		
		st.setName("hii");
		System.out.println(st.getName());
		
		st.display();
		
	}

}
