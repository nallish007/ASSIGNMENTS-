package com.onebill.treeset;

import java.util.Iterator;

import java.util.TreeSet;

public class Treesetdemo {
//String and Wrapper classes are Comparable by default. To add user-defined
	//objects in TreeSet, you need to implement the Comparable interface.
	public static void main(String[] args) {

		Hostel r001 = new Hostel(001, "dinesh","mugilan","nallish");
		Hostel r002 = new Hostel(002, "vignesh","gogul");
		Hostel r003 = new Hostel(003, "dinesh");
		Hostel r005 = new Hostel(005, "rajan","mogan");
		Hostel r006 = new Hostel(004, "sasi","suresh","maddy");
		Hostel r007 = new Hostel(005, "naveen","krishna","harish");
		TreeSet<Hostel> ts = new TreeSet<Hostel>();
		ts.add(r005);
		ts.add(r003);
		ts.add(r002);
		ts.add(r007);
		ts.add(r001);
		ts.add(r006);
		Iterator<Hostel> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
