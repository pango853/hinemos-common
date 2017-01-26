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

import com.clustercontrol.util.Messages;

/**
 * Hinemosの機能を定数として格納するクラス<BR>
 *
 * @version 4.0.0
 * @since 2.1.2
 */
public class PluginConstant {
	/** リポジトリ */
	public static final int TYPE_REPOSITORY = 0;
	/** アクセス */
	public static final int TYPE_ACCESSCONTROL = 1;
	/** ジョブ管理 */
	public static final int TYPE_JOBMANAGEMENT = 2;
	/** 性能管理 */
	public static final int TYPE_PERFORMANCE = 4;
	/** 監視設定 */
	public static final int TYPE_MONITOR = 5;
	/** システムログ監視 */
	public static final int TYPE_SYSTEMLOG_MONITOR = 6;
	/** Hinemosエージェント監視 */
	public static final int TYPE_AGENT_MONITOR = 7;
	/** HTTP監視 */
	public static final int TYPE_HTTP_MONITOR = 8;
	/** プロセス監視 */
	public static final int TYPE_PROCESS_MONITOR = 9;
	/** SQL監視 */
	public static final int TYPE_SQL_MONITOR = 10;
	/** SNMP監視 */
	public static final int TYPE_SNMP_MONITOR = 11;
	/** PING監視 */
	public static final int TYPE_PING_MONITOR = 12;
	/** カレンダ */
	public static final int TYPE_CALENDAR = 13;
	/** 通知 */
	public static final int TYPE_NOTIFY = 14;
	/** 重要度判定 */
	public static final int TYPE_PRIORITY_JUDGMENT = 15;
	/** ログ転送 */
	public static final int TYPE_LOG_TRANSFER = 16;
	/** 障害検知 */
	public static final int TYPE_TROUBLE_DETECTION = 17;
	/** SNMPTRAP監視 */
	public static final int TYPE_SNMPTRAP_MONITOR = 18;
	/** リソース監視 */
	public static final int TYPE_PERFORMANCE_MONITOR = 19;
	/** サービス・ポート監視 */
	public static final int TYPE_PORT_MONITOR = 20;
	/** カスタム監視 */
	public static final int TYPE_CUSTOM_MONITOR = 21;
	/** Windowsサービス監視 */
	public static final int TYPE_WINSERVICE_MONITOR = 22;
	/** Windowsイベント監視 */
	public static final int TYPE_WINEVENT_MONITOR = 23;
	/** 環境構築 */
	public static final int TYPE_INFRA = 24;

	/** リポジトリ */
	public static final String STRING_REPOSITORY = Messages.getString("repository");
	/** アクセス */
	public static final String STRING_ACCESSCONTROL = Messages.getString("accesscontrol");
	/** ジョブ管理 */
	public static final String STRING_JOBMANAGEMENT = Messages.getString("job.management");
	/** 性能管理 */
	public static final String STRING_PERFORMANCE = Messages.getString("performance");
	/** 監視設定 */
	public static final String STRING_MONITOR = Messages.getString("monitor.setting");
	/** システムログ監視 */
	public static final String STRING_SYSTEMLOG_MONITOR = Messages.getString("systemlog.monitor");
	/** Hinemosエージェント監視 */
	public static final String STRING_AGENT_MONITOR = Messages.getString("agent.monitor");
	/** HTTP監視 */
	public static final String STRING_HTTP_MONITOR = Messages.getString("http.monitor");
	/** プロセス監視 */
	public static final String STRING_PROCESS_MONITOR = Messages.getString("process.monitor");
	/** SQL監視 */
	public static final String STRING_SQL_MONITOR = Messages.getString("sql.monitor");
	/** SNMP監視 */
	public static final String STRING_SNMP_MONITOR = Messages.getString("snmp.monitor");
	/** PING監視 */
	public static final String STRING_PING_MONITOR = Messages.getString("ping.monitor");
	/** カレンダ */
	public static final String STRING_CALENDAR = Messages.getString("calendar");
	/** 通知 */
	public static final String STRING_NOTIFY = Messages.getString("notify");
	/** 重要度判定 */
	public static final String STRING_PRIORITY_JUDGMENT = Messages.getString("priority.judgment");
	/** ログ転送 */
	public static final String STRING_LOG_TRANSFER = Messages.getString("logtransfer");
	/** 障害検知 */
	public static final String STRING_TROUBLE_DETECTION = Messages.getString("trouble.detection");
	/** SNMPTRAP監視 */
	public static final String STRING_SNMPTRAP_MONITOR = Messages.getString("snmptrap.monitor");
	/** リソース監視 */
	public static final String STRING_PERFORMANCE_MONITOR = Messages.getString("performance.monitor");
	/** サービス・ポート監視 */
	public static final String STRING_PORT_MONITOR = Messages.getString("port.monitor");
	/** カスタム監視 */
	public static final String STRING_CUSTOM_MONITOR = Messages.getString("command.monitor");
	/** Windowsサービス監視 */
	public static final String STRING_WINSERVICE_MONITOR = Messages.getString("winservice.monitor");
	/** Windowsイベント監視 */
	public static final String STRING_WINEVENT_MONITOR = Messages.getString("winevent.monitor");
	/** 環境構築 */
	public static final String STRING_INFRA = Messages.getString("infra");

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_ACCESSCONTROL) {
			return STRING_ACCESSCONTROL;
		} else if (type == TYPE_AGENT_MONITOR) {
			return STRING_AGENT_MONITOR;
		} else if (type == TYPE_CALENDAR) {
			return STRING_CALENDAR;
		} else if (type == TYPE_HTTP_MONITOR) {
			return STRING_HTTP_MONITOR;
		} else if (type == TYPE_JOBMANAGEMENT) {
			return STRING_JOBMANAGEMENT;
		} else if (type == TYPE_LOG_TRANSFER) {
			return STRING_LOG_TRANSFER;
		} else if (type == TYPE_MONITOR) {
			return STRING_MONITOR;
		} else if (type == TYPE_NOTIFY) {
			return STRING_NOTIFY;
		} else if (type == TYPE_PERFORMANCE) {
			return STRING_PERFORMANCE;
		} else if (type == TYPE_PING_MONITOR) {
			return STRING_PING_MONITOR;
		} else if (type == TYPE_PRIORITY_JUDGMENT) {
			return STRING_PRIORITY_JUDGMENT;
		} else if (type == TYPE_PROCESS_MONITOR) {
			return STRING_PROCESS_MONITOR;
		} else if (type == TYPE_REPOSITORY) {
			return STRING_REPOSITORY;
		} else if (type == TYPE_SNMP_MONITOR) {
			return STRING_SNMP_MONITOR;
		} else if (type == TYPE_SNMPTRAP_MONITOR) {
			return STRING_SNMPTRAP_MONITOR;
		} else if (type == TYPE_SQL_MONITOR) {
			return STRING_SQL_MONITOR;
		} else if (type == TYPE_SYSTEMLOG_MONITOR) {
			return STRING_SYSTEMLOG_MONITOR;
		} else if (type == TYPE_TROUBLE_DETECTION) {
			return STRING_TROUBLE_DETECTION;
		} else if (type == TYPE_PERFORMANCE_MONITOR) {
			return STRING_PERFORMANCE_MONITOR;
		} else if (type == TYPE_PORT_MONITOR) {
			return STRING_PORT_MONITOR;
		} else if (type == TYPE_CUSTOM_MONITOR) {
			return STRING_CUSTOM_MONITOR;
		} else if (type == TYPE_WINSERVICE_MONITOR) {
			return STRING_WINSERVICE_MONITOR;
		} else if (type == TYPE_WINEVENT_MONITOR) {
			return STRING_WINEVENT_MONITOR;
		} else if (type == TYPE_INFRA) {
			return STRING_INFRA;
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
		if (string.equals(STRING_ACCESSCONTROL)) {
			return TYPE_ACCESSCONTROL;
		} else if (string.equals(STRING_AGENT_MONITOR)) {
			return TYPE_AGENT_MONITOR;
		} else if (string.equals(STRING_CALENDAR)) {
			return TYPE_CALENDAR;
		} else if (string.equals(STRING_HTTP_MONITOR)) {
			return TYPE_HTTP_MONITOR;
		} else if (string.equals(STRING_JOBMANAGEMENT)) {
			return TYPE_JOBMANAGEMENT;
		} else if (string.equals(STRING_LOG_TRANSFER)) {
			return TYPE_LOG_TRANSFER;
		} else if (string.equals(STRING_MONITOR)) {
			return TYPE_MONITOR;
		} else if (string.equals(STRING_NOTIFY)) {
			return TYPE_NOTIFY;
		} else if (string.equals(STRING_PERFORMANCE)) {
			return TYPE_PERFORMANCE;
		} else if (string.equals(STRING_PING_MONITOR)) {
			return TYPE_PING_MONITOR;
		} else if (string.equals(STRING_PRIORITY_JUDGMENT)) {
			return TYPE_PRIORITY_JUDGMENT;
		} else if (string.equals(STRING_PROCESS_MONITOR)) {
			return TYPE_PROCESS_MONITOR;
		} else if (string.equals(STRING_REPOSITORY)) {
			return TYPE_REPOSITORY;
		} else if (string.equals(STRING_SNMP_MONITOR)) {
			return TYPE_SNMP_MONITOR;
		} else if (string.equals(STRING_SNMPTRAP_MONITOR)) {
			return TYPE_SNMPTRAP_MONITOR;
		} else if (string.equals(STRING_SQL_MONITOR)) {
			return TYPE_SQL_MONITOR;
		} else if (string.equals(STRING_SYSTEMLOG_MONITOR)) {
			return TYPE_SYSTEMLOG_MONITOR;
		} else if (string.equals(STRING_TROUBLE_DETECTION)) {
			return TYPE_TROUBLE_DETECTION;
		} else if (string.equals(STRING_PERFORMANCE_MONITOR)) {
			return TYPE_PERFORMANCE_MONITOR;
		} else if (string.equals(STRING_PORT_MONITOR)) {
			return TYPE_PORT_MONITOR;
		} else if (string.equals(STRING_CUSTOM_MONITOR)) {
			return TYPE_CUSTOM_MONITOR;
		} else if (string.equals(STRING_WINSERVICE_MONITOR)) {
			return TYPE_WINSERVICE_MONITOR;
		} else if (string.equals(STRING_WINEVENT_MONITOR)) {
			return TYPE_WINEVENT_MONITOR;
		} else if (string.equals(STRING_INFRA)) {
			return TYPE_INFRA;
		}
		return -1;
	}
}
