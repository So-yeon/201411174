package com.sd.ShapePolymp;
import java.util.*;

public abstract class Shape_Polymp{

	public abstract double calcArea();

	public static void main(String[] args){
		Rectangle_Polymp r = new Rectangle_Polymp(3.0,4.0);
		Circle_Polymp c = new Circle_Polymp(5.0);

		Shape_Polymp[] s = new Shape_Polymp[2];
		s[0] = r;
		s[1] = c;

		for(Shape_Polymp my:s){
				System.out.println(my.toString());
				my.calcArea();
		}
	}
}