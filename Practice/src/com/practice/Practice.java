package com.practice;

import java.util.Scanner;

public class Practice {


	
	public static void main(String[] args) throws InterruptedException {

		
		/*
		 * String job_staus = "active"; boolean jobStatus = false;
		 * 
		 * if (job_staus.contains("finished")) { jobStatus = true;
		 * System.out.println("just hit the start_backup"); }else if
		 * (job_staus.contains("active")) {
		 * System.out.println("job is still in inProgress state"); return ; }
		 */
		
		Scanner sc =  new Scanner(System.in);
		
	int i = 100;
	
	for (int j = 0; j <i ; j++) {
		//String userinput = sc.nextLine();
		Sample sam = new Sample();
		String userinput = sam.staus;
		if (userinput.toLowerCase().contains("active")) {
			System.out.println("job is in still progress");
			Practice.wait(userinput);
			Thread.sleep(10000);
		}else if (userinput.toLowerCase().contains("finished")) {
			System.out.println("just hit the backup job");
			break;
		}else if (userinput.toLowerCase().contains("deploying")) {
			Practice.wait(userinput);
			Thread.sleep(5000);
		}
		
	}
		
}
	
	public static void wait(String jobStatus) {
		
		if (jobStatus.contains("finished")) {
			System.out.println("just hit the backup job");
			
		}else if(jobStatus.contains("active")) {
			System.out.println("job is is avtive state please wait for it's to complete");
			
		}else if (jobStatus.contains("deploying")) {
			System.out.println("deploying..");
		}
		
	}
	
}
