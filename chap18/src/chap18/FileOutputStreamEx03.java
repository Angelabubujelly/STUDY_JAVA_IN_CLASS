package chap18;

import java.io.*;
import java.io.FileNotFoundException;

public class FileOutputStreamEx03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String originalFileName = "D:\\KJK\\Workspace\\chap18\\src\\chap18\\dochilove.jpg";
	String targetFileName = "D:\\KJK\\Temp\\image1.jpg";
	
	FileInputStream fis = new FileInputStream(originalFileName);
	FileOutputStream fos = new FileOutputStream(targetFileName);
	
	int readByteNo;
	byte[] readBytes = new byte[200];
	while ( (readByteNo = fis.read(readBytes)) != -1) {
		fos.write(readBytes, 0, readByteNo);
	}
	fos.flush();
	fos.close();
	fis.close();
	
	System.out.println("º¹»ç¿Ï·æ");
	}

}
