//문제2번 파일로부터 읽어오기

package com.sd.IO;
import java.io.*;

public class IO_ReadFile{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("test.txt"); //root폴더에 저장된 문서
		fr.read();
		int i;
		while((i = fr.read()) != -1)
			System.out.print((char)i);
		fr.close();
	}
}