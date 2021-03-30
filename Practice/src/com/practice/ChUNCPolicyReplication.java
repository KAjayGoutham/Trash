package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ChUNCPolicyReplication {

	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	public HashMap<String,Object> composeCHUNCSecondaryPolicy(String  policy_name,String  policy_type,String  product_type,String  source_id,String  primary_task_id,String  primary_task_type,String  parent_id,
			String  backup_destination_type,String  is_password_protect,String  rps_server_id,String  session_password,String  exclude_names,String  exclude_larger_than,
			String  proxy_id,String  primary_destination_id,String  is_draftfalse,String  organization_id, String secondary_task_id,String secondary_task_type,String secondaryTaskDestinationId
			,String replication_site_type,String replication_site_id){
		
		
		HashMap<String, Object> pmap = new HashMap<String, Object>();
		
		if (!policy_name.equalsIgnoreCase("null")) {pmap.put("policy_name",policy_name);}
		if (!policy_type.equalsIgnoreCase("null")) {pmap.put("policy_type",policy_type);}
		if (!product_type.equalsIgnoreCase("null")) {pmap.put("product_type",product_type);}
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

		HashMap<String, Object> udp_unc_backup_map = new HashMap<String, Object>();
		if (!proxy_id.equalsIgnoreCase("null")) {udp_unc_backup_map.put("proxy_id", proxy_id);}
		
		HashMap<String, Object> retention_policy_map = new HashMap<String, Object>();
		retention_policy_map.put("daily_backup", 2);
		retention_policy_map.put("weekly_backup", 2);
		retention_policy_map.put("monthly_backup", 6);
		retention_policy_map.put("manual_backup", 31);
		udp_unc_backup_map.put("retention_policy", retention_policy_map);
		
		HashMap<String, Object> catalog_map = new HashMap<String, Object>();
		catalog_map.put("custom", false);
		catalog_map.put("daily", false);
		catalog_map.put("monthly", false);
		catalog_map.put("weekly", false);
		catalog_map.put("annually", false);
		catalog_map.put("recovery_set", false);
		udp_unc_backup_map.put("catalog", catalog_map);
		
		HashMap<String, Object> destination_map = new HashMap<String, Object>();
		if (!backup_destination_type.equalsIgnoreCase("null")) {destination_map.put("backup_destination_type", backup_destination_type);}
		
		HashMap<String, Object> datastore_map = new HashMap<String, Object>();
		datastore_map.put("is_password_protect", is_password_protect);
		if (!rps_server_id.equalsIgnoreCase("null")) {datastore_map.put("rps_server_id",rps_server_id);}
		if (!session_password.equalsIgnoreCase("null")) {datastore_map.put("session_password",session_password);}
		destination_map.put("datastore",datastore_map);
		udp_unc_backup_map.put("destination", destination_map);
		
		
		HashMap<String, Object> exclusions_map = new HashMap<String, Object>();
		
		ArrayList<String> exclude_nameslist = new ArrayList<String>();
		exclusions_map.put("exclude_names", exclude_nameslist);
		exclusions_map.put("exclude_larger_than", null);
		exclusions_map.put("exclude_created_before", null);
		exclusions_map.put("exclude_modified_before", null);
		udp_unc_backup_map.put("exclusions", exclusions_map);
		
		destinationsMap.put("udp_unc_backup", udp_unc_backup_map);
		destinationsList.add(destinationsMap);
		
		
		HashMap<String, Object> destinationsMap1 = new HashMap<String, Object>();
		if (!secondary_task_id.equalsIgnoreCase("null")) {destinationsMap1.put("task_id",secondary_task_id);}
		if (!secondary_task_type.equalsIgnoreCase("null")) {destinationsMap1.put("task_type",secondary_task_type);}
		destinationsMap1.put("parent_id",primary_task_id);
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
