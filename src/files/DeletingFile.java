package files;

import java.io.File;
public class DeletingFile {
	public static void main(String[] args) {
		
		File myfile = new File("Sample.txt");
		
		if(myfile.delete()) {
			System.out.println("File is deleted "+myfile.getName());
		}else {
			System.out.println("File is not Deleted");
		}
		
	}

}
