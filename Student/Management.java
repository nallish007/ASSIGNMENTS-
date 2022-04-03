package com.onebill.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Management {

	public static void main(String[] args) {
		Student jack = new  Student(1, "JACK", "EEE", 7.5);
		System.out.println(jack);
		Student capt = new  Student(5, "CAPT", "EEE", 8.21);
		System.out.println(capt);
		Student will = new  Student(4, "WILL", "EEE", 9.5);
		System.out.println(will);
		Student tom = new  Student(39, "TOM", "EEE", 8.2);
		System.out.println(tom);
		Student james = new  Student(25, "JAMES", "EEE", 7.9);
		System.out.println(james);
		Student james2 = new  Student(25, "JAMES", "EEE", 7.9);
		System.out.println(james2);
	    HashSet<Student> hs = new HashSet<Student>();
	    hs.add(james);
	    hs.add(james2);//since we overrided the hashcode the
	    //hashcode for the james2 will also be 25 hence 
	    //the hs negate the object
	    hs.add(will);
	    hs.add(tom);
	    hs.add(capt);
	    hs.add(jack);
//	    System.out.println(hs);
	    System.out.println("=============Hashset================================");
		Iterator<Student> itr  =hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//	    System.out.println("=============linkedhashset==========================");
//	    LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
//	    lhs.add(james);
//	    lhs.add(jack);
//	    lhs.add(will);
//	    lhs.add(tom);
//	    lhs.add(capt);
//	    Iterator<Student>Itr2 = lhs.iterator();
//	   
//		while(Itr2.hasNext()) {
//			System.out.println(Itr2.next());
//		}
		System.out.println("=============sortedbyrollno======================");
	    ArrayList<Student> al= new ArrayList<Student>(hs);
	   Collections.sort(al, new Sortbyrollnno());
	   Iterator<Student> itr3 = al.iterator();
	   while(itr3.hasNext()) {
		   System.out.println(itr3.next());
	   }
	   System.out.println("==============sortbyname====================");
	   ArrayList<Student> al1= new ArrayList<Student>(hs);
	   Collections.sort(al1, new Sortbyname());
	   Iterator<Student> itr4 = al1.iterator();
	   while(itr4.hasNext()) {
		   System.out.println(itr4.next());
	   }

	}

}
