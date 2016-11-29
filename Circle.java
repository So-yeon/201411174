package com.sd.Prac;

public class Circle extends Point{
	private double radius;
	Circle(int _x,int _y,double _r){
		super(_x,_y);
		radius = _r;
	}

	public double getArea(){
		System.out.println((float)Math.PI * radius * radius);
		return (float)Math.PI * radius * radius;
	}

}