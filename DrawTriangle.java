package com.sd.Prac;

class DrawTriangle{
	String s = "*";
	String b = " ";
	StringBuffer sbuf = new StringBuffer();

	void draw(){
		for(int i=1; i<10; i+=2){
			for(int j=0; j< (4-i/2); j++){
				sbuf.append(b);
			}
			for(int k=0; k<i; k++){
				sbuf.append(s);
			}
				sbuf.append(b);
		
			System.out.printf("%s\n",sbuf.toString());
			sbuf.delete(0,sbuf.length());
		}
	}

	public static void main(String[] args){
		DrawTriangle d = new DrawTriangle();
		d.draw();
	}
}