package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutput_Test {

	public static void fileOutputStream1() {
		File file = new File("C:\\Users\\abrotti\\Desktop\\Readme2.txt");
		String ns = "How are you?";
		try (FileOutputStream fileOutput = new FileOutputStream(file)) {
			fileOutput.write(ns.getBytes());
			fileOutput.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("File is written..");
	}

	public static void fileInputStream1() {
		File file;
		file = new File("C:\\Users\\abrotti\\Desktop\\Readme.txt");

		try (FileInputStream fileInput = new FileInputStream(file)) {

			int input = 0;
			while ((input = fileInput.read()) != -1) {
				System.out.print((char) input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		fileInputStream1();
		fileOutputStream1();

	}

}
