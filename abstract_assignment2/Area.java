package com.onebill.abstract_assignment2;

public class Area extends Shape {

	@Override
	public int rectanglearea(int l, int b) {
		return l*b;
	}

	@Override
	public int squarearea(int side) {
		return side*side;
	}

	@Override
	public double circlearea(double radius) {
		return 3.14*radius*radius;
	}

}
