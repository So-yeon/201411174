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
		Student s1 = new Student("家楷1",1);
		Student s2 = new Student("家楷2",2);
		Student s3 = new Student("家楷3",3);
		Student s4 = new Student("家楷4",4);

		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		studentNameList.add(s3.getName());
		studentNameList.add(s4.getName());

		Collections.sort(studentNameList);
		System.out.println(studentNameList);
	}
}