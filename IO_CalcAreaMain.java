//����1�� ����ڿ��� ������ �Է¹޾� ������ ����ϱ�

package com.sd.IO;
import java.util.Scanner;

public class IO_CalcAreaMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� �Է����ּ��� : ");
		
		Double r = sc.nextDouble();

		double area = Math.PI*Math.pow(r,2);
		System.out.printf("������ : %.2f / ���� : %.2f",r,area);
	}
}