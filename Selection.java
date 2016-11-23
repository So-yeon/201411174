package com.sd.Inheritance;
import java.util.*;

public class Selection{
	Selection(){ }
	ArrayList<String> selList = new ArrayList<String>();

	void select(Rectangle r){
		r.setSelected(true);
		System.out.println("selected : " + r.isSel);
	
		System.out.println("==========Who is Selected?==========");

		if(r.getSelected() == true){
			String nName = r.getName();
			selList.add(nName);
		}
		System.out.println(selList + "\n");
	}

	public static void main(String[] args){
		Selection s = new Selection();
		Rectangle r = new Rectangle();
		Cube c = new Cube();
		Parallelogram p = new Parallelogram();
		s.select(r);
		s.select(p);
		s.select(c);
	}
}