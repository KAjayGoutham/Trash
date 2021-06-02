package com.practice;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Testing {

	public static void main(String[] args) {

		String [] keys2 = JOptionPane.showInputDialog("Enter Keys").toString().split(",");
		System.out.println("public HashMap<String,Object> reName(" );
		for (String kk : keys2) {
			System.out.println("String "+kk+",");
		}
		System.out.println("){return null;}");

		
		
	}
} 

