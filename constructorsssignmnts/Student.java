package com.onebill.constructorsssignmnts;

public class Student {

	String name ;

	
	public Student() {
		this.name = "unknown";
		System.out.println("name "+name);
	}
	public Student(String name) {
		this.name = name;
		System.out.println("name "+name);
	}public Student(String name,String name1) {
		this(name);
		System.out.println("name "+name1);
	}
	
	
}

