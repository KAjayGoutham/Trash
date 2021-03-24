package com.practice;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReader {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String fileName= "FileFromCode";
		
		File file =  new File(fileName);
		
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		String write = sc.nextLine();
		dos.writeUTF(write);
		
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis =  new DataInputStream(fis);
		String fileContent = dis.readUTF();
		
	}
}

