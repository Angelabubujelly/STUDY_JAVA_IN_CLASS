package chap18;

import java.io.*;

public class FileWriterEx05 {

	public static void main(String[] args) throws Exception {
	FileWriter fw = new FileWriter("D:\\KJK\\Temp\\file.txt", true);
fw.write("�� �����" + "\r\n");
fw.write("������ " + "\r\n");
fw.flush();
fw.close();
System.out.println("Great job");
		
	}

}
