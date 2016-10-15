/*

 Copyright (C) 2006 NTT DATA Corporation

 This program is free software; you can redistribute it and/or
 Modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation, version 2.

 This program is distributed in the hope that it will be
 useful, but WITHOUT ANY WARRANTY; without even the implied
 warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.jobmanagement.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.clustercontrol.util.Messages;


/**
 * ジョブのジョブ変数におけるシステム変数に関する情報を定義するクラス<BR>
 *
 * @version 4.0.0
 * @since 2.1.0
 */
public class SystemParameterConstant {
	//システム（ジョブ）
	/** 呼び出し元のアプリケーション */
	public static final String APPLICATION = "APPLICATION";
	/** 呼び出し元のファシリティID */
	public static final String FACILITY_ID = "FACILITY_ID";
	/** ファイル名(実行契機がファイルチェックのときに値が入る) */
	public static final String FILENAME = "FILENAME";
	/** ディレクトリ(実行契機がファイルチェックのときに値が入る) */
	public static final String DIRECTORY = "DIRECTORY";
	/** 呼び出し元のメッセージ */
	public static final String MESSAGE = "MESSAGE";
	/** 呼び出し元のメッセージID */
	public static final String MESSAGE_ID = "MESSAGE_ID";
	/** 呼び出し元の監視項目ID */
	public static final String MONITOR_ID = "MONITOR_ID";
	/** 呼び出し元の監視詳細ID */
	public static final String MONITOR_DETAIL_ID = "MONITOR_DETAIL_ID";
	/** 呼び出し元のオリジナルメッセージ */
	public static final String ORG_MESSAGE = "ORG_MESSAGE";
	/** 呼び出し元のプラグインID */
	public static final String PLUGIN_ID = "PLUGIN_ID";
	/** 呼び出し元の重要度 */
	public static final String PRIORITY = "PRIORITY";
	/** ジョブセッションID */
	public static final String SESSION_ID = "SESSION_ID";
	/** ジョブセッション開始日時 */
	public static final String START_DATE = "START_DATE";
	/** ジョブ起動種類*/
	public static final String TRIGGER_INFO = "TRIGGER_INFO";
	/** ジョブ起動契機 */
	public static final String TRIGGER_TYPE = "TRIGGER_TYPE";

	//システム（ノード）
	public static final String FACILITY_NAME = "FACILITY_NAME";
	public static final String IP_ADDRESS_VERSION = "IP_ADDRESS_VERSION";
	public static final String IP_ADDRESS = "IP_ADDRESS";
	public static final String IP_ADDRESS_V4 = "IP_ADDRESS_V4";
	public static final String IP_ADDRESS_V6 = "IP_ADDRESS_V6";
	public static final String NODE_NAME = "NODE_NAME";
	public static final String OS_NAME = "OS_NAME";
	public static final String OS_RELEASE = "OS_RELEASE";
	public static final String OS_VERSION = "OS_VERSION";
	public static final String CHARSET = "CHARSET";
	public static final String AGENT_AWAKE_PORT = "AGENT_AWAKE_PORT";
	public static final String JOB_PRIORITY = "JOB_PRIORITY";
	public static final String JOB_MULTIPLICITY = "JOB_MULTIPLICITY";
	public static final String SNMP_PORT = "SNMP_PORT";
	public static final String SNMP_COMMUNITY = "SNMP_COMMUNITY";
	public static final String SNMP_VERSION = "SNMP_VERSION";
	public static final String SNMP_TIMEOUT = "SNMP_TIMEOUT";
	public static final String SNMP_TRIES = "SNMP_TRIES";
	public static final String WBEM_PORT = "WBEM_PORT";
	public static final String WBEM_PROTOCOL = "WBEM_PROTOCOL";
	public static final String WBEM_TIMEOUT = "WBEM_TIMEOUT";
	public static final String WBEM_TRIES = "WBEM_TRIES";
	public static final String WBEM_USER = "WBEM_USER";
	public static final String WBEM_PASSWORD = "WBEM_PASSWORD";
	public static final String WINRM_USER = "WINRM_USER";
	public static final String WINRM_PASSWORD = "WINRM_PASSWORD";
	public static final String WINRM_VERSION = "WINRM_VERSION";
	public static final String WINRM_PORT = "WINRM_PORT";
	public static final String WINRM_PROTOCOL = "WINRM_PROTOCOL";
	public static final String WINRM_TIMEOUT = "WINRM_TIMEOUT";
	public static final String WINRM_TRIES = "WINRM_TRIES";
	public static final String IPMI_IP_ADDRESS = "IPMI_IP_ADDRESS";
	public static final String IPMI_PORT = "IPMI_PORT";
	public static final String IPMI_TIMEOUT = "IPMI_TIMEOUT";
	public static final String IPMI_TRIES = "IPMI_TRIES";
	public static final String IPMI_PROTOCOL = "IPMI_PROTOCOL";
	public static final String IPMI_LEVEL = "IPMI_LEVEL";
	public static final String IPMI_USER = "IPMI_USER";
	public static final String IPMI_PASSWORD = "IPMI_PASSWORD";
	public static final String SSH_USER = "SSH_USER";
	public static final String SSH_USER_PASSWORD = "SSH_USER_PASSWORD";
	public static final String SSH_PRIVATE_KEY_FILENAME = "SSH_PRIVATE_KEY_FILENAME";
	public static final String SSH_PRIVATE_KEY_PASSPHRASE = "SSH_PRIVATE_KEY_PASSPHRASE";
	public static final String SSH_PORT = "SSH_PORT";
	public static final String SSH_TIMEOUT = "SSH_TIMEOUT";
	public static final String CLOUD_SERVICE = "CLOUD_SERVICE";
	public static final String CLOUD_SCOPE = "CLOUD_SCOPE";
	public static final String CLOUD_RESOURCE_TYPE = "CLOUD_RESOURCE_TYPE";
	public static final String CLOUD_RESOURCE_ID = "CLOUD_RESOURCE_TYPEID";
	public static final String CLOUD_RESOURCE_NAME = "CLOUD_RESOURCE_NAME";
	public static final String CLOUD_LOCATION = "CLOUD_LOCATION";

	/** ジョブ変数 ヘッダー */
	private static final String PREFIX = "#[";
	/** ジョブ変数 フッター */
	private static final String SUFFIX = "]";

	public static final ArrayList<List<String>> ALL_JOBS = new ArrayList<List<String>>();
	public static final ArrayList<List<String>> ALL_NODES = new ArrayList<List<String>>();

	static {
		String[] keyJobMsgs = {
				APPLICATION, Messages.getString("application"),
				FACILITY_ID, Messages.getString("facility.id"),
				FILENAME, Messages.getString("file.name"),
				DIRECTORY, Messages.getString("directory"),
				MESSAGE, Messages.getString("message"),
				MESSAGE_ID, Messages.getString("message.id"),
				MONITOR_ID, Messages.getString("monitor.id"),
				MONITOR_DETAIL_ID, Messages.getString("monitor.detail.id"),
				ORG_MESSAGE, Messages.getString("message.org"),
				PLUGIN_ID, Messages.getString("plugin.id"),
				PRIORITY, Messages.getString("priority"),
				SESSION_ID, Messages.getString("session.id"),
				START_DATE, Messages.getString("start.time"),
				TRIGGER_INFO, Messages.getString("trigger.info"),
				TRIGGER_TYPE, Messages.getString("trigger.type")
		};

		String[] keyNodeMsgs = {
				FACILITY_NAME, Messages.getString("facility.name"),
				IP_ADDRESS_VERSION, Messages.getString("ip.address.version"),
				IP_ADDRESS, Messages.getString("ip.address"),
				IP_ADDRESS_V4, Messages.getString("ip.address.v4"),
				IP_ADDRESS_V6, Messages.getString("ip.address.v6"),
				NODE_NAME, Messages.getString("node.name"),
				OS_NAME, Messages.getString("os.name"),
				OS_RELEASE, Messages.getString("os.release"),
				OS_VERSION, Messages.getString("os.version"),
				CHARSET, Messages.getString("character.set"),
				AGENT_AWAKE_PORT, Messages.getString("agent.awake.port"),
				JOB_PRIORITY, Messages.getString("job.priority"),
				JOB_MULTIPLICITY, Messages.getString("job.multiplicity"),
				SNMP_PORT, Messages.getString("snmp.port.number"),
				SNMP_COMMUNITY, Messages.getString("community.name"),
				SNMP_VERSION, Messages.getString("snmp.version"),
				SNMP_TIMEOUT, Messages.getString("snmp.timeout"),
				SNMP_TRIES, Messages.getString("snmp.retries"),
				WBEM_PORT, Messages.getString("wbem.port.number"),
				WBEM_PROTOCOL, Messages.getString("wbem.protocol"),
				WBEM_TIMEOUT, Messages.getString("wbem.timeout"),
				WBEM_TRIES, Messages.getString("wbem.retries"),
				WBEM_USER, Messages.getString("wbem.user"),
				WBEM_PASSWORD, Messages.getString("wbem.user.password"),
				WINRM_USER, Messages.getString("winrm.user"),
				WINRM_PASSWORD, Messages.getString("winrm.user.password"),
				WINRM_VERSION, Messages.getString("winrm.version"),
				WINRM_PORT, Messages.getString("winrm.port.number"),
				WINRM_PROTOCOL, Messages.getString("winrm.protocol"),
				WINRM_TIMEOUT, Messages.getString("winrm.timeout"),
				WINRM_TRIES, Messages.getString("winrm.retries"),
				IPMI_IP_ADDRESS, Messages.getString("ipmi.ip.address"),
				IPMI_PORT, Messages.getString("ipmi.port.number"),
				IPMI_TIMEOUT, Messages.getString("ipmi.timeout"),
				IPMI_TRIES, Messages.getString("ipmi.retries"),
				IPMI_PROTOCOL, Messages.getString("ipmi.protocol"),
				IPMI_LEVEL, Messages.getString("ipmi.level"),
				IPMI_USER, Messages.getString("ipmi.user"),
				IPMI_PASSWORD, Messages.getString("ipmi.user.password"),
				SSH_USER, Messages.getString("ssh.user"),
				SSH_USER_PASSWORD, Messages.getString("ssh.user.password"),
				SSH_PRIVATE_KEY_FILENAME, Messages.getString("ssh.private.key.filepath"),
				SSH_PRIVATE_KEY_PASSPHRASE, Messages.getString("ssh.private.key.passphrase"),
				SSH_PORT, Messages.getString("ssh.port"),
				SSH_TIMEOUT, Messages.getString("ssh.timeout"),
				CLOUD_SERVICE, Messages.getString("cloud.service"),
				CLOUD_SCOPE, Messages.getString("cloud.scope"),
				CLOUD_RESOURCE_TYPE, Messages.getString("cloud.resource.type"),
				CLOUD_RESOURCE_ID, Messages.getString("cloud.resource.id"),
				CLOUD_RESOURCE_NAME, Messages.getString("cloud.resource.name"),
				CLOUD_LOCATION, Messages.getString("cloud.location"),
		};

		for (int i = 0; i < keyJobMsgs.length; i += 2) {
			String[] pair = {keyJobMsgs[i], keyJobMsgs[i + 1]};
			ALL_JOBS.add(Arrays.asList(pair));
		}
		for (int i = 0; i < keyNodeMsgs.length; i +=2) {
			String[] pair = {keyNodeMsgs[i], keyNodeMsgs[i + 1]};
			ALL_NODES.add(Arrays.asList(pair));
		}
	}

	public static final Object SYSTEM_ID_LIST_JOB[] = {
		SystemParameterConstant.APPLICATION,
		SystemParameterConstant.FACILITY_ID,
		SystemParameterConstant.FILENAME,
		SystemParameterConstant.DIRECTORY,
		SystemParameterConstant.MESSAGE,
		SystemParameterConstant.MESSAGE_ID,
		SystemParameterConstant.MONITOR_ID,
		SystemParameterConstant.MONITOR_DETAIL_ID,
		SystemParameterConstant.ORG_MESSAGE,
		SystemParameterConstant.PLUGIN_ID,
		SystemParameterConstant.PRIORITY,
		SystemParameterConstant.SESSION_ID,
		SystemParameterConstant.START_DATE,
		SystemParameterConstant.TRIGGER_INFO,
		SystemParameterConstant.TRIGGER_TYPE
	};

	public static final Object SYSTEM_ID_LIST_NODE [] = {
		FACILITY_NAME,
		IP_ADDRESS_VERSION,
		IP_ADDRESS,
		IP_ADDRESS_V4,
		IP_ADDRESS_V6,
		NODE_NAME,
		OS_NAME,
		OS_RELEASE,
		OS_VERSION,
		CHARSET,
		AGENT_AWAKE_PORT,
		JOB_PRIORITY,
		JOB_MULTIPLICITY,
		SNMP_PORT,
		SNMP_COMMUNITY,
		SNMP_VERSION,
		SNMP_TIMEOUT,
		SNMP_TRIES,
		WBEM_PORT,
		WBEM_PROTOCOL,
		WBEM_TIMEOUT,
		WBEM_TRIES,
		WBEM_USER,
		WBEM_PASSWORD,
		WINRM_USER,
		WINRM_PASSWORD,
		WINRM_VERSION,
		WINRM_PORT,
		WINRM_PROTOCOL,
		WINRM_TIMEOUT,
		WINRM_TRIES,
		IPMI_IP_ADDRESS,
		IPMI_PORT,
		IPMI_TIMEOUT,
		IPMI_TRIES,
		IPMI_PROTOCOL,
		IPMI_LEVEL,
		IPMI_USER,
		IPMI_PASSWORD,
		SSH_USER,
		SSH_USER_PASSWORD,
		SSH_PRIVATE_KEY_FILENAME,
		SSH_PRIVATE_KEY_PASSPHRASE,
		SSH_PORT,
		SSH_TIMEOUT,
		CLOUD_SERVICE,
		CLOUD_SCOPE,
		CLOUD_RESOURCE_TYPE,
		CLOUD_RESOURCE_ID,
		CLOUD_RESOURCE_NAME,
		CLOUD_LOCATION
	};

	/**
	 * strが#[param]の形式であるかを判定する
	 *
	 * @param str
	 * @param param
	 * @return
	 */
	public static boolean isParam(String str, String param){
		if(str == null || param == null){
			return false;
		}
		if(str.equals(getParamText(param))){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * ジョブ変数をパラメータ形式で返却する
	 *
	 * @param param
	 * @return
	 */
	public static String getParamText(String param){
		return PREFIX + param + SUFFIX;
	}
}