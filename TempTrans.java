package com.sd.Prac;

class TempTrans{

	void tempTrans(float temp, String tem){
		if (tem == "C"){
			temp = 9*(temp/5)+32;
			tem = "F";
			System.out.printf("Converting to Fahrenheit... %.1f %s",temp,tem+ "\n");
		}
		else if (tem == "F"){
			temp = ((temp - 32)*5)/9;
			tem = "C";
			System.out.printf("Converting to Celcius... %.1f %s",temp,tem + "\n");
		}
		else 
			System.out.println("You insert wrong temp."+ "\n");
	}

	public static void main(String[] args){
		TempTrans t = new TempTrans();
		t.tempTrans(30.1f,"C");
		t.tempTrans(95.7f,"F");
		t.tempTrans(56.3f,"A");
	}
}