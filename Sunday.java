package com.sd.Prac;
import java.util.*;

//1901�� 1��1��~2000�� 12�� 31��
//c.set(year,month,1); �ش�� 1���� �������� ���

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



		System.out.println("20���� 100�� ���� �� �� ù° ���� �Ͽ����� " + num + " ȸ");
		
	}

	public static void main(String[] args){
		Sunday s = new Sunday();
		s.compute();
	}
}