package chap18;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx01 {

	public static void main(String[] args) throws Exception { //throw 넣어줘야행행행
		// TODO Auto-generated method stub
	File dir = new File("D:\\KJK\\Temp\\Dir");
	File file1 = new File("D:\\KJK\\Temp\\file1.txt");
	File file2 = new File("D:\\KJK\\Temp\\file2.txt");
	File file3 = new File(new URI("file:///D:/KJK/Temp/file3.txt"));

//실행을 해도 아무것도 안 보이지만 객체 생성은 된 것 !
			if(dir.exists() == false)
				dir.mkdirs();
			if (file1.exists()==false)
				file1.createNewFile();
			if (file2.exists()==false)
				file2.createNewFile();
			if (file3.exists()==false)
				file3.createNewFile();

		File temp = new File("D:\\\\KJK\\\\Temp");
		File[]	contents = temp.listFiles();
		System.out.println("\t날짜\t   시간\t\t 형태       크기 \t 이름");
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD a HH:mm");
		for (File file: contents) {
			System.out.print(sdf.format( new Date(file.lastModified())));
			if (file.isDirectory()) 
				System.out.print("\t <DIR> \t\t" + file.getName());
			else
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			System.out.println();

} 
	}

}
