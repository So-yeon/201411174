//����5�� ������ �о ����ϴ� ���, �������� �ʾ� �߻��ϴ� ����ó��

package com.sd.IO;
import java.io.*;

public class IO_Exception{
	public static void main(String[] args) throws FileNotFoundException{
		try{
			File f = new File("noname.txt");
			FileReader fr = new FileReader(f);			
		}
		catch(FileNotFoundException e){}
	}
}