/*

Copyright (C) 2013 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
useful, but WITHOUT ANY WARRANTY; without even the implied
warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.monitor.bean;

import java.util.ArrayList;

import com.clustercontrol.bean.HinemosModuleConstant;

/**
 * 監視種別<BR>
 * 
 * @version 4.1.0
 * @since 1.0.0
 */
public class MonitorTypeMstConstant {

	private static ArrayList<ArrayList<Object>> monitorTypeMst =
			new ArrayList<ArrayList<Object>>();

	/** 監視種別：数値 */
	public static final int MONITOR_TYPE_NUMERIC = 1;
	/** 監視種別：文字列 */
	public static final int MONITOR_TYPE_STRING = 2;
	/** 監視種別：真偽値 */
	public static final int MONITOR_TYPE_BOOLEAN = 3;
	/** 監視種別：TRAP */
	public static final int MONITOR_TYPE_TRAP = 4;
	/** 監視種別：シナリオ */
	public static final int MONITOR_TYPE_SCENARIO = 5;
	
	static {
		ArrayList<Object> list = null;
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_AGENT);
		list.add(0);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_HTTP_N);
		list.add(MONITOR_TYPE_NUMERIC);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_HTTP_S);
		list.add(MONITOR_TYPE_STRING);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_HTTP_SCENARIO);
		list.add(4);  //MONITOR_TYPE_SCENARIO 
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_PING);
		list.add(1);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SNMP_N);
		list.add(MONITOR_TYPE_NUMERIC);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SNMP_S);
		list.add(MONITOR_TYPE_STRING);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SNMPTRAP);
		list.add(3);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SQL_N);
		list.add(MONITOR_TYPE_NUMERIC);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SQL_S);
		list.add(MONITOR_TYPE_STRING);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_WINSERVICE);
		list.add(0);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_WINEVENT);
		list.add(2);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_CUSTOM);
		list.add(1);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_PORT);
		list.add(1);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_SYSTEMLOG);
		list.add(2);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_PROCESS);
		list.add(1);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_PERFORMANCE);
		list.add(1);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_LOGFILE);
		list.add(2);
		monitorTypeMst.add(list);
		list = new ArrayList<Object>();
		list.add(HinemosModuleConstant.MONITOR_JMX);
		list.add(1);
		monitorTypeMst.add(list);
	}

	public static ArrayList<ArrayList<Object>> getListAll() {
		return monitorTypeMst;
	}
}