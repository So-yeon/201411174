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

	@Override //������ ���شٴ� ��
	public double calcPerimeter(){	//�������̽��� �ִ� ��� �Լ��� �����޾ƾ��� (�θ𲨸� �ϳ��� �������� �ȵȴ�.
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