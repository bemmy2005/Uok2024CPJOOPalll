package com.entities;



public class Person {
	private String Name;
	private int age;
	private String Address;
	private String nationality;
	public Person(String name, int age, String address, String nationality) {
		Name = name;
		this.age = age;
		Address = address;
		this.nationality = nationality;
	} 
	public Person() {}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + ", Address=" + Address + ", nationality=" + nationality + "]";
	}
	
}
