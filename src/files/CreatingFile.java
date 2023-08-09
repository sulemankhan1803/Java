package files;

import java.io.File;
import java.io.IOException;
public class CreatingFile {
	public static void main(String[] args) {
		File studentData = new File("D:\\Programming\\Java\\Exercise\\StudentData.txt");
		try {
			studentData.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println("File Not Created");
			e.printStackTrace();
		}
		 
	}

}
