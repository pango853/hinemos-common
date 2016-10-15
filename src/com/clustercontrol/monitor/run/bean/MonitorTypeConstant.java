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

package com.clustercontrol.monitor.run.bean;

import com.clustercontrol.util.Messages;

/**
 * 監視種別の定義を定数として格納するクラス<BR>
 * 
 * @version 4.0.0
 * @since 2.1.0
 */
public class MonitorTypeConstant {
	/** 真偽値（種別）。 */
	public static final int TYPE_TRUTH = 0;

	/** 数値（種別）。 */
	public static final int TYPE_NUMERIC = 1;

	/** 文字列（種別）。 */
	public static final int TYPE_STRING = 2;

	/** トラップ（種別）。 */
	public static final int TYPE_TRAP = 3;

	/** シナリオ（種別）。 */
	public static final int TYPE_SCENARIO = 4;	

	/** 真偽値（文字列）。 */
	public static final String STRING_TRUTH = Messages.getString("truth");

	/** 数値（文字列）。 */
	public static final String STRING_NUMERIC = Messages.getString("numeric");

	/** 文字列（文字列）。 */
	public static final String STRING_STRING = Messages.getString("string");

	/** トラップ（文字列）。 */
	public static final String STRING_TRAP = Messages.getString("trap");

	/** シナリオ（文字列）。 */
	public static final String STRING_SCENARIO = Messages.getString("scenario");

	/**
	 * 種別から文字列に変換します。
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_TRUTH) {
			return STRING_TRUTH;
		} else if (type == TYPE_NUMERIC) {
			return STRING_NUMERIC;
		} else if (type == TYPE_STRING) {
			return STRING_STRING;
		} else if (type == TYPE_TRAP) {
			return STRING_TRAP;
		} else if (type == TYPE_SCENARIO) {
			return STRING_SCENARIO;
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
		if (string.equals(STRING_TRUTH)) {
			return TYPE_TRUTH;
		} else if (string.equals(STRING_NUMERIC)) {
			return TYPE_NUMERIC;
		} else if (string.equals(STRING_STRING)) {
			return TYPE_STRING;
		} else if (string.equals(STRING_TRAP)) {
			return TYPE_TRAP;
		} else if (string.equals(STRING_SCENARIO)) {
			return TYPE_SCENARIO;
		}
		return -1;
	}
}