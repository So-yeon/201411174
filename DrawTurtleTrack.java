package com.sd.Structure;
import ch.aplu.turtle.*;
import java.util.*;

public class DrawTurtleTrack{

	static void drawSquare(double[][] tracks){
		Turtle t1 = new Turtle();

		for(double[] t:tracks){
			t1.moveTo(t[0],t[1]);
			System.out.println(t);
		}
	}


	public static void main(String[] args){  //static���� ������X
		double[][] tracks = {{100,100},{200,100},{200,200},{100,200},{100,100}};
		drawSquare(tracks);

	}
}

//�Է� : 4���� ������ �ִ� ���� "tracks"