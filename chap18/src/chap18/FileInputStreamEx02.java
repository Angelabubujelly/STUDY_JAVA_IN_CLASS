package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\KJK\\Workspace\\chap18\\src\\chap18\\FileInputStreamEx02.java");
	int data;
	while((data = fis.read())!= -1) {
	System.out.write(data);	
	}System.out.flush();
	fis.close();
	}

}
