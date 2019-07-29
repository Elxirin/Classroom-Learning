package capgemini.io;

import java.io.File;
import java.util.Date;

public class Test_file {

	public static void main(String[] args) {
		
		File f, f1;
		f = new File("C:\\Users\\abrotti\\Desktop\\Readme.txt");
		f1 = new File("C:\\Users");
		
		System.out.println("exists: " + f.exists());
		System.out.println("file: " + f.isFile());
		System.out.println("Directory: " + f.isDirectory());
		System.out.println("Length: " + f.length());
		System.out.println("Can read: " + f.canRead());
		System.out.println("Can write: " + f.canExecute());
		System.out.println("Can Execute: " + f.canExecute());
		System.out.println("Path: " + f.getPath());
		System.out.println("Date: " + new Date(f.lastModified()));
		
		File[] files = f1.listFiles();
		for(File file: files) {
			System.out.println(file.getName());
		}
	}

}
