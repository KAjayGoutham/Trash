package com.practice;

import java.io.*;
import java.util.HashMap;

public class HashMapBuild {

	public static void main(String[] args) throws IOException {
	
		
		String[] keys = {"cluster_name",
                "is_cluster",
                "cluster_refrence_id",
                "resource_pool"};
		
		HashMapBuild hmb = new HashMapBuild();
		hmb.build(keys);
		
		
	}
	
	
	public void build(String[] keys) throws IOException {
		
		File f = new File("mapFile.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("public HashMap<String,Object> reName(");
		
		for (String k : keys) {
			dos.writeUTF("String "+k+",");
		}
		dos.writeUTF(")");
		
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String data = dis.readUTF();
		System.out.println(data);
		
		
	}
	

	
	
	
	
}
