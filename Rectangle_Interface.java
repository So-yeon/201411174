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

	@Override //재정의 해준다는 뜻
	public double calcPermeter(){	//인터페이스에 있는 모든 함수를 물려받아야함 (부모꺼를 하나라도 빼먹으면 안된다.
		System.out.println("Permeter : " + (width + height)*2);
		return (width + height)*2;
	}

	public static void main(String[] args){
		Rectangle_Interface r = new Rectangle_Interface(3,4);
		r.calcArea();
		r.calcPermeter();
	}
}