package com.sd.ShapePolymp;

public class Circle_Polymp extends Shape_Polymp{
	private double r;

	Circle_Polymp(double _r){
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