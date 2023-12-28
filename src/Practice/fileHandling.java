package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling{
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Sayali\\practiceFH.txt");
		if(!file.exists()) {
			System.out.println("File is created");
			file.createNewFile();
			}else {
				System.out.println("File is already created");
			}
		//TO PASS DATA IN FILE
		FileOutputStream fos=new FileOutputStream(file);
		String s1="My name is Sayali\n";
		fos.write(s1.getBytes());
		String s2="Rajendra\n";
		fos.write(s2.getBytes());
		String s3="Pagare\n";
		fos.write(s3.getBytes());
		
		//TO READ DATA IN CONSOLE
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
	}

	
     
	}


