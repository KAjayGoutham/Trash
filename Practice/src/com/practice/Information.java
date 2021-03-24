package com.practice;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Information {

	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		HashMap<String, Object> rpi = new HashMap<String, Object>();
		rpi.put("sample","sample");
		
		Information info = new Information();
		
		HashMap<String, Object> map = info.composeIVMInfo("sample", 1, 512, "c:\\sample", "desc", "sample", true, true, "sampletype", "chilskd", "asbdjksa", false, true, true, "", "samplenetwork", "samplenetworkId", "type1", "samplehostname", "username", "password", true, 1, true, 1, "datastore1", "datastoreReferenceId", "fullPath", "recoveryPointType", "directDSId", "sourceDestinationUsername", "SourceDestinationPassword", rpi, "vmware", "10.55.19.220", "vmwareID", "clistername", false, "cluster_refrence_id", "resource_pool", "resource_pool_refrence_id", "datacenter_name", "datacenter_refrence_id", "hostname", "host_refrence_id", "sessionPSW", "proxy", "RPSid", "source_id", "source_name", "windows", true);
		
		
		
		PrintWriter pw = new PrintWriter("sample34.txt");
		pw.write(map.toString());
		pw.flush();
		pw.close();
	}
	
	public HashMap<String, Object> composeIVMInfo(String vm_name_prefix,int cpu_count,int memory_size,String vm_files_location,String description,String vm_display_name,
			  boolean power_on,boolean connect,String adapter_type,String distributed_virtual_switch,String distributed_virtual_switchid,
			  boolean is_vds,boolean is_auto_dns,boolean is_dhcp,String mac_address,String networkName,String networkId
			  ,String disk_controller_type,String new_host_name,String username, String password,boolean recover_data_automatically,
			  int free_space_warning_threshold,boolean enable_hydration,int free_space_pause_hydration,String datastore,String datastore_reference_id,
			  String full_backup_path,String backup_destination_type,String datastore_id,String sourceDestinationUsername, String SourceDestinationPassword,
			  HashMap<String, Object> recovery_point_info,String hypervisor_type,String vm_location,String hypervisor_id,String cluster_name,
			  boolean is_cluster,String cluster_refrence_id,String resource_pool,String resource_pool_refrence_id,String datacenter_name,String datacenter_refrence_id,
			  String hostname,String host_refrence_id,String session_password,String  recovery_server_type,String  recovery_server_id,String  source_id,
			  String  source_name,String  session_type,boolean  install_nfs){

	HashMap<String, Object> pmap = new HashMap<String, Object>();
	if (!session_password.equalsIgnoreCase("null")) {pmap.put("session_password",session_password);}
	if (!recovery_server_type.equalsIgnoreCase("null")) {pmap.put("recovery_server_type",recovery_server_type);}
	if (!recovery_server_id.equalsIgnoreCase("null")) {pmap.put("recovery_server_id",recovery_server_id);}
	if (!source_id.equalsIgnoreCase("null")) {pmap.put("source_id",source_id);}
	if (!source_name.equalsIgnoreCase("null")) {pmap.put("source_name",source_name);}
	if (!session_type.equalsIgnoreCase("null")) {pmap.put("session_type",session_type);}
	pmap.put("install_nfs",install_nfs);

	HashMap<String, Object> virtual_machine_settings = new HashMap<String, Object>();
	if (!vm_name_prefix.equalsIgnoreCase("null")) {virtual_machine_settings.put("vm_name_prefix",vm_name_prefix);}
	virtual_machine_settings.put("cpu_count",cpu_count);
	virtual_machine_settings.put("memory_size",memory_size);
	if (!vm_files_location.equalsIgnoreCase("null")) {virtual_machine_settings.put("vm_files_location",vm_files_location);}
	if (!description.equalsIgnoreCase("null")) {virtual_machine_settings.put("description",description);}
	if (!vm_display_name.equalsIgnoreCase("null")) {virtual_machine_settings.put("vm_display_name",vm_display_name);}
	virtual_machine_settings.put("power_on",power_on);

	ArrayList<HashMap<String, Object>> vm_adapters = new ArrayList<HashMap<String,Object>>();

	HashMap<String, Object> vm_adapters_map = new HashMap<String, Object>();
	vm_adapters_map.put("connect", connect);
	if (!adapter_type.equalsIgnoreCase("null")) {vm_adapters_map.put("adapter_type", adapter_type);}
	if (!distributed_virtual_switch.equalsIgnoreCase("null")) {vm_adapters_map.put("distributed_virtual_switch", distributed_virtual_switch);}
	if (!distributed_virtual_switchid.equalsIgnoreCase("null")) {vm_adapters_map.put("distributed_virtual_switchid", distributed_virtual_switchid);}
	vm_adapters_map.put("is_vds", is_vds);
	vm_adapters_map.put("is_auto_dns", is_auto_dns);
	vm_adapters_map.put("is_dhcp", is_dhcp);
	vm_adapters_map.put("mac_address", mac_address);

	HashMap<String, Object>  vm_adapters_network_map = new HashMap<String, Object>();
	if (!networkName.equalsIgnoreCase("null")) {vm_adapters_network_map.put("name", networkName);}
	if (!networkId.equalsIgnoreCase("null")) {vm_adapters_network_map.put("id", networkId);}

	vm_adapters_map.put("network", vm_adapters_network_map);
	vm_adapters.add(vm_adapters_map);

	HashMap<String, Object> advanced_settings_map = new HashMap<String, Object>();
	if (!disk_controller_type.equalsIgnoreCase("null")) {advanced_settings_map.put("disk_controller_type", disk_controller_type);}
	if (!new_host_name.equalsIgnoreCase("null")) {advanced_settings_map.put("new_host_name",new_host_name);}
	if (!username.equalsIgnoreCase("null")) {advanced_settings_map.put("username", username);}
	if (!password.equalsIgnoreCase("null")) {advanced_settings_map.put("password", password);}
	advanced_settings_map.put("recover_data_automatically", recover_data_automatically);
	advanced_settings_map.put("free_space_warning_threshold", free_space_warning_threshold);
	advanced_settings_map.put("enable_hydration", enable_hydration);
	advanced_settings_map.put("free_space_pause_hydration", free_space_pause_hydration);

	HashMap<String, Object> redirect_disk_updates_map =  new HashMap<String, Object>();
	if (!datastore.equalsIgnoreCase("null")) {redirect_disk_updates_map.put("datastore", datastore);}
	if (!datastore_reference_id.equalsIgnoreCase("null")) {redirect_disk_updates_map.put("datastore_reference_id", datastore_reference_id);}

	advanced_settings_map.put("redirect_disk_updates", redirect_disk_updates_map);
	virtual_machine_settings.put("vm_adapters",vm_adapters);
	virtual_machine_settings.put("advanced_settings",advanced_settings_map);
	pmap.put("virtual_machine_settings",virtual_machine_settings);

	HashMap<String, Object> source_destination_map = new HashMap<String, Object>();
	if (!full_backup_path.equalsIgnoreCase("null")) {source_destination_map.put("full_backup_path", full_backup_path);}
	if (!backup_destination_type.equalsIgnoreCase("null")) {source_destination_map.put("backup_destination_type", backup_destination_type);}
	if (!datastore_id.equalsIgnoreCase("null")) {source_destination_map.put("datastore_id", datastore_id);}
	if (!sourceDestinationUsername.equalsIgnoreCase("null")) {source_destination_map.put("username", sourceDestinationUsername);}
	if (!SourceDestinationPassword.equalsIgnoreCase("null")) {source_destination_map.put("password", SourceDestinationPassword);}

	pmap.put("source_destination", source_destination_map);
	pmap.put("recovery_point", recovery_point_info);

	HashMap<String, Object> target_destination = new HashMap<String, Object>();
	if (!hypervisor_type.equalsIgnoreCase("null")) {target_destination.put("hypervisor_type", hypervisor_type);}
	if (!vm_location.equalsIgnoreCase("null")) {target_destination.put("vm_location", vm_location);}

	HashMap<String, Object> hypervisor = new HashMap<String, Object>();
	if (!hypervisor_id.equalsIgnoreCase("null")) {hypervisor.put("hypervisor_id", hypervisor_id);}

	HashMap<String, Object> vmware = new HashMap<String, Object>();
	if (!cluster_name.equalsIgnoreCase("null")) {vmware.put("cluster_name",cluster_name);}
	vmware.put("is_cluster",is_cluster);
	if (!cluster_refrence_id.equalsIgnoreCase("null")) {vmware.put("cluster_refrence_id",cluster_refrence_id);}
	if (!resource_pool.equalsIgnoreCase("null")) {vmware.put("resource_pool",resource_pool);}
	if (!resource_pool_refrence_id.equalsIgnoreCase("null")) {vmware.put("resource_pool_refrence_id",resource_pool_refrence_id);}
	if (!datacenter_name.equalsIgnoreCase("null")) {vmware.put("datacenter_name",datacenter_name);}
	if (!datacenter_refrence_id.equalsIgnoreCase("null")) {vmware.put("datacenter_refrence_id",datacenter_refrence_id);}
	if (!hostname.equalsIgnoreCase("null")) {vmware.put("hostname",hostname);}
	if (!host_refrence_id.equalsIgnoreCase("null")) {vmware.put("host_refrence_id",host_refrence_id);}
	hypervisor.put("vmware", vmware);
	target_destination.put("hypervisor", hypervisor);

	pmap.put("target_destination",target_destination);

	return pmap;
	}
	
	
	
	public HashMap<String, Object> compseShareFolderBrowseInfo(){
		
		
		HashMap<String, Object> pmap = new HashMap<String, Object>();
		
		
		return pmap;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
