package com.sd.Prac;
import java.util.*;

//1901년 1월1일~2000년 12월 31일
//c.set(year,month,1); 해당달 1일의 요일정보 얻기

class Sunday{
	Calendar c = Calendar.getInstance();

	int first = 1901;
	int last = 2000;
	int num = 0;

	void compute(){

		for(int y = first; y<=last; y++){
			for(int m = 0; m<12; m++){
				c.set(y,m,1);
				int day_of_week = c.get(Calendar.DAY_OF_WEEK);
				if(day_of_week==1){
					num+=1;
				}
			}	
		}



		System.out.println("20세기 100년 동안 매 월 첫째 날의 일요일은 " + num + " 회");
		
	}

	public static void main(String[] args){
		Sunday s = new Sunday();
		s.compute();
	}
}