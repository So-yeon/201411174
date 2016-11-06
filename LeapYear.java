package com.sd.Prac;

class LeapYear{
	int year = 0;

	void compute(int year){
		if(year%4==0 && year%100 != 0 || year%400 == 0){	
			System.out.println("Year " + year + " is a leap year!");
		}
		else
			System.out.println("Year " + year + " is a not leap year.");
	}

	public static void main(String[] args){
		LeapYear l = new LeapYear();
		l.compute(1995);
		l.compute(2010);
		l.compute(2016);
	}
}