package com.sd.HelloToArray;

public class HelloToArray{
	private String name;

	public HelloToArray(String name){
		this.name = name;
	}

	public void sayHello(){
		System.out.println("Hello " + name);
	}

	public static void main(String[] args){
		HelloToArray[] h = new HelloToArray[5];
		h[0] = new HelloToArray("KSY1");
		h[1] = new HelloToArray("KSY2");
		h[2] = new HelloToArray("KSY3");
		h[3] = new HelloToArray("KSY4");
		h[4] = new HelloToArray("KSY5");

		for(HelloToArray e:h)	
			e.sayHello();
	}
}
