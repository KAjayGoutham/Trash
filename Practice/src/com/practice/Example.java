package com.practice;

public class Example {
	
	public static void main(String[] args) throws InterruptedException {
		
		String job_type = "conversion";
		String job_status = "finished";
		int x = 100;
		
		for (int k = 0; k <= x; k++) {
			
			if (job_type.toLowerCase().contains("vm_backup_incremental")&&job_status.toLowerCase().contains("active")) {
				System.out.println("backup job is in inprogress state ");
				sourceJobStatusWaitMethod(job_type, job_type);
				Thread.sleep(3000);
			}else if (job_type.toLowerCase().contains("conversion")&&job_status.toLowerCase().contains("active")) {
				System.out.println("VSB Conversion job is in inprogress state ");
				sourceJobStatusWaitMethod(job_type, job_type);
				Thread.sleep(3000);
			}else if (job_type.toLowerCase().contains("conversion")&&job_status.toLowerCase().contains("finished")) {
				System.out.println("VSB Conversion job is successfully finished ");
				System.out.println("Greetings VSB Tasks successfully completed");
				Thread.sleep(3000);
				break;
			}else if (job_type.toLowerCase().contains("vm_backup_incremental")&&job_status.toLowerCase().contains("finished")) {
				System.out.println("backup job is successfully finished,\nNow Waiting for VSB conversion job");
				sourceJobStatusWaitMethod(job_type, job_type);
				Thread.sleep(3000);
			}
			
		}
		
	}
	
	
	public static void sourceJobStatusWaitMethod(String JobType,String JobStatus) {
		
		if (JobType.contains("vm_backup_incremental")&&JobStatus.contains("active")) {
			System.out.println("the backup job is in inProgress please wait");
		}
		else if (JobType.contains("conversion")&&JobStatus.contains("active")) {
			System.out.println("the VSB conversion job is in inProgress Please wait for it's to complete");
		}
		else if (JobType.contains("vm_backup_incremental")&&JobStatus.contains("finished")) {
			System.out.println("the backup job is completed successfully");
		}
		else if (JobType.contains("conversion")&&JobStatus.contains("finished")) {
			System.out.println("the VSB conversion job is completed successfully");
		}
		
		
	}
}
