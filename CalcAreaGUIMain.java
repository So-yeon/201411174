package com.sd.gui;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JButton;  //GUI��� ���� �� ���� ������.

import java.awt.*;
//import java.awt.Container;  //��� �ڹ� �����ȿ� �ִ°� �ƴ�. �����Ұ�!

public class CalcAreaGUIMain{   //HASA���迩�� extends ����.
	public static void main(String[] args){
		//JFrame ����ü�� â 
		//JPanel �� ��ü�� â �� �� ���� JFrame���� �÷�����.��3�� ��2����

		JFrame f = new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2)); 
		//new GridLayout(3,2) - �� �ķ� ��ä���� �ۼ���.

		f.getContentPane().add(panel);   //getContentPane ���� �����ͼ� �װ��� panel�� add
		JLabel label1 = new JLabel("������");
		JTextField radiusTF1 = new JTextField(10);  //10���� ���� ��.

		JLabel label2 = new JLabel("����");
		JTextField areaTF1 = new JTextField(10);  

		///�ι�° ���� ������ (�����ϱ�)

		JButton b1 = new JButton("���");
		JButton b2 = new JButton("���");
		
		panel.add(label1);//grid ���̾ƿ����� �ϳ��� �ִ�����.
		panel.add(radiusTF1);
		panel.add(label2);
		panel.add(areaTF1);
		panel.add(b1);
		panel.add(b2);

		f.pack();  //pack-> â�� ��ŷ�Ѵ�.(���濡 ���ε�)
 		f.setVisible(true);
	}
}