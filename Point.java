package com.sd.Prac;

public class Point{
	private int x,y;
	Point(int _x, int _y){
		x = _x;
		y = _y;
	}
	
	public static void main(String[] args){
		Point p = new Point(10,20);
		Circle c = new Circle(10,20,5.0);

		c.getArea();
	}
}