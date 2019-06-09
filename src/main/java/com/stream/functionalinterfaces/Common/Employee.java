package com.stream.functionalinterfaces.Common;

public class Employee {
	String name;
	int salary;

	public Employee(String n,int s) {
		salary=s;
		name=n;
	}

	@Override
	public String toString() {
		String s=String.format("%s %d",name,salary);
		return s;
	}

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
