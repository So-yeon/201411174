package com.sd.point2D;
import ch.aplu.turtle.*;

public class Square{
	Turtle t1 = new Turtle();

	void drawSquare(int size){
		for(int i=0; i<4; i++) {
			t1.forward(size);
			t1.right(90);
		}
	}
	public static void main(String[] args){
		Square s1 = new Square();
		s1.drawSquare(100);
	}
}
