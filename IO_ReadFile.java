//����2�� ���Ϸκ��� �о����

package com.sd.IO;
import java.io.*;

public class IO_ReadFile{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("test.txt"); //root������ ����� ����
		fr.read();
		int i;
		while((i = fr.read()) != -1)
			System.out.print((char)i);
		fr.close();
	}
}