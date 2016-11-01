package com.sd.Prac;

class PointToGrade{
	String grade = "";
	void computeGrade(double marks){
		if(marks == 100){
			grade = "A+";
			System.out.println(grade);
		}
		else if(90<= marks && marks< 100){
			grade = "A";
			System.out.println(grade);
		}
		else if(80<= marks && marks< 90){
			grade = "B";
			System.out.println(grade);
		}
		else if(70<= marks && marks< 80){
			grade = "C";
			System.out.println(grade);
		}
		else if(60<= marks && marks<70){
			grade = "D";
			System.out.println(grade);
		}
		else {
			grade = "F";
			System.out.println(grade);
		}
	}

	public static void main(String[] args){
		PointToGrade p = new PointToGrade();
		p.computeGrade(100);
		p.computeGrade(78);
		p.computeGrade(30);
	}
}