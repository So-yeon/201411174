package com.sd.Inheritance;

public class Parallelogram extends Rectangle{
	String name = "Parallelogram";

	void setSelected(boolean b){
		this.isSel = b;
	}
	boolean getSelected(){
		return isSel;
	}
	void setName(String n){
		this.name = n;
	}
	String getName(){
		return name;
	}
}