package com.sd.Inheritance;

public class Cube extends Rectangle{
	String name = "Cube";

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