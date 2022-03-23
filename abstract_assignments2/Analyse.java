package com.onebill.abstract_assignments2;

public abstract class Analyse {
	public  Analyse(){
		System.out.println("this is the abstract class constructor ");
	}
	public abstract void a_method();
	public  void na_method() {
		System.out.println( "this is an non abstract method in an abstract class");
	}

}
