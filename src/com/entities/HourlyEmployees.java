/**
 * 
 */
package com.entities;

/**
 * @author bemmy
 *
 */
public class HourlyEmployees extends Employee {
private int Workinghours;
private double Hour_rate;
	/**
	 * @param name
	 * @param age
	 * @param address
	 * @param nationality
	 * @param salary
	 * @param rank
	 * @param job
	 */
	public HourlyEmployees(String name, int age, String address, String nationality, int salary, int rank, String job) {
		super(name, age, address, nationality, salary, rank, job);
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployees(String name, int age, String address, String nationality, int salary, int rank, String job,
			int workinghours, double hour_rate) {
		super(name, age, address, nationality, salary, rank, job);
		Workinghours = workinghours;
		Hour_rate = hour_rate;
	}

	/**
	 * 
	 */
	public HourlyEmployees() {
		// TODO Auto-generated constructor stub
	}

	public int getWorkinghours() {
		return Workinghours;
	}

	public void setWorkinghours(int workinghours) {
		Workinghours = workinghours;
	}

	public double getHour_rate() {
		return Hour_rate;
	}

	public void setHour_rate(double hour_rate) {
		Hour_rate = hour_rate;
	}
	

}
