package com.sd.point2D;
import ch.aplu.turtle.*;

class Star {
	Turtle t1 = new Turtle();

	void drawStar(int size){
		for(int i=0; i<5; i++) {
			t1.forward(size);
			t1.right(144);
		}
	}
	public static void main(String[] args){
		Star s3 = new Star();
		s3.drawStar(100);
	}
}
