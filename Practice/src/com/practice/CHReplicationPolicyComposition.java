package com.practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CHReplicationPolicyComposition {

	public static void main(String[] args) throws FileNotFoundException {
		

		CHReplicationPolicyComposition ch = new CHReplicationPolicyComposition();
		HashMap<String,Object> map = ch.chReplicationPolicy("chPolicy", "agent_based", "udp", "123456", "123456789", "09876543", "udpagentbased", "recoveryPointServer", true, "93u438jdbjddcsdvsc", "Mclaren@2020", "software", "234567876543245678654", "12345676543234", "chreplication", "234567765432", "23456789876543", "arcserve_cloud", "2345676543efgh76543");
		
		PrintWriter pw = new PrintWriter("chcomposition.txt");
		pw.write(map.toString());
		pw.flush();
		pw.close();

	}


	public HashMap<String,Object> chReplicationPolicy(String policy_name,String policy_type,String product_type,String source_id,String organization_id,String primary_task_id,String  primary_task_type,String  backup_destination_type,boolean  is_password_protect,String  rps_server_id,
			String  session_password,String  snapshot_type,String  primary_destination_id,String secondary_task_id,String secondary_task_type,String secondaryTask_parent_id,String secondaryTaskDestinationId
			,String replication_site_type,String replication_site_id){

		
		HashMap<String, Object> pmap = new HashMap<String, Object>();
		if (!policy_name.equalsIgnoreCase("null")) {pmap.put("policy_name",policy_name );}
		if (!policy_type.equalsIgnoreCase("null")) {pmap.put("policy_type",policy_type );}
		if (!product_type.equalsIgnoreCase("null")) {pmap.put("product_type",product_type );}
		if (!organization_id.equalsIgnoreCase("null")) {pmap.put("organization_id",organization_id);}
		pmap.put("is_draft", false);
		
		ArrayList<HashMap<String,Object>> sourceList = new ArrayList<HashMap<String,Object>>();
		HashMap<String, Object> sourceListmap = new HashMap<String, Object>();
		sourceListmap.put("source_id", source_id);
		sourceList.add(sourceListmap);
		pmap.put("sources",sourceList);
		
		ArrayList<HashMap<String, Object>> destinationsList= new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object>  destinationsMap = new HashMap<String, Object>();
		if (!primary_task_id.equalsIgnoreCase("null")) {destinationsMap.put("task_id", primary_task_id);}
		if (!primary_task_type.equalsIgnoreCase("null")) {destinationsMap.put("task_type", primary_task_type);}
		if (!primary_destination_id.equalsIgnoreCase("null")) {destinationsMap.put("destination_id", primary_destination_id);}
		
		HashMap<String, Object> udp_agentbase_backup_map = new HashMap<String, Object>();
		ArrayList<String> protected_volumeslist = new ArrayList<String>();
		protected_volumeslist.add("E");
		udp_agentbase_backup_map.put("protected_volumes",protected_volumeslist);
		
		HashMap<String, Object> retention_policy_map = new HashMap<String, Object>();
		retention_policy_map.put("daily_backup", 2);
		retention_policy_map.put("weekly_backup", 2);
		retention_policy_map.put("monthly_backup", 6);
		retention_policy_map.put("manual_backup", 31);
		udp_agentbase_backup_map.put("retention_policy", retention_policy_map);
		
		HashMap<String, Object> catalog_map = new HashMap<String, Object>();
		catalog_map.put("custom", false);
		catalog_map.put("daily", false);
		catalog_map.put("monthly", false);
		catalog_map.put("weekly", false);
		catalog_map.put("annually", false);
		catalog_map.put("recovery_set", false);
		udp_agentbase_backup_map.put("catalog", catalog_map);
		
		HashMap<String, Object> destination_map = new HashMap<String, Object>();
		if (!backup_destination_type.equalsIgnoreCase("null")) {destination_map.put("backup_destination_type", backup_destination_type);}
		
		HashMap<String, Object> datastore_map = new HashMap<String, Object>();
		datastore_map.put("is_password_protect", is_password_protect);
		if (!rps_server_id.equalsIgnoreCase("null")) {datastore_map.put("rps_server_id",rps_server_id);}
		if (!session_password.equalsIgnoreCase("null")) {datastore_map.put("session_password",session_password);}
		destination_map.put("datastore",datastore_map);
		udp_agentbase_backup_map.put("destination", destination_map);
		
		HashMap<String, Object> additional_settings_map = new HashMap<String, Object>();
		if (!snapshot_type.equalsIgnoreCase("null")) {additional_settings_map.put("snapshot_type",snapshot_type);}
		udp_agentbase_backup_map.put("additional_settings", additional_settings_map);
		destinationsMap.put("udp_agentbase_backup", udp_agentbase_backup_map);
		destinationsList.add(destinationsMap);
		
		HashMap<String, Object> destinationsMap1 = new HashMap<String, Object>();
		if (!secondary_task_id.equalsIgnoreCase("null")) {destinationsMap1.put("task_id",secondary_task_id);}
		if (!secondary_task_type.equalsIgnoreCase("null")) {destinationsMap1.put("task_type",secondary_task_type);}
		if (!secondaryTask_parent_id.equalsIgnoreCase("null")) {destinationsMap1.put("parent_id",secondaryTask_parent_id);}
		if (!secondaryTaskDestinationId.equalsIgnoreCase("null")) {destinationsMap1.put("destination_id",secondaryTaskDestinationId);}
		
		HashMap<String, Object> udp_replication_map = new HashMap<String, Object>();
		if (!replication_site_type.equalsIgnoreCase("null")) {udp_replication_map.put("replication_site_type",replication_site_type);}
		udp_replication_map.put("retry_start", 10);
		udp_replication_map.put("retry_times", 3);
		if (!replication_site_id.equalsIgnoreCase("null")) {udp_replication_map.put("replication_site_id",replication_site_id);}
		udp_replication_map.put("retention_policy", retention_policy_map);
		destinationsMap1.put("udp_replication", udp_replication_map);
		
		destinationsList.add(destinationsMap1);
		pmap.put("destinations",destinationsList);
		
		return pmap;

	}




}
