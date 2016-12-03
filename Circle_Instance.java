package com.sd.ShapeInstance;

public class Circle_Instance extends Shape_Instance{
	private double r;

	Circle_Instance(double _r){
		this.r = _r;
	}

	public double calcArea(){
		System.out.println("Area : " + (double)Math.PI*r*r);
		return (double)Math.PI*r*r;
	}

	public double calcPerimeter(){	
		System.out.println("Perimeter : " + 2*(double)Math.PI*r);
		return 2*(double)Math.PI*r;
	}


}