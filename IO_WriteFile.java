//����4�� ���Ͽ� ����

package com.sd.IO;
import java.io.*;

public class IO_WriteFile{
	public static void main(String[] args) throws Exception{
		File f = new File("soyeon.txt");

		FileWriter fw = new FileWriter(f);
		fw.write("Hi Soyeon! Happy 2017~");
		fw.close();
	}
}