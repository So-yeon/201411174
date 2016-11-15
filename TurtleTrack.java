package com.sd.Structure;
import java.util.*;
import ch.aplu.turtle.*;

public class TurtleTrack{
	Turtle t1 = new Turtle();

	void drawSquareAtSave(){
		Double[] pos = new Double[2];
		pos[0] = 10.0;
		pos[1] = 20.0;
		ArrayList<Double[]> posArr = new ArrayList<Double[]>();
		posArr.add(pos);
		for(Double[] d:posArr){
			System.out.printf("(%.1f , %.1f)",d[0],d[1]);
		}

		for(int i = 0; i<4; i++){
			pos[0] = t1.getX();
			pos[1] = t1.getY();
			posArr.add(pos);
			t1.forward(100);
			t1.right(90);
		}
	}
	
	public static void main(String[] args){
		TurtleTrack t = new TurtleTrack();
		t.drawSquareAtSave();
	}
}