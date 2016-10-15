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
 * YES／NOの定義を定数として格納するクラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class YesNoConstant {
	/** Yes（種別）。 */
	public static final int TYPE_YES = 1;

	/** No（種別）。 */
	public static final int TYPE_NO = 0;


	/** Yes（文字列）。 */
	public static final String STRING_YES = Messages.getString("yes");

	/** No（文字列）。 */
	public static final String STRING_NO = Messages.getString("no");


	/** Yes（真偽）。 */
	public static final boolean BOOLEAN_YES = true;

	/** No（真偽）。 */
	public static final boolean BOOLEAN_NO = false;

	/**
	 * 種別から文字列に変換します。
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_YES) {
			return STRING_YES;
		} else if (type == TYPE_NO) {
			return STRING_NO;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_YES)) {
			return TYPE_YES;
		} else if (string.equals(STRING_NO)) {
			return TYPE_NO;
		}
		return -1;
	}

	/**
	 * 種別から真偽に変換します。
	 * 
	 * @param type 種別
	 * @return 真偽
	 */
	public static boolean typeToBoolean(int type) {
		if (type == TYPE_YES) {
			return BOOLEAN_YES;
		} else if (type == TYPE_NO) {
			return BOOLEAN_NO;
		}
		return false;
	}

	/**
	 * 真偽から種別に変換します。
	 * 
	 * @param bool 真偽
	 * @return 種別
	 */
	public static int booleanToType(boolean bool) {
		if (bool == BOOLEAN_YES) {
			return TYPE_YES;
		} else if (bool == BOOLEAN_NO) {
			return TYPE_NO;
		}
		return -1;
	}
}