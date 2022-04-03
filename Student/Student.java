package com.onebill.Student;

import java.util.Objects;

public class Student {

	int rollno;
	String name;
	String dept;
	double cgpa;

	public Student(int rollno, String name, String dept, double d) {
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
		this.cgpa = d;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", dept=" + dept + ", cgpa=" + cgpa + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(rollno);
	}

	@Override
	// here student from the caller is upcasted to the super mos object class
	// hence this obj must be downcasted to the student class
	public boolean equals(Object obj) {
		Student objStudent = (Student) obj;
		return this.rollno == objStudent.rollno;
	}

//in order to avoid duplicate values we need to override the hashcode 
//and equals to methods will using the custom classes 

}
