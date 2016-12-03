package com.sd.ExtendShape;

public class Circle_Extend extends Shape_Extend{
	private double r;

	Circle_Extend(double _r){
		this.r = _r;
	}

	@Override
	public double calcArea(){
		System.out.println("Perimeter : " + (double)Math.PI*r*r);
		return (double)Math.PI*r*r;
	}

	@Override 
	public double calcPerimeter(){	
		System.out.println("Perimeter : " + 2*(double)Math.PI*r);
		return 2*(double)Math.PI*r;
	}


	public static void main(String[] args){
		Circle_Extend c = new Circle_Extend(5.0);

		System.out.println("********Circle********");
		c.calcArea();
		c.calcPerimeter();

	}
}