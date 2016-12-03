package com.sd.ShapeInstance;
import java.util.*;

public class Shape_Instance{

	public static void main(String[] args){
		Rectangle_Instance r = new Rectangle_Instance(3.0,4.0);
		Circle_Instance c = new Circle_Instance(5.0);

		Shape_Instance[] s = new Shape_Instance[2];
		s[0] = r;
		s[1] = c;

		for(Shape_Instance my:s){
			if(my instanceof Rectangle_Instance){
				System.out.println(my.toString());
				r.calcArea();
			}
			else if (my instanceof Circle_Instance){
				System.out.println(my.toString());
				c.calcArea();
			}
		}
	}
}