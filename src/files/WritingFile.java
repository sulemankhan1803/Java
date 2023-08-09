package files;

import java.io.FileWriter;
import java.io.IOException;
public class WritingFile {
	public static void main(String[] args) {
		try {
			FileWriter filewrite = new FileWriter("D:\\Programming\\Java\\Exercise\\src\\files\\Sample.txt");
			filewrite.write("Hello ! This is sample File for Checking\nAnother Line");
			System.out.println("File Written");
			filewrite.close();
		} catch (IOException e) {
			System.out.println("File not written");
			
			e.printStackTrace();
			
		}
		
	}

}
