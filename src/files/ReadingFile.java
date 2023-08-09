package files;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadingFile {
	public static void main(String[] args) throws IOException {
		FileReader myFile = new FileReader("D:\\Programming\\Java\\Exercise\\src\\files\\Sample.txt");
		
		Scanner scan = new Scanner(myFile);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
			scan.close();
		
//		int i;
//		while((i = myFile.read())!= -1) {
//			System.out.print((char)i);
//			scan.close();
			
		}
	}


