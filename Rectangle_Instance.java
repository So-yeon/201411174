package com.sd.ShapeInstance;

public class Rectangle_Instance extends Shape_Instance{

	private double width,height;
		
	Rectangle_Instance(double _width, double _height){
		this.width = _width;
		this.height = _height;
	}

	public double calcArea(){
		System.out.println("Area : " + width*height);
		return width * height;
	}

	public double calcPerimeter(){
		System.out.println("Perimeter : " + (width + height)*2);
		return (width + height)*2;
	}

}