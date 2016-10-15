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

package com.clustercontrol.snmp.bean;

import com.clustercontrol.util.Messages;

/**
 * SNMPで利用する取得値の加工に関する定数クラス<BR>
 * 
 * @version 2.0.0
 * @since 2.0.0
 */
public class ConvertValueConstant {
	/** 加工しない */
	public static final int TYPE_NO = 0;

	/** 差をとる */
	public static final int TYPE_DELTA = 1;

	/** 加工しない */
	public static final String STRING_NO = Messages.getString("convert.no");

	/** 差をとる */
	public static final String STRING_DELTA = Messages.getString("delta");

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_NO) {
			return STRING_NO;
		} else if (type == TYPE_DELTA) {
			return STRING_DELTA;
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
		if (string.equals(STRING_NO)) {
			return TYPE_NO;
		} else if (string.equals(STRING_DELTA)) {
			return TYPE_DELTA;
		}
		return -1;
	}
}