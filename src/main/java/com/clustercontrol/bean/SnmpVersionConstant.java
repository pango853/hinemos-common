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
 * SNMPバージョンの定義クラス<BR>
 *
 * @version 2.0.0
 * @since 2.0.0
 */
public class SnmpVersionConstant {
	/** v1 */
	public static final int TYPE_V1 = 0;

	/** v2c */
	public static final int TYPE_V2 = 1;

	/** v3 */
	public static final int TYPE_V3 = 2;

	/** v1（文字列） */
	public static final String STRING_V1 = Messages.getString("snmp.version.1");

	/** v2c（文字列） */
	public static final String STRING_V2 = Messages.getString("snmp.version.2");

	/** v3（文字列） */
	public static final String STRING_V3 = Messages.getString("snmp.version.3");

	/**
	 * 種別から文字列に変換する
	 *
	 * @param type
	 * @return
	 */
	public static String typeToString(Integer type) {
		if (type == TYPE_V1) {
			return STRING_V1;
		} else if (type == TYPE_V2) {
			return STRING_V2;
		} else if (type == TYPE_V3) {
			return STRING_V3;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換する
	 *
	 * @param type
	 * @return
	 */
	public static Integer stringToType(String string) {
		if (STRING_V1.equals(string)) {
			return TYPE_V1;
		} else if (STRING_V2.equals(string)) {
			return TYPE_V2;
		} else if (STRING_V3.equals(string)) {
			return TYPE_V3;
		}
		return -1;
	}
	
	/**
	 * 文字列からSnmp種別に変換する
	 *
	 * @param type
	 * @return
	 */
	public static Integer stringToSnmpType(String string) {
		Integer snmpType = stringToType(string);
		if (snmpType == TYPE_V3) {
			snmpType = 3;
		}
		
		return snmpType;
	}
}