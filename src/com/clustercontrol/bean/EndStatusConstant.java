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
 * ジョブ終了状態の定数クラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class EndStatusConstant {
	/** 正常 */
	public static final int TYPE_NORMAL = 0;

	/** 警告 */
	public static final int TYPE_WARNING = 1;

	/** 異常 */
	public static final int TYPE_ABNORMAL = 2;

	/** 開始 */
	public static final int TYPE_BEGINNING = 3;

	/** すべての終了状態 */
	public static final int TYPE_ANY = 4;

	/** 正常 */
	public static final String STRING_NORMAL = Messages.getString("normal");

	/** 警告 */
	public static final String STRING_WARNING = Messages.getString("warning");

	/** 異常 */
	public static final String STRING_ABNORMAL = Messages.getString("abnormal");

	/** 開始 */
	public static final String STRING_BEGINNING = Messages.getString("start");

	/** すべての終了状態 */
	public static final String STRING_ANY = Messages.getString("asterisk");

	/** 正常 */
	public static final int INITIAL_VALUE_NORMAL = 0;

	/** 警告 */
	public static final int INITIAL_VALUE_WARNING = 1;

	/** 異常 */
	public static final int INITIAL_VALUE_ABNORMAL = -1;

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_NORMAL) {
			return STRING_NORMAL;
		} else if (type == TYPE_WARNING) {
			return STRING_WARNING;
		} else if (type == TYPE_ABNORMAL) {
			return STRING_ABNORMAL;
		} else if (type == TYPE_BEGINNING) {
			return STRING_BEGINNING;
		} else if (type == TYPE_ANY) {
			return STRING_ANY;
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
		if (string.equals(STRING_NORMAL)) {
			return TYPE_NORMAL;
		} else if (string.equals(STRING_WARNING)) {
			return TYPE_WARNING;
		} else if (string.equals(STRING_ABNORMAL)) {
			return TYPE_ABNORMAL;
		} else if (string.equals(STRING_BEGINNING)) {
			return TYPE_BEGINNING;
		} else if (string.equalsIgnoreCase(STRING_ANY)) {
			return TYPE_ANY;
		}
		return -1;
	}
}