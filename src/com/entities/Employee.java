package com.entities;

public class Employee extends Person {
	private int Salary;
	private int Rank;
	private String job;
	public Employee(String name, int age, String address, String nationality, int salary, int rank, String job) {
		super(name, age, address, nationality);
		Salary = salary;
		Rank = rank;
		this.job = job;
	}
	public Employee() {}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [Salary=" + Salary + ", Rank=" + Rank + ", job=" + job + "]";
	}

}
