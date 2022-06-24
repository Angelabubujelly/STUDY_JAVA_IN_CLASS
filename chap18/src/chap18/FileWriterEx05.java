package chap18;

import java.io.*;

public class FileWriterEx05 {

	public static void main(String[] args) throws Exception {
	FileWriter fw = new FileWriter("D:\\KJK\\Temp\\file.txt", true);
fw.write("¾Æ ¹è°íÆÄ" + "\r\n");
fw.write("Èì³ÄÈì³Ä " + "\r\n");
fw.flush();
fw.close();
System.out.println("Great job");
		
	}

}
