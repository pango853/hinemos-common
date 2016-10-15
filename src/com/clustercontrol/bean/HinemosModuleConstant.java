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

package com.clustercontrol.bean;

import java.util.ArrayList;
import java.util.List;

import com.clustercontrol.util.Messages;

/**
 * Hinemosの機能を定数として格納するクラス<BR>
 *
 * @version 4.1.0
 * @since 2.1.2
 */
public class HinemosModuleConstant {


	/** 共通プラットフォーム*/
	public static final String PLATFORM  = "PLT";
	/** 通知 */
	public static final String PLATFORM_NOTIFY = "PLT_NTF";
	/** メールテンプレート*/
	public static final String PLATFORM_MAIL_TEMPLATE = "PLT_MIL_TMP";
	/** ログ転送 */
	public static final String PLATFORM_LOG_TRANSFER = "PLT_LOG_TRF";
	/** カレンダ */
	public static final String PLATFORM_CALENDAR = "PLT_CAL";
	/** カレンダパターン */
	public static final String PLATFORM_CALENDAR_PATTERN = "PLT_CAL_PTN";
	/** アクセス */
	public static final String PLATFORM_ACCESS 	= "PLT_ACC";
	/** 重要度判定 */
	public static final String PLATFORM_PRIORITY_JUDGMENT = "PLT_PRI_JMT";
	/** リポジトリ */
	public static final String PLATFORM_REPOSITORY = "PLT_REP";
	/** リポジトリ */
	public static final String PLATFORM_REPSITORY_NODE = "PLT_REP_NOD";
	/** リポジトリ */
	public static final String PLATFORM_REPSITORY_SCOPE = "PLT_REP_SCP";

	/** 監視設定 */
	public static final String MONITOR = "MON";
	/** Hinemosエージェント監視 */
	public static final String MONITOR_AGENT = "MON_AGT_B";
	/** カスタム監視 */
	public static final String MONITOR_CUSTOM = "MON_CUSTOM_N";
	/** HTTP監視（数値） */
	public static final String MONITOR_HTTP_N = "MON_HTP_N";
	/** HTTP監視（文字列） */
	public static final String MONITOR_HTTP_S = "MON_HTP_S";
	/** HTTP監視（シナリオ） */
	public static final String MONITOR_HTTP_SCENARIO = "MON_HTP_SCE";
	/** リソース監視 */
	public static final String MONITOR_PERFORMANCE = "MON_PRF_N";
	/** PING監視 */
	public static final String MONITOR_PING = "MON_PNG_N";
	/** サービス・ポート監視 */
	public static final String MONITOR_PORT = "MON_PRT_N";
	/** プロセス監視 */
	public static final String MONITOR_PROCESS = "MON_PRC_N";
	/** SNMP監視（数値） */
	public static final String MONITOR_SNMP_N = "MON_SNMP_N";
	/** SNMP監視（文字列） */
	public static final String MONITOR_SNMP_S = "MON_SNMP_S";
	/** SNMPTRAP監視 */
	public static final String MONITOR_SNMPTRAP = "MON_SNMP_TRP";
	/** SQL監視（数値） */
	public static final String MONITOR_SQL_N = "MON_SQL_N";
	/** SQL監視（文字列） */
	public static final String MONITOR_SQL_S = "MON_SQL_S";
	/** システムログ監視（文字列） */
	public static final String MONITOR_SYSTEMLOG = "MON_SYSLOG_S";
	/** ログファイル監視 */
	public static final String MONITOR_LOGFILE = "MON_LOGFILE_S";
	/** Windowsサービス監視 */
	public static final String MONITOR_WINSERVICE = "MON_WINSERVICE_B";
	/** Windowsイベント監視 */
	public static final String MONITOR_WINEVENT = "MON_WINEVENT_S";
	/** スコープ */
	public static final String MONITOR_SCOPE = "MON_SCP";
	/** ステータス */
	public static final String MONITOR_STATUS = "MON_STA";
	/** イベント */
	public static final String MONITOR_EVENT = "MON_EVT";
	/** JMX */
	public static final String MONITOR_JMX = "MON_JMX_N";

	/** 性能管理 */
	public static final String PERFORMANCE = "PRF";
	/** 性能管理 */
	public static final String PERFORMANCE_RECORD = "PRF_REC";
	/** 性能管理 */
	public static final String PERFORMANCE_REALTIME = "PRT_RT";

	/** ジョブ管理 */
	public static final String JOB = "JOB";
	/** ジョブ管理 */
	public static final String JOB_MST  = "JOB_MST";
	/** ジョブ管理 */
	public static final String JOB_SESSION = "JOB_SES";
	/** ジョブ管理 */
	public static final String JOB_SESSION_DETAIL = "JOB_SES_DTL";
	/** ジョブ管理 */
	public static final String JOB_SESSION_NODE = "JOB_SES_NOD";
	/** ジョブ管理 */
	public static final String JOB_SCHEDULE  = "JOB_SCH";
	/** ジョブ管理 */
	public static final String JOB_SCHEDULE_RUN  = "JOB_SCH_RUN";
	/** ジョブ管理 */
	public static final String JOB_SCHEDULE_RUN_DETAIL  = "JOB_SCH_RUN_DTL";
	/** ジョブ管理 */
	public static final String JOB_SESSION_FILE = "JOB_SES_FIL";
	/** ジョブ管理 */
	public static final String JOB_FILE_CHECK  = "JOB_FCH";

	/** 自動デバイスサーチ */
	public static final String REPOSITORY_DEVICE_SEARCH = "REP_DS";

	/**Hinemos自身の処理*/
	public static final String SYSYTEM = "SYS";
	/** メンテナンス */
	public static final String SYSYTEM_MAINTENANCE = "MAINTENANCE";
	/** セルフチェック */
	public static final String SYSYTEM_SELFCHECK = "SYS_SFC";
	/** セルフチェックのデフォルトID */
	public static final String SYSYTEM_SELFCHECK_ID = "DEFAULT";

	/** 環境構築 */
	public static final String INFRA = "INFRA";
	public static final String INFRA_FILE = "INFRA_FILE";

	/** レポーティング */
	public static final String REPORTING = "REPORTING"; 
	
	/** 共通プラットフォーム*/
	public static final int TYPE_PLATFORM  = 100;
	/** 通知 */
	public static final int TYPE_PLATFORM_NOTIFY = 101;
	/** メールテンプレート*/
	public static final int TYPE_PLATFORM_MAIL_TEMPLATE = 102;
	/** ログ転送 */
	public static final int TYPE_PLATFORM_LOG_TRANSFER = 103;
	/** カレンダ */
	public static final int TYPE_PLATFORM_CALENDAR = 104;
	/** アクセス */
	public static final int TYPE_PLATFORM_ACCESS 	= 105;
	/** 重要度判定 */
	public static final int TYPE_PLATFORM_PRIORITY_JUDGMENT = 106;
	/** リポジトリ */
	public static final int TYPE_PLATFORM_REPOSITORY = 107;

	/** リポジトリ */
	public static final int TYPE_PLATFORM_REPSITORY_NODE = 111;
	/** リポジトリ */
	public static final int TYPE_PLATFORM_REPSITORY_SCOPE = 112;

	/** カレンダパターン */
	public static final int TYPE_PLATFORM_CALENDAR_PATTERN = 113;

	/** 監視設定 */
	public static final int TYPE_MONITOR = 300;
	/** Hinemosエージェント監視 */
	public static final int TYPE_MONITOR_AGENT = 301;
	/** カスタム監視 */
	public static final int TYPE_MONITOR_CUSTOM = 311;
	/** HTTP監視 */
	public static final int TYPE_MONITOR_HTTP = 302;
	/** リソース監視 */
	public static final int TYPE_MONITOR_PERFORMANCE = 303;
	/** PING監視 */
	public static final int TYPE_MONITOR_PING = 304;
	/** サービス・ポート監視 */
	public static final int TYPE_MONITOR_PORT = 305;
	/** プロセス監視 */
	public static final int TYPE_MONITOR_PROCESS = 306;
	/** SNMP監視 */
	public static final int TYPE_MONITOR_SNMP = 307;
	/** SNMPTRAP監視 */
	public static final int TYPE_MONITOR_SNMPTRAP = 308;
	/** SQL監視 */
	public static final int TYPE_MONITOR_SQL = 309;
	/** システムログ監視 */
	public static final int TYPE_MONITOR_SYSTEMLOG = 310;
	/** ログファイル監視 */
	public static final int TYPE_MONITOR_LOGFILE = 311;
	/** Windowsサービス監視 */
	public static final int TYPE_MONITOR_WINSERVICE = 312;
	/** Windowsイベント監視 */
	public static final int TYPE_MONITOR_WINEVENT = 313;
	/** HTTP監視(Scenario) */
	public static final int TYPE_MONITOR_HTTP_SCENARIO = 314;
	/** スコープ */
	public static final int TYPE_MONITOR_SCOPE = 391;
	/** ステータス */
	public static final int TYPE_MONITOR_STATUS = 392;
	/** イベント */
	public static final int TYPE_MONITOR_EVENT = 393;
	/** JMX */
	public static final int TYPE_MONITOR_JMX = 315;

	/** 性能管理 */
	public static final int TYPE_PERFORMANCE = 400;
	/** 性能管理 */
	public static final int TYPE_PERFORMANCE_RECORD = 401;
	/** 性能管理 */
	public static final int TYPE_PERFORMANCE_REALTIME = 402;

	/** ジョブ管理 */
	public static final int TYPE_JOB = 500;
	/** ジョブ管理 */
	public static final int TYPE_JOB_MST  = 501;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SESSION = 502;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SESSION_DETAIL = 503;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SESSION_NODE = 504;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SCHEDULE  = 505;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SCHEDULE_RUN  = 506;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SCHEDULE_DETAIL  = 507;
	/** ジョブ管理 */
	public static final int TYPE_JOB_SESSION_FILE = 508;
	/** ジョブ管理 */
	public static final int TYPE_JOB_FILE_CHECK = 509;

	/**Hinemos自身の書処理*/
	public static final int TYPE_SYSYTEM =600;
	/** 障害検知 */
	public static final int TYPE_SYSYTEM_TROUBLE_DETECTION = 601;
	/** メンテナンス */
	public static final int TYPE_SYSYTEM_MAINTENANCE = 602;
	/** セルフチェック */
	public static final int TYPE_SYSYTEM_SELFCHECK = 603;
	
	/** 環境構築 */
	public static final int TYPE_INFRA = 700;
	public static final int TYPE_INFRA_FILE = 701;

	/** レポーティング */
	public static final int TYPE_REPORTING = 801; 

	/** リポジトリ */
	public static final String STRING_PLATFORM_REPOSITORY = Messages.getString("repository");
	/** アクセス */
	public static final String STRING_PLATFORM_ACCESS = Messages.getString("accesscontrol");
	/** カレンダ */
	public static final String STRING_PLATFORM_CALENDAR = Messages.getString("calendar");
	/** カレンダパターン */
	public static final String STRING_PLATFORM_CALENDAR_PATTERN = Messages.getString("calendar.pattern");
	/** 通知 */
	public static final String STRING_PLATFORM_NOTIFY = Messages.getString("notify");
	/** メールテンプレート */
	public static final String STRING_PLATFORM_MAIL_TEMPLATE = Messages.getString("mail.template");
	/** 重要度判定 */
	public static final String STRING_PLATFORM_PRIORITY_JUDGMENT = Messages.getString("priority.judgment");
	/** ログ転送 */
	public static final String STRING_PLATFORM_LOG_TRANSFER = Messages.getString("logtransfer");
	/** 監視設定 */
	public static final String STRING_MONITOR = Messages.getString("monitor.setting");
	/** システムログ監視 */
	public static final String STRING_MONITOR_SYSTEMLOG = Messages.getString("systemlog.monitor");
	/** ログファイル監視 */
	public static final String STRING_MONITOR_LOGFILE = Messages.getString("logfile.monitor");
	/** Hinemosエージェント監視 */
	public static final String STRING_MONITOR_AGENT = Messages.getString("agent.monitor");
	/** カスタム監視 */
	public static final String STRING_MONITOR_CUSTOM = Messages.getString("custom.monitor");
	/** HTTP監視 */
	public static final String STRING_MONITOR_HTTP = Messages.getString("http.monitor");
	/** HTTP監視 */
	public static final String STRING_MONITOR_HTTP_SCENARIO = Messages.getString("httpscenario.monitor");
	/** プロセス監視 */
	public static final String STRING_MONITOR_PROCESS = Messages.getString("process.monitor");
	/** SQL監視 */
	public static final String STRING_MONITOR_SQL = Messages.getString("sql.monitor");
	/** SNMP監視 */
	public static final String STRING_MONITOR_SNMP = Messages.getString("snmp.monitor");
	/** PING監視 */
	public static final String STRING_MONITOR_PING = Messages.getString("ping.monitor");
	/** SNMPTRAP監視 */
	public static final String STRING_MONITOR_SNMPTRAP = Messages.getString("snmptrap.monitor");
	/** リソース監視 */
	public static final String STRING_MONITOR_PERFORMANCE = Messages.getString("performance.monitor");
	/** サービス・ポート監視 */
	public static final String STRING_MONITOR_PORT = Messages.getString("port.monitor");
	/** Windowsサービス監視 */
	public static final String STRING_MONITOR_WINSERVICE = Messages.getString("winservice.monitor");
	/** Windowsイベント監視 */
	public static final String STRING_MONITOR_WINEVENT = Messages.getString("winevent.monitor");
	/** JMX監視 */
	public static final String STRING_MONITOR_JMX = Messages.getString("jmx.monitor");
	/** 性能管理 */
	public static final String STRING_PERFORMANCE = Messages.getString("performance");
	/** ジョブ管理 */
	public static final String STRING_JOB = Messages.getString("job.management");
	/** ジョブ管理 */
	public static final String STRING_JOB_MST = Messages.getString("job.management");
	/** ジョブ管理（スケジュール） */
	public static final String STRING_JOB_SCHEDULE = Messages.getString("schedule");
	/** ジョブ管理（ファイルチェック） */
	public static final String STRING_JOB_FILE_CHECK = Messages.getString("file.check");

	/** 障害検知 */
	public static final String STRING_SYSYTEM_TROUBLE_DETECTION = Messages.getString("trouble.detection");
	/** メンテナンス */
	public static final String STRING_SYSYTEM_MAINTENANCE = Messages.getString("maintenance.name");
	/** セルフチェック */
	public static final String STRING_SYSYTEM_SELFCHECK = Messages.getString("selfcheck.name");

	/** 環境構築 */
	public static final String STRING_INFRA = Messages.getString("infra.management");
	public static final String STRING_INFRA_FILE = Messages.getString("infra.file.manager");
	
	/** レポーティング */
	public static final String STRING_REPORTING = Messages.getString("reporting"); 

	/** マネージャ操作ログタイトル */
	/** リポジトリ */
	public static final String LOG_PREFIX_REPOSITORY = "[Repository]";
	/** アクセス */
	public static final String LOG_PREFIX_ACCESS = "[Access]";
	/** カレンダ */
	public static final String LOG_PREFIX_CALENDAR = "[Calendar]";
	/** 通知 */
	public static final String LOG_PREFIX_NOTIFY = "[Notify]";
	/** 環境構築 */
	public static final String LOG_PREFIX_INFRA = "[Infra]";
	/** 監視設定 */
	public static final String LOG_PREFIX_MONITOR = "[Monitor]";
	/** システムログ監視 */
	public static final String LOG_PREFIX_MONITOR_SYSTEMLOG = "[Systemlog]";
	/** ログファイル監視 */
	public static final String LOG_PREFIX_MONITOR_LOGFILE = "[Logfile]";
	/** Hinemosエージェント監視 */
	public static final String LOG_PREFIX_MONITOR_AGENT = "[Agent]";
	/** カスタム監視 */
	public static final String LOG_PREFIX_MONITOR_CUSTOM = "[Custom]";
	/** HTTP監視 */
	public static final String LOG_PREFIX_MONITOR_HTTP = "[Http]";
	/** HTTP監視(Scenario) */
	public static final String LOG_PREFIX_MONITOR_HTTP_SCENARIO = "[HttpScenario]";
	/** プロセス監視 */
	public static final String LOG_PREFIX_MONITOR_PROCESS = "[Process]";
	/** SQL監視 */
	public static final String LOG_PREFIX_MONITOR_SQL = "[Sql]";
	/** SNMP監視 */
	public static final String LOG_PREFIX_MONITOR_SNMP = "[Snmp]";
	/** PING監視 */
	public static final String LOG_PREFIX_MONITOR_PING = "[Ping]";
	/** SNMPTRAP監視 */
	public static final String LOG_PREFIX_MONITOR_SNMPTRAP = "[Snmptrap]";
	/** リソース監視 */
	public static final String LOG_PREFIX_MONITOR_PERFORMANCE = "[Resource]";
	/** サービス・ポート監視 */
	public static final String LOG_PREFIX_MONITOR_PORT = "[Port]";
	/** Windowsサービス監視 */
	public static final String LOG_PREFIX_MONITOR_WINSERVICE = "[WinService]";
	/** Windowsイベント監視 */
	public static final String LOG_PREFIX_MONITOR_WINEVENT = "[WinEvent]";
	/** JMX */
	public static final String LOG_PREFIX_MONITOR_JMX = "[Jmx]";
	/** 性能管理 */
	public static final String LOG_PREFIX_PERFORMANCE = "[Collector]";
	/** ジョブ管理 */
	public static final String LOG_PREFIX_JOB = "[Job]";
	/** メンテナンス */
	public static final String LOG_PREFIX_MAINTENANCE = "[Maintenance]";
	/** メールテンプレート */
	public static final String LOG_PREFIX_MAIL_TEMPLATE = "[MailTemplate]";
	/** ノードマップ */
	public static final String LOG_PREFIX_NODEMAP = "[NodeMap]";
	/** 仮想化管理 */
	public static final String LOG_PREFIX_VM = "[VM]";
	/** レポーティング */
	public static final String LOG_PREFIX_REPORTING = "[Reporting]"; 


	private static List<ExtensionType> extensionTypeList = new ArrayList<ExtensionType>();

	public static List<ExtensionType> getExtensionTypeList(){
		return extensionTypeList;
	}

	public static class ExtensionType{
		private String typeId;
		private int typeCode;
		private String stringType;

		public ExtensionType(String typeId, int typeCode, String stringType){
			this.typeId = typeId;
			this.typeCode = typeCode;
			this.stringType = stringType;
		}

		public String getTypeId() {
			return typeId;
		}

		public int getTypeCode() {
			return typeCode;
		}

		public String getStringType() {
			return stringType;
		}
	}

	public static void addExtensionType(ExtensionType extensionType){
		extensionTypeList.add(extensionType);
	}


	/**
	 * 機能略記が存在するかチェックします。
	 *
	 *
	 */
	public static boolean isExist(String typeId){

		if(typeId.equals(PLATFORM) ||
				typeId.equals(PLATFORM_NOTIFY) ||
				typeId.equals(PLATFORM_MAIL_TEMPLATE) ||
				typeId.equals(PLATFORM_LOG_TRANSFER) ||
				typeId.equals(PLATFORM_CALENDAR) ||
				typeId.equals(PLATFORM_CALENDAR_PATTERN) ||
				typeId.equals(PLATFORM_ACCESS) ||
				typeId.equals(PLATFORM_PRIORITY_JUDGMENT) ||
				typeId.equals(PLATFORM_REPOSITORY) ||
				typeId.equals(PLATFORM_REPSITORY_NODE) ||
				typeId.equals(PLATFORM_REPSITORY_SCOPE) ||
				typeId.equals(MONITOR) ||
				typeId.equals(MONITOR_AGENT ) ||
				typeId.equals(MONITOR_CUSTOM) ||
				typeId.equals(MONITOR_HTTP_N) ||
				typeId.equals(MONITOR_HTTP_S) ||
				typeId.equals(MONITOR_HTTP_SCENARIO) ||
				typeId.equals(MONITOR_LOGFILE) ||
				typeId.equals(MONITOR_PERFORMANCE) ||
				typeId.equals(MONITOR_PING) ||
				typeId.equals(MONITOR_PORT ) ||
				typeId.equals(MONITOR_PROCESS) ||
				typeId.equals(MONITOR_SNMP_N ) ||
				typeId.equals(MONITOR_SNMP_S ) ||
				typeId.equals(MONITOR_SNMPTRAP) ||
				typeId.equals(MONITOR_SQL_N ) ||
				typeId.equals(MONITOR_SQL_S ) ||
				typeId.equals(MONITOR_SYSTEMLOG) ||
				typeId.equals(MONITOR_SCOPE) ||
				typeId.equals(MONITOR_STATUS) ||
				typeId.equals(MONITOR_EVENT) ||
				typeId.equals(MONITOR_WINSERVICE) ||
				typeId.equals(MONITOR_WINEVENT) ||
				typeId.equals(MONITOR_JMX) ||
				typeId.equals(PERFORMANCE) ||
				typeId.equals(PERFORMANCE_RECORD) ||
				typeId.equals(PERFORMANCE_REALTIME) ||
				typeId.equals(JOB ) ||
				typeId.equals(JOB_MST ) ||
				typeId.equals(JOB_SESSION) ||
				typeId.equals(JOB_SESSION_DETAIL) ||
				typeId.equals(JOB_SESSION_NODE) ||
				typeId.equals(JOB_SCHEDULE) ||
				typeId.equals(JOB_SCHEDULE_RUN_DETAIL) ||
				typeId.equals(JOB_SESSION_FILE ) ||
				typeId.equals(JOB_FILE_CHECK ) ||
				typeId.equals(SYSYTEM ) ||
				typeId.equals(SYSYTEM_MAINTENANCE) ||
				typeId.equals(SYSYTEM_SELFCHECK) ||
				typeId.equals(INFRA) ||
				typeId.equals(INFRA_FILE) ||
				typeId.equals(REPORTING)){

			return true;
		} else if(!extensionTypeList.isEmpty()){
			for(ExtensionType extensionType: extensionTypeList){
				if(typeId.equals(extensionType.getTypeId())){
					return true;
				}
			}
		}

		return false;
	}


	/**
	 * 種別から文字列に変換します。<BR>
	 *
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_PLATFORM_ACCESS) {
			return STRING_PLATFORM_ACCESS;
		} else if (type == TYPE_PLATFORM_NOTIFY) {
			return STRING_PLATFORM_NOTIFY;
		} else if (type == TYPE_PLATFORM_CALENDAR) {
			return STRING_PLATFORM_CALENDAR;
		} else if (type == TYPE_PLATFORM_PRIORITY_JUDGMENT) {
			return STRING_PLATFORM_PRIORITY_JUDGMENT;
		} else if (type == TYPE_PLATFORM_LOG_TRANSFER) {
			return STRING_PLATFORM_LOG_TRANSFER;
		} else if (type == TYPE_PLATFORM_REPOSITORY) {
			return STRING_PLATFORM_REPOSITORY;
		} else if (type == TYPE_MONITOR) {
			return STRING_MONITOR;
		} else if (type == TYPE_MONITOR_AGENT) {
			return STRING_MONITOR_AGENT;
		} else if (type == TYPE_MONITOR_CUSTOM) {
			return STRING_MONITOR_CUSTOM;
		} else if (type == TYPE_MONITOR_HTTP) {
			return STRING_MONITOR_HTTP;
		} else if (type == TYPE_MONITOR_HTTP_SCENARIO) {
			return STRING_MONITOR_HTTP_SCENARIO;
		} else if (type == TYPE_MONITOR_LOGFILE) {
			return STRING_MONITOR_LOGFILE;
		} else if (type == TYPE_MONITOR_PING) {
			return STRING_MONITOR_PING;
		} else if (type == TYPE_MONITOR_PROCESS) {
			return STRING_MONITOR_PROCESS;
		} else if (type == TYPE_MONITOR_SNMP) {
			return STRING_MONITOR_SNMP;
		} else if (type == TYPE_MONITOR_SNMPTRAP) {
			return STRING_MONITOR_SNMPTRAP;
		} else if (type == TYPE_MONITOR_SQL) {
			return STRING_MONITOR_SQL;
		} else if (type == TYPE_MONITOR_SYSTEMLOG) {
			return STRING_MONITOR_SYSTEMLOG;
		} else if (type == TYPE_MONITOR_PERFORMANCE) {
			return STRING_MONITOR_PERFORMANCE;
		} else if (type == TYPE_MONITOR_PORT) {
			return STRING_MONITOR_PORT;
		} else if (type == TYPE_MONITOR_WINSERVICE) {
			return STRING_MONITOR_WINSERVICE;
		} else if (type == TYPE_MONITOR_WINEVENT) {
			return STRING_MONITOR_WINEVENT;
		} else if (type == TYPE_MONITOR_JMX) {
			return STRING_MONITOR_JMX;
		} else if (type == TYPE_PERFORMANCE) {
			return STRING_PERFORMANCE;
		} else if (type == TYPE_JOB) {
			return STRING_JOB;
		} else if (type == TYPE_JOB_MST) {
			return STRING_JOB_MST;
		} else if (type == TYPE_SYSYTEM_TROUBLE_DETECTION) {
			return STRING_SYSYTEM_TROUBLE_DETECTION;
		} else if (type == TYPE_SYSYTEM_MAINTENANCE) {
			return STRING_SYSYTEM_MAINTENANCE;
		} else if (type == TYPE_SYSYTEM_SELFCHECK) {
			return STRING_SYSYTEM_SELFCHECK;
		} else if (type == TYPE_INFRA) {
			return STRING_INFRA;
		} else if (type == TYPE_INFRA_FILE) {
			return STRING_INFRA_FILE;
		} else if (type == TYPE_REPORTING) {
			return STRING_REPORTING;
		} else if(!extensionTypeList.isEmpty()){
			for(ExtensionType extensionType: extensionTypeList){
				if(type == extensionType.getTypeCode()){
					return extensionType.getStringType();
				}
			}
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 *
	 * @param type
	 * @return
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_PLATFORM_ACCESS)) {
			return TYPE_PLATFORM_ACCESS;
		} else if (string.equals(STRING_PLATFORM_PRIORITY_JUDGMENT)) {
			return TYPE_PLATFORM_PRIORITY_JUDGMENT;
		} else if (string.equals(STRING_PLATFORM_CALENDAR)) {
			return TYPE_PLATFORM_CALENDAR;
		} else if (string.equals(STRING_PLATFORM_LOG_TRANSFER)) {
			return TYPE_PLATFORM_LOG_TRANSFER;
		} else if (string.equals(STRING_PLATFORM_REPOSITORY)) {
			return TYPE_PLATFORM_REPOSITORY;
		} else if (string.equals(STRING_PLATFORM_NOTIFY)) {
			return TYPE_PLATFORM_NOTIFY;
		} else if (string.equals(STRING_MONITOR)) {
			return TYPE_MONITOR;
		} else if (string.equals(STRING_MONITOR_AGENT)) {
			return TYPE_MONITOR_AGENT;
		} else if (string.equals(STRING_MONITOR_CUSTOM)) {
			return TYPE_MONITOR_CUSTOM;
		} else if (string.equals(STRING_MONITOR_HTTP)) {
			return TYPE_MONITOR_HTTP;
		} else if (string.equals(STRING_MONITOR_HTTP)) {
			return TYPE_MONITOR_HTTP_SCENARIO;
		} else if (string.equals(STRING_MONITOR_LOGFILE)) {
			return TYPE_MONITOR_LOGFILE;
		} else if (string.equals(STRING_MONITOR_PING)) {
			return TYPE_MONITOR_PING;
		} else if (string.equals(STRING_MONITOR_PROCESS)) {
			return TYPE_MONITOR_PROCESS;
		} else if (string.equals(STRING_MONITOR_SNMP)) {
			return TYPE_MONITOR_SNMP;
		} else if (string.equals(STRING_MONITOR_SNMPTRAP)) {
			return TYPE_MONITOR_SNMPTRAP;
		} else if (string.equals(STRING_MONITOR_SQL)) {
			return TYPE_MONITOR_SQL;
		} else if (string.equals(STRING_MONITOR_PERFORMANCE)) {
			return TYPE_MONITOR_PERFORMANCE;
		} else if (string.equals(STRING_MONITOR_PORT)) {
			return TYPE_MONITOR_PORT;
		} else if (string.equals(STRING_MONITOR_WINSERVICE)) {
			return TYPE_MONITOR_WINSERVICE;
		} else if (string.equals(STRING_MONITOR_WINEVENT)) {
			return TYPE_MONITOR_WINEVENT;
		} else if (string.equals(STRING_MONITOR_JMX)) {
			return TYPE_MONITOR_JMX;
		} else if (string.equals(STRING_MONITOR_SYSTEMLOG)) {
			return TYPE_MONITOR_SYSTEMLOG;
		} else if (string.equals(STRING_PERFORMANCE)) {
			return TYPE_PERFORMANCE;
		} else if (string.equals(STRING_JOB)) {
			return TYPE_JOB;
		} else if (string.equals(STRING_JOB_MST)) {
			return TYPE_JOB_MST;
		} else if (string.equals(STRING_SYSYTEM_TROUBLE_DETECTION)) {
			return TYPE_SYSYTEM_TROUBLE_DETECTION;
		} else if (string.equals(STRING_SYSYTEM_MAINTENANCE)) {
			return TYPE_SYSYTEM_MAINTENANCE;
		} else if (string.equals(STRING_SYSYTEM_SELFCHECK)) {
			return TYPE_SYSYTEM_SELFCHECK;
		} else if (string.equals(STRING_INFRA)) {
			return TYPE_INFRA;
		} else if (string.equals(STRING_INFRA_FILE)) {
			return TYPE_INFRA_FILE;
		} else if (string.equals(STRING_REPORTING)) {
			return TYPE_REPORTING;
		} else if(!extensionTypeList.isEmpty()){
			for(ExtensionType extensionType: extensionTypeList){
				if(string.equals(extensionType.getStringType())){
					return extensionType.getTypeCode();
				}
			}
		}
		return -1;
	}


	/**
	 * 名前から文字列に変換します。<BR>
	 *
	 * @param string
	 * @return
	 */
	public static String nameToString(String string) {
		if (string.equals(PLATFORM_ACCESS)) {
			return STRING_PLATFORM_ACCESS;
		} else if (string.equals(PLATFORM_PRIORITY_JUDGMENT)) {
			return STRING_PLATFORM_PRIORITY_JUDGMENT;
		} else if (string.equals(PLATFORM_CALENDAR)) {
			return STRING_PLATFORM_CALENDAR;
		} else if (string.equals(PLATFORM_CALENDAR_PATTERN)) {
			return STRING_PLATFORM_CALENDAR_PATTERN;
		} else if (string.equals(PLATFORM_LOG_TRANSFER)) {
			return STRING_PLATFORM_LOG_TRANSFER;
		} else if (string.equals(PLATFORM_REPOSITORY)) {
			return STRING_PLATFORM_REPOSITORY;
		} else if (string.equals(PLATFORM_NOTIFY)) {
			return STRING_PLATFORM_NOTIFY;
		} else if (string.equals(PLATFORM_MAIL_TEMPLATE)) {
			return STRING_PLATFORM_MAIL_TEMPLATE;
		} else if (string.equals(MONITOR)) {
			return STRING_MONITOR;
		} else if (string.equals(MONITOR_AGENT)) {
			return STRING_MONITOR_AGENT;
		} else if (string.equals(MONITOR_CUSTOM)) {
			return STRING_MONITOR_CUSTOM;
		} else if (string.equals(MONITOR_HTTP_N)) {
			return STRING_MONITOR_HTTP;
		} else if (string.equals(MONITOR_HTTP_S)) {
			return STRING_MONITOR_HTTP;
		} else if (string.equals(MONITOR_HTTP_SCENARIO)) {
			return STRING_MONITOR_HTTP;
		} else if (string.equals(MONITOR_PING)) {
			return STRING_MONITOR_PING;
		} else if (string.equals(MONITOR_PROCESS)) {
			return STRING_MONITOR_PROCESS;
		} else if (string.equals(MONITOR_SNMP_N)) {
			return STRING_MONITOR_SNMP;
		} else if (string.equals(MONITOR_SNMP_S)) {
			return STRING_MONITOR_SNMP;
		} else if (string.equals(MONITOR_SNMPTRAP)) {
			return STRING_MONITOR_SNMPTRAP;
		} else if (string.equals(MONITOR_SQL_N)) {
			return STRING_MONITOR_SQL;
		} else if (string.equals(MONITOR_SQL_S)) {
			return STRING_MONITOR_SQL;
		} else if (string.equals(MONITOR_PERFORMANCE)) {
			return STRING_MONITOR_PERFORMANCE;
		} else if (string.equals(MONITOR_PORT)) {
			return STRING_MONITOR_PORT;
		} else if (string.equals(MONITOR_WINSERVICE)) {
			return STRING_MONITOR_WINSERVICE;
		} else if (string.equals(MONITOR_WINEVENT)) {
			return STRING_MONITOR_WINEVENT;
		} else if (string.equals(MONITOR_JMX)) {
			return STRING_MONITOR_JMX;
		} else if (string.equals(MONITOR_SYSTEMLOG)) {
			return STRING_MONITOR_SYSTEMLOG;
		} else if (string.equals(MONITOR_LOGFILE)) {
			return STRING_MONITOR_LOGFILE;
		} else if (string.equals(PERFORMANCE)) {
			return STRING_PERFORMANCE;
		} else if (string.equals(JOB)) {
			return STRING_JOB;
		} else if (string.equals(JOB_MST)) {
			return STRING_JOB_MST;
		} else if (string.equals(JOB_SCHEDULE)) {
			return STRING_JOB_SCHEDULE;
		} else if (string.equals(JOB_FILE_CHECK)) {
			return STRING_JOB_FILE_CHECK;
		} else if (string.equals(SYSYTEM_MAINTENANCE)) {
			return STRING_SYSYTEM_MAINTENANCE;
		} else if (string.equals(SYSYTEM_SELFCHECK)) {
			return STRING_SYSYTEM_SELFCHECK;
		} else if (string.equals(INFRA)) {
			return STRING_INFRA;
		} else if (string.equals(INFRA_FILE)) {
			return STRING_INFRA_FILE;
		} else if (string.equals(REPORTING)) {
			return STRING_REPORTING;
		} else if(!extensionTypeList.isEmpty()){
			for(ExtensionType extensionType: extensionTypeList){
				if(string.equals(extensionType.getTypeId())){
					return extensionType.getStringType();
				}
			}
		}
		return "";
	}
}
