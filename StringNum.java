package com.sd.Structure;
import java.util.*;

public class StringNum{
	int i;

	void newString(){
		char[] letters = "Sangmyung university".toCharArray();
		for(char c:letters){
			i+=1;
		}
		System.out.println("# String num : " + i);
		System.out.println("# See a string num graph");
		for(char c:letters){
			System.out.print("¤±");
		}
		
	}
	public static void main(String[] args){
		StringNum s = new StringNum();
		s.newString();
	}
}