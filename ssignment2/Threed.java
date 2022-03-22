package com.onebill.ssignment2;

public class Threed extends Twod {

	int z;
	public Threed(int  x,int  y,int  z)
	{
		super(x,y);
		this.z=z;
	}
	public int area()
	{
		return((x*y)+(z*x)+(y*z));
	}
	public int volume()
	{
		return(x*y*z);
	}

}
