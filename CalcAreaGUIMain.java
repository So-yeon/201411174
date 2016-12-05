package com.sd.gui;
import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JButton;  //GUI요소 넣을 때 마다 적어줌.

import java.awt.*;
//import java.awt.Container;  //얘는 자바 스윙안에 있는거 아님. 주의할것!

public class CalcAreaGUIMain{   //HASA관계여서 extends 안함.
	public static void main(String[] args){
		//JFrame 그자체로 창 
		//JPanel 그 자체로 창 될 수 없음 JFrame위에 올려야함.행3개 열2개로

		JFrame f = new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2)); 
		//new GridLayout(3,2) - 행 렬로 꽉채워서 작성됨.

		f.getContentPane().add(panel);   //getContentPane 페인 가져와서 그곳에 panel을 add
		JLabel label1 = new JLabel("반지름");
		JTextField radiusTF1 = new JTextField(10);  //10글자 들어가게 함.

		JLabel label2 = new JLabel("넓이");
		JTextField areaTF1 = new JTextField(10);  

		///두번째 행은 빼먹음 (구현하기)

		JButton b1 = new JButton("계산");
		JButton b2 = new JButton("취소");
		
		panel.add(label1);//grid 레이아웃으로 하나씩 넣는중임.
		panel.add(radiusTF1);
		panel.add(label2);
		panel.add(areaTF1);
		panel.add(b1);
		panel.add(b2);

		f.pack();  //pack-> 창에 패킹한다.(가방에 짐싸듯)
 		f.setVisible(true);
	}
}