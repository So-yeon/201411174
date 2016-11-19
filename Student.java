package com.sd.Structure;
import java.util.*;

class Student{
	public String name;
	public int studentNum;

	Student(String name, int sNum){
		this.name = name;
		this.studentNum = sNum;
	}

	public String getName(){
		return name;
	}
	

	public static void main(String[] args){

		ArrayList<String> studentNameList = new ArrayList<String>();
		Student s1 = new Student("�ҿ�1",1);
		Student s2 = new Student("�ҿ�2",2);
		Student s3 = new Student("�ҿ�3",3);
		Student s4 = new Student("�ҿ�4",4);

		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());

		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}