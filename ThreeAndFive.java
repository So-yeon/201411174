package com.sd.Prac;

class ThreeAndFive{
	int sum = 0;
	
	void comp(){
		for(int num=0;num<1000;num++){
		  if(num%3==0 || num%5==0){
		  	  sum = sum+num;
		  }
		  else
			  sum = sum;
		  }
		System.out.println("Sum : " + sum);	
	}

	public static void main(String[] args){
		ThreeAndFive t = new ThreeAndFive();
		t.comp();
	}
}