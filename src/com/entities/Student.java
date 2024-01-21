package com.entities;

public class Student extends Person{
	private int StudyLevel;
	private String specilarization;
	private double GPA;
	public Student() {
	}
	public Student(String name, int age, String address, String nationality) {
		super(name, age, address, nationality);

	}
	public Student(String name, int age, String address, String nationality, int studyLevel, String specilarization,
			double gPA) {
		super(name, age, address, nationality);
		StudyLevel = studyLevel;
		this.specilarization = specilarization;
		GPA = gPA;
	}
	public int getStudyLevel() {
		return StudyLevel;
	}
	public void setStudyLevel(int studyLevel) {
		StudyLevel = studyLevel;
	}
	public String getSpecilarization() {
		return specilarization;
	}
	public void setSpecilarization(String specilarization) {
		this.specilarization = specilarization;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}


}
