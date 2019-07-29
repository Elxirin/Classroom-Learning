package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Student_Test {

	public static void main(String[] args) {
		Student stu = new Student(101, "Abhishek", 99.9f);
		File file = new File("C:\\Users\\abrotti\\Desktop\\Readme3.txt");
		String ns = "How are you?";
		try (FileOutputStream fileOutput = new FileOutputStream(file);
				ObjectOutputStream objectoutput = new ObjectOutputStream(fileOutput)) {
			objectoutput.writeObject(stu);
			fileOutput.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("File is written..");
		
		try (FileInputStream fileInput = new FileInputStream(file);
				ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
			Student s1 = (Student) objectInput.readObject();
			System.out.println(s1.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
