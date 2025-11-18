package com.lavish.spring.model;

public class Employee {
//Instance Var / Attribute / Properties
	private String name, gender;
	private int id;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Employee.employee()");
	}
	public Employee(String name, String gender, int id) {
		super();
		this.name = name;
		this.gender = gender;
		this.id = id;
		
		System.out.println("Employee.employee(3)");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Employee.setName()");
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Employee.setGender()");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("Employee.setId()");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", id=" + id + "]";
	}
	
	
}
