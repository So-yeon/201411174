package com.sd.Structure;
import java.util.*;

public class StringMirror{
	String olleh = "olleh";
	StringBuilder hello = new StringBuilder();

	void mirrorString(){
		char[] charArr = olleh.toCharArray();
		for(int i = charArr.length-1; i>=0; i--){
			hello.append(charArr[i]);
		}
		System.out.println(hello);
			
	}

	public static void main(String[] args){
		StringMirror s = new StringMirror();
		s.mirrorString();
	}
}