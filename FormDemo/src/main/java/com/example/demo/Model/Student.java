package com.example.demo.Model;

public class Student {
	private int rollno;
	private String name;
	private String gender;
	private String course;
	private String dob;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", gender=" + gender + ", course=" + course + ", dob="
				+ dob + "]";
	}
	

}
