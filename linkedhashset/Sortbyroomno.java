package com.onebill.linkedhashset;

import java.util.Comparator;

public class Sortbyroomno implements Comparator<Hostel> {

	@Override
	public int compare(Hostel o1, Hostel o2) {
		return o1.roomno-o2.roomno;
	}
	

	
}
