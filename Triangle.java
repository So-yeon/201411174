package com.sd.point2D;
import ch.aplu.turtle.*;

class Triangle {
	Turtle t1 = new Turtle();

	void drawTriangle(int size){
		for(int i=0; i<3; i++) {
			t1.forward(size);
			t1.right(120);
		}
	}
	public static void main(String[] args){
		Triangle t2 = new Triangle();
		t2.drawTriangle(100);
	}
}
