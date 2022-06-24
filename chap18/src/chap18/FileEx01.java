package chap18;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx01 {

	public static void main(String[] args) throws Exception { //throw �־����������
		// TODO Auto-generated method stub
	File dir = new File("D:\\KJK\\Temp\\Dir");
	File file1 = new File("D:\\KJK\\Temp\\file1.txt");
	File file2 = new File("D:\\KJK\\Temp\\file2.txt");
	File file3 = new File(new URI("file:///D:/KJK/Temp/file3.txt"));

//������ �ص� �ƹ��͵� �� �������� ��ü ������ �� �� !
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
		System.out.println("\t��¥\t   �ð�\t\t ����       ũ�� \t �̸�");
		System.out.println("������������������������������������������������������������������������������������������");
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
