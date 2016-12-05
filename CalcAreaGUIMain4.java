package com.sd.gui;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Container;

public class CalcAreaGUIMain4 extends JFrame implements ActionListener{
	JTextField radiusTF1;
	JTextField areaTF1;

	public void CalcAreaGUIMain(){

		JPanel panel = new JPanel(new GridLayout(3,2)); 
		getContentPane().add(panel);  
		
		JLabel label1 = new JLabel("������");
		radiusTF1 = new JTextField(10); 

		JLabel label2 = new JLabel("����");
		areaTF1 = new JTextField(10);  

		JButton b1 = new JButton("���");
		JButton b2 = new JButton("���");

		b1.addActionListener(this);
		b2.addActionListener(this);

		panel.add(label1);
		panel.add(radiusTF1);
		panel.add(label2);
		panel.add(areaTF1);
		panel.add(b1);
		panel.add(b2);
		

		pack();  
 		setVisible(true);
	}


	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource(); 
		
		if(b.getText().equals("���")){
			b.setText("���OK");  

			Double r = Double.parseDouble(radiusTF1.getText()); 

			areaTF1.setText(Double.toString(Math.PI * Math.pow(r,2))); 
		}
		else if(b.getText().equals("���")){
			radiusTF1.setText(" ");
			areaTF1.setText(" ");
		} 
	}

	public static void main(String[] args){
		CalcAreaGUIMain4 c = new CalcAreaGUIMain4();
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.CalcAreaGUIMain();
		c.pack();
		c.setVisible(true);

	}
}