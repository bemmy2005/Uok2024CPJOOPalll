package com.entities;

public class SalariedEmployee extends Employee{
	private int bonus;
	private double deductions;
	public SalariedEmployee(String name, int age, String address, String nationality, int salary, int rank, String job,
			int bonus, double deductions) {
		super(name, age, address, nationality, salary, rank, job);
		this.bonus = bonus;
		this.deductions = deductions;
	}
	public SalariedEmployee() {}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	@Override
	public String toString() {
		return "SalariedEmployee [bonus=" + bonus + ", deductions=" + deductions + "]";
	}
	

}
