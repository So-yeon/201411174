package com.sd.Structure;
import java.util.*;

class List1{
	int sum = 0;
	List<Integer> intList = new ArrayList<Integer>();

	void printAll(){
		for(int i =0; i<=1000; i++){
			if(i%4==0 && i%5!=0){
				intList.add(i);
			}
		}

		for(int j:intList){
			System.out.print(j+", ");
		}
		printSum();

	}

	void printSum(){
		for(int i:intList){
			sum += i;
		}
		System.out.println("Total sum is " + sum);
	}

	public static void main(String[] args){
		List1 l = new List1();
		l.printAll();
	}
}