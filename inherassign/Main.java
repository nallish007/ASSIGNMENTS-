package com.onebill.inherassign;

public class Main {

	public static void main(String[] args) {
		Employee e =new Employee();
		e.name="madhavan";
		e.age=21;
		e.phoneno=986574321;
		e.address="12/5 Ath main road ,hyperloop,magnetic levitation";
		e.salary=30000;
		
		e.specialization="java";
		System.out.println("=================================");
		System.out.println(e.name);
		System.out.println(e.age);

		System.out.println(e.phoneno);
		System.out.println(e.specialization);
		e.printsalary();
		System.out.println("=================================");
		Manager m =new Manager();
		m.name="jack sparrow";
		m.age=45;
		m.phoneno=985455451;
		m.address="54/5 gandhi nagar ,harry pottor street  ";
		m.salary=50000;
		m.department="automated testing";
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.department);
		System.out.println(m.phoneno);

		m.printsalary();

		
				
		

	}

}
