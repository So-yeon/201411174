package com.sd.Inheritance;

public class Rectangle{
	boolean isSel = false;
	String name = "Rectangle";

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