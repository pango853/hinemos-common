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

import java.util.Locale;

import com.clustercontrol.util.Messages;

/**
 * 重要度の定義を定数として格納するクラス<BR>
 * 
 * @version 2.0.0
 * @since 1.0.0
 */
public class PriorityConstant {

	/** 危険（種別）。 */
	public static final int TYPE_CRITICAL = 0;

	/** 警告（種別）。 */
	public static final int TYPE_WARNING = 2;

	/** 通知（種別）。 */
	public static final int TYPE_INFO = 3;

	/** 不明（種別）。 */
	public static final int TYPE_UNKNOWN = 1;

	/** なし（種別）。 */
	public static final int TYPE_NONE = 4;

	/** 値取得失敗 */
	public static final int TYPE_FAILURE = -1;


	/** 危険（文字列）。 */
	public static final String STRING_CRITICAL = Messages.getString("critical");

	/** 警告（文字列）。 */
	public static final String STRING_WARNING = Messages.getString("warning");

	/** 通知（文字列）。 */
	public static final String STRING_INFO = Messages.getString("info");

	/** 不明（文字列）。 */
	public static final String STRING_UNKNOWN = Messages.getString("unknown");

	/** 危険 日本語（文字列）。 */
	public static final String STRING_JP_CRITICAL = Messages.getString("critical", Locale.JAPANESE);

	/** 警告 日本語（文字列）。 */
	public static final String STRING_JP_WARNING = Messages.getString("warning", Locale.JAPANESE);

	/** 通知 日本語（文字列）。 */
	public static final String STRING_JP_INFO = Messages.getString("info", Locale.JAPANESE);

	/** 不明 日本語（文字列）。 */
	public static final String STRING_JP_UNKNOWN = Messages.getString("unknown", Locale.JAPANESE);

	/** 危険 英語（文字列）。 */
	public static final String STRING_EN_CRITICAL = Messages.getString("critical", Locale.ENGLISH);

	/** 警告 英語（文字列）。 */
	public static final String STRING_EN_WARNING = Messages.getString("warning", Locale.ENGLISH);

	/** 通知 英語（文字列）。 */
	public static final String STRING_EN_INFO = Messages.getString("info", Locale.ENGLISH);

	/** 不明 英語（文字列）。 */
	public static final String STRING_EN_UNKNOWN = Messages.getString("unknown", Locale.ENGLISH);

	/** なし（文字列）。 */
	public static final String STRING_NONE = "";

	/** 重要度のリスト（重要度の高いもの順） **/
	public static int[] PRIORITY_LIST = {
		TYPE_CRITICAL,
		TYPE_UNKNOWN,
		TYPE_WARNING,
		TYPE_INFO,
	};

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_CRITICAL) {
			return STRING_CRITICAL;
		} else if (type == TYPE_WARNING) {
			return STRING_WARNING;
		} else if (type == TYPE_INFO) {
			return STRING_INFO;
		} else if (type == TYPE_UNKNOWN) {
			return STRING_UNKNOWN;
		} else if (type == TYPE_NONE) {
			return STRING_NONE;
		}
		return "";
	}

	/**
	 * 種別から文字列（日本語）に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToStringJP(int type) {
		if (type == TYPE_CRITICAL) {
			return STRING_JP_CRITICAL;
		} else if (type == TYPE_WARNING) {
			return STRING_JP_WARNING;
		} else if (type == TYPE_INFO) {
			return STRING_JP_INFO;
		} else if (type == TYPE_UNKNOWN) {
			return STRING_JP_UNKNOWN;
		} else if (type == TYPE_NONE) {
			return STRING_NONE;
		}
		return "";
	}

	/**
	 * 種別から文字列（英語）に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToStringEN(int type) {
		if (type == TYPE_CRITICAL) {
			return STRING_EN_CRITICAL;
		} else if (type == TYPE_WARNING) {
			return STRING_EN_WARNING;
		} else if (type == TYPE_INFO) {
			return STRING_EN_INFO;
		} else if (type == TYPE_UNKNOWN) {
			return STRING_EN_UNKNOWN;
		} else if (type == TYPE_NONE) {
			return STRING_NONE;
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
		if (string.equals(STRING_CRITICAL)) {
			return TYPE_CRITICAL;
		} else if (string.equals(STRING_WARNING)) {
			return TYPE_WARNING;
		} else if (string.equals(STRING_INFO)) {
			return TYPE_INFO;
		} else if (string.equals(STRING_UNKNOWN)) {
			return TYPE_UNKNOWN;
		} else if (string.equals(STRING_NONE)) {
			return TYPE_NONE;
		}
		return -1;
	}
}