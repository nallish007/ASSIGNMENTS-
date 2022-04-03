package com.onebill.treeset;

public class Hostel implements Comparable<Hostel> {

	int roomno;
	int noofper;
	String name1 = null;
	String name2 = null;
	String name3 = null;

	public Hostel(int roomno, String name1, String name2, String name3) {
		this(roomno, name1, name2);
		this.noofper = 3;
		this.name3 = name3;
	}

	public Hostel(int roomno, String name1, String name2) {
		this(roomno, name1);
		this.roomno = roomno;
		this.noofper = 2;
		this.name2 = name2;

	}

	public Hostel(int roomno, String name1) {
		this.roomno = roomno;
		this.noofper = 1;
		this.name1 = name1;

	}

	@Override
	public String toString() {
		switch (noofper) {
		case 3:
			return "Hostel [roomno=" + roomno + ", noofper=" + noofper + ", name1=" + name1 + ", name2=" + name2
					+ ", name3=" + name3 + "]";

		case 2:
			return "Hostel [roomno=" + roomno + ", noofper=" + noofper + ", name1=" + name1 + ", name2=" + name2 + "]";

		case 1:
			return "Hostel [roomno=" + roomno + ", noofper=" + noofper + ", name1=" + name1 + "]";

		default:
			break;
		}
		return "Hostel [roomno=" + roomno + ", noofper=" + noofper + ", name1=" + name1 + ", name2=" + name2
				+ ", name3=" + name3 + "]";

	}

	@Override
	public int hashCode() {
		return roomno;
	}

	@Override
	public boolean equals(Object obj) {
		Hostel hst = (Hostel) obj;
		return this.roomno == hst.roomno;
	}

	@Override
	public int compareTo(Hostel o) {
		if(this.noofper-o.noofper==0) {
			return this.roomno-o.roomno;
		}
		else {
			return this.noofper-o.noofper;	
		}
	}

}
