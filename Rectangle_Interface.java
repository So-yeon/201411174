package com.sd.InterfaceShape;

public class Rectangle_Interface implements Shape_Interface{
	private double width,height;

	Rectangle (double _width, double _height){
		this.width = _width;
		this.height = _height;
	}

	@Override
	public double calcArea(){
		System.out.println("Area : " + width*height);
		return width * height;
	}

	@Override //������ ���شٴ� ��
	public double calcPermeter(){	//�������̽��� �ִ� ��� �Լ��� �����޾ƾ��� (�θ𲨸� �ϳ��� �������� �ȵȴ�.
		System.out.println("Permeter : " + (width + height)*2);
		return (width + height)*2;
	}

	public static void main(String[] args){
		Rectangle_Interface r = new Rectangle_Interface(3,4);
		r.calcArea();
		r.calcPermeter();
	}
}