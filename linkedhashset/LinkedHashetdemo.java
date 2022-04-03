package com.onebill.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashetdemo {
public static void main(String[] args) {
	Hostel r001 = new Hostel(001, "dinesh","mugilan","nallish");
	Hostel r002 = new Hostel(002, "vignesh","gogul");
	Hostel r003 = new Hostel(003, "dinesh");
	Hostel r005 = new Hostel(005, "rajan","mogan");
	Hostel r006 = new Hostel(004, "sasi","suresh","maddy");
	Hostel r007 = new Hostel(005, "naveen","krishna","harish");
	LinkedHashSet<Hostel> lhs = new LinkedHashSet<Hostel>();
	lhs.add(r005);
	lhs.add(r003);
	lhs.add(r002);
	lhs.add(r007);
	lhs.add(r001);
	lhs.add(r006);
	Iterator<Hostel> itr = lhs.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	ArrayList<Hostel> al = new ArrayList<Hostel>(lhs);
	System.out.println("------sorting by no. of persons-------");
	Collections.sort(al);
	Iterator<Hostel> itr1 = al.iterator();
	while (itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	System.out.println("------sorting by roomno.-------");
	Collections.sort(al, new Sortbyroomno());
	Iterator<Hostel> itr2 = al.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
}
}
