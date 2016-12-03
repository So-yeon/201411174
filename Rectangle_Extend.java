package com.sd.ExtendShape;

public class Rectangle_Extend extends Shape_Extend{
	private double width,height;
		
	Rectangle_Extend(double _width, double _height){
		this.width = _width;
		this.height = _height;
	}

	@Override
	public double calcArea(){
		System.out.println("Area : " + width*height);
		return width * height;
	}

	@Override //재정의 해준다는 뜻
	public double calcPerimeter(){	//인터페이스에 있는 모든 함수를 물려받아야함 (부모꺼를 하나라도 빼먹으면 안된다.
		System.out.println("Perimeter : " + (width + height)*2);
		return (width + height)*2;
	}

	public static void main(String[] args){
		Rectangle_Extend r = new Rectangle_Extend(3.0,4.0);

		System.out.println("********Rectangle********");
		r.calcArea();
		r.calcPerimeter();
	}

}