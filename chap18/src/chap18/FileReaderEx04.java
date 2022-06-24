package chap18;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx04 {

	public static void main(String[] args) throws Exception {
 FileReader fr = new FileReader("D:\\KJK\\Workspace\\chap18\\src\\chap18\\FileReaderEx04.java");
 
 int readCharNo;
 char[] ch = new char[100];
 while ((readCharNo = fr.read(ch)) != -1) {
	  String data = new String(ch, 0, readCharNo);
	  System.out.print(data);
 }
fr.close();
	}

}
