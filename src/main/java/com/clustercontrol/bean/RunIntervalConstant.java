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
 * 実行間隔の定義を定数として格納するクラス<BR>
 * 
 * @version 2.0.0
 * @since 2.0.0
 */
public class RunIntervalConstant {

	/** 毎時。 */
	public static final int EVERY_HOUR = 0;

	/** 毎分。 */
	public static final int EVERY_MINUTE = 1;

	/** 毎秒。 */
	public static final int EVERY_SECOND = 2;

	/** 1秒（種別）。 */
	public static final int TYPE_SEC_01 = 1;

	/** 5秒（種別）。 */
	public static final int TYPE_SEC_05 = 5;

	/** 10秒（種別）。 */
	public static final int TYPE_SEC_10 = 10;

	/** 30秒（種別）。 */
	public static final int TYPE_SEC_30 = 30;

	/** 1分（種別）。 */
	public static final int TYPE_MIN_01 = 60;

	/** 5分（種別）。 */
	public static final int TYPE_MIN_05 = 300;

	/** 10分（種別）。 */
	public static final int TYPE_MIN_10 = 600;

	/** 30分（種別）。 */
	public static final int TYPE_MIN_30 = 1800;

	/** 60分（種別）。 */
	public static final int TYPE_MIN_60 = 3600;

	/** 1秒（文字列）。 */
	public static final String STRING_SEC_01 = TYPE_SEC_01 + Messages.getString("second");

	/** 5秒（文字列）。 */
	public static final String STRING_SEC_05 = TYPE_SEC_05 + Messages.getString("second");

	/** 15秒（文字列）。 */
	public static final String STRING_SEC_10 = TYPE_SEC_10 + Messages.getString("second");

	/** 30秒（文字列）。 */
	public static final String STRING_SEC_30 = TYPE_SEC_30 + Messages.getString("second");

	/** 1分（文字列）。 */
	public static final String STRING_MIN_01 = TYPE_MIN_01/60 + Messages.getString("minute");

	/** 5分（文字列）。 */
	public static final String STRING_MIN_05 = TYPE_MIN_05/60 + Messages.getString("minute");

	/** 15分（文字列）。 */
	public static final String STRING_MIN_10 = TYPE_MIN_10/60 + Messages.getString("minute");

	/** 30分（文字列）。 */
	public static final String STRING_MIN_30 = TYPE_MIN_30/60 + Messages.getString("minute");

	/** 60分（文字列）。 */
	public static final String STRING_MIN_60 = TYPE_MIN_60/60 + Messages.getString("minute");

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_SEC_01) {
			return STRING_SEC_01;
		} else if (type == TYPE_SEC_05) {
			return STRING_SEC_05;
		} else if (type == TYPE_SEC_10) {
			return STRING_SEC_10;
		} else if (type == TYPE_SEC_30) {
			return STRING_SEC_30;
		} else if (type == TYPE_MIN_01) {
			return STRING_MIN_01;
		} else if (type == TYPE_MIN_05) {
			return STRING_MIN_05;
		} else if (type == TYPE_MIN_10) {
			return STRING_MIN_10;
		} else if (type == TYPE_MIN_30) {
			return STRING_MIN_30;
		} else if (type == TYPE_MIN_60) {
			return STRING_MIN_60;
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
		if (string.equals(STRING_SEC_01)) {
			return TYPE_SEC_01;
		} else if (string.equals(STRING_SEC_05)) {
			return TYPE_SEC_05;
		} else if (string.equals(STRING_SEC_10)) {
			return TYPE_SEC_10;
		} else if (string.equals(STRING_SEC_30)) {
			return TYPE_SEC_30;
		} else if (string.equals(STRING_MIN_01)) {
			return TYPE_MIN_01;
		} else if (string.equals(STRING_MIN_05)) {
			return TYPE_MIN_05;
		} else if (string.equals(STRING_MIN_10)) {
			return TYPE_MIN_10;
		} else if (string.equals(STRING_MIN_30)) {
			return TYPE_MIN_30;
		} else if (string.equals(STRING_MIN_60)) {
			return TYPE_MIN_60;
		}
		return -1;
	}
}