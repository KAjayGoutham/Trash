package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader2 {

	public static void main(String[] args) throws IOException {
		
	File f = new File("C:/Users/Ajay Gowtham/Downloads/sample1.txt");
	Scanner sc = new Scanner(f);
	
	String FileContent = "this is created by Java \n";
	
	while (sc.hasNextLine()) {

		FileContent =  FileContent.concat(sc.nextLine() +"\n");
	}
	
	FileWriter writer = new FileWriter("C:/Users/Ajay Gowtham/Downloads/JavaFile.txt");
	writer.write(FileContent);
	writer.flush();
	writer.close();
	
	}
}
