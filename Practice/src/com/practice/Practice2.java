package com.practice;

import java.util.HashMap;
import java.util.Scanner;

public class Practice2 {

		
	
public static void main(String[] args) {
	
	
}



public HashMap<String, Object> composeInstantVMWareInfo(String username,String password,String server_name,String site_id) {
	
	
	HashMap<String, Object> pmap = new HashMap<String, Object>();
	
	HashMap<String, Object> vmware = new HashMap<String, Object>();
	if (!username.equalsIgnoreCase("null")) {vmware.put("username",username);}
	if (!password.equalsIgnoreCase("null")) {vmware.put("password",password);}
	if (!server_name.equalsIgnoreCase("null")) {vmware.put("server_name",server_name);}
	if (!site_id.equalsIgnoreCase("null")) {vmware.put("site_id",site_id);}
	vmware.put("protocol","https");
	vmware.put("port","443");
	
	
	return pmap;
}
	
	
}
