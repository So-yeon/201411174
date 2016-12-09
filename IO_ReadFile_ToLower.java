//문제 3번 LowerCase로 출력하기

package com.sd.IO;
import java.io.*;

public class IO_ReadFile_ToLower{
	public static void main(String[] args) throws Exception{
		File f = new File("test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;

		while((s = br.readLine()) != null){	
			System.out.print(s.toLowerCase());
		}
		br.close();
	}
}