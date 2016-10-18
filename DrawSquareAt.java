package com.sd.point2D;
import ch.aplu.turtle.*;
import java.awt.geom.*;

class DrawSquareAt {
	Turtle t1 = new Turtle();

	void drawSquareAt(int size,Point2D.Double p){
		t1.setPos(p);

		for(int i=0; i<4; i++) {
			t1.forward(size);
			t1.right(90);
		}
	}
}
