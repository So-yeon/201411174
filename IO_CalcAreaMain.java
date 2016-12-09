//문제1번 사용자에게 반지름 입력받아 원넓이 출력하기

package com.sd.IO;
import java.util.Scanner;

public class IO_CalcAreaMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름을 입력해주세요 : ");
		
		Double r = sc.nextDouble();

		double area = Math.PI*Math.pow(r,2);
		System.out.printf("반지름 : %.2f / 넓이 : %.2f",r,area);
	}
}