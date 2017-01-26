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
 * 有効／無効の定義を定数として格納するクラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class ValidConstant {
	/** 有効（種別）。 */
	public static final int TYPE_VALID = 1;

	/** 無効（種別）。 */
	public static final int TYPE_INVALID = 0;


	/** 有効（文字列）。 */
	public static final String STRING_VALID = Messages.getString("valid");

	/** 無効（文字列）。 */
	public static final String STRING_INVALID = Messages.getString("invalid");


	/** 有効（真偽）。 */
	public static final boolean BOOLEAN_VALID = true;

	/** 無効（真偽）。 */
	public static final boolean BOOLEAN_INVALID = false;

	/**
	 * 種別から文字列に変換します。
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_VALID) {
			return STRING_VALID;
		} else if (type == TYPE_INVALID) {
			return STRING_INVALID;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_VALID)) {
			return TYPE_VALID;
		} else if (string.equals(STRING_INVALID)) {
			return TYPE_INVALID;
		}
		return -1;
	}

	/**
	 * 種別から真偽に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 真偽
	 */
	public static boolean typeToBoolean(int type) {
		if (type == TYPE_VALID) {
			return BOOLEAN_VALID;
		} else if (type == TYPE_INVALID) {
			return BOOLEAN_INVALID;
		}
		return false;
	}

	/**
	 * 真偽から種別に変換します。<BR>
	 * 
	 * @param bool 真偽
	 * @return 種別
	 */
	public static int booleanToType(boolean bool) {
		if (bool == BOOLEAN_VALID) {
			return TYPE_VALID;
		} else if (bool == BOOLEAN_INVALID) {
			return TYPE_INVALID;
		}
		return -1;
	}
}