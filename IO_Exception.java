//문제5번 파일을 읽어서 출력하는 경우, 존재하지 않아 발생하는 예외처리

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