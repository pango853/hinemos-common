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

package com.clustercontrol.monitor.bean;

import com.clustercontrol.util.Messages;

/**
 * ステータス情報の存続期間の定義を定数として格納するクラスです。
 * 
 * @version 2.0.0
 * @since 2.0.0
 */
public class StatusValidPeriodConstant {

	/** 無期限（種別）。 */
	public static final int TYPE_UNLIMITED = -1;

	/** 10分（種別）。 */
	public static final int TYPE_MIN_10 = 10;

	/** 20分（種別）。 */
	public static final int TYPE_MIN_20 = 20;

	/** 30分（種別）。 */
	public static final int TYPE_MIN_30 = 30;

	/** 1時間（種別）。 */
	public static final int TYPE_HOUR_1 = 60;

	/** 3時間（種別）。 */
	public static final int TYPE_HOUR_3 = 180;

	/** 6時間（種別）。 */
	public static final int TYPE_HOUR_6 = 360;

	/** 12時間（種別）。 */
	public static final int TYPE_HOUR_12 = 720;

	/** 1日（種別）。 */
	public static final int TYPE_DAY_1 = 1440;


	/** 無期限（文字列）。 */
	public static final String STRING_UNLIMITED = Messages.getString("unlimited");

	/** 10分（文字列）。 */
	public static final String STRING_MIN_10 = TYPE_MIN_10 + Messages.getString("minute");

	/** 20分（文字列）。 */
	public static final String STRING_MIN_20 = TYPE_MIN_20 + Messages.getString("minute");

	/** 30分（文字列）。 */
	public static final String STRING_MIN_30 = TYPE_MIN_30 + Messages.getString("minute");

	/** 1時間（文字列）。 */
	public static final String STRING_HOUR_1 = TYPE_HOUR_1/60 + Messages.getString("time.period");

	/** 3時間（文字列）。 */
	public static final String STRING_HOUR_3 = TYPE_HOUR_3/60 + Messages.getString("time.period");

	/** 6時間（文字列）。 */
	public static final String STRING_HOUR_6 = TYPE_HOUR_6/60 + Messages.getString("time.period");

	/** 12時間（文字列）。 */
	public static final String STRING_HOUR_12 = TYPE_HOUR_12/60 + Messages.getString("time.period");

	/** 1日（文字列）。 */
	public static final String STRING_DAY_1 = TYPE_DAY_1/60/24 + Messages.getString("monthday");


	/**
	 * 種別から文字列に変換します。
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type) {
		if (type == TYPE_UNLIMITED) {
			return STRING_UNLIMITED;
		} else if (type == TYPE_MIN_10) {
			return STRING_MIN_10;
		} else if (type == TYPE_MIN_20) {
			return STRING_MIN_20;
		} else if (type == TYPE_MIN_30) {
			return STRING_MIN_30;
		} else if (type == TYPE_HOUR_1) {
			return STRING_HOUR_1;
		} else if (type == TYPE_HOUR_3) {
			return STRING_HOUR_3;
		} else if (type == TYPE_HOUR_6) {
			return STRING_HOUR_6;
		} else if (type == TYPE_HOUR_12) {
			return STRING_HOUR_12;
		} else if (type == TYPE_DAY_1) {
			return STRING_DAY_1;
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
		if (string.equals(STRING_UNLIMITED)) {
			return TYPE_UNLIMITED;
		} else if (string.equals(STRING_MIN_10)) {
			return TYPE_MIN_10;
		} else if (string.equals(STRING_MIN_20)) {
			return TYPE_MIN_20;
		} else if (string.equals(STRING_MIN_30)) {
			return TYPE_MIN_30;
		} else if (string.equals(STRING_HOUR_1)) {
			return TYPE_HOUR_1;
		} else if (string.equals(STRING_HOUR_3)) {
			return TYPE_HOUR_3;
		} else if (string.equals(STRING_HOUR_6)) {
			return TYPE_HOUR_6;
		} else if (string.equals(STRING_HOUR_12)) {
			return TYPE_HOUR_12;
		} else if (string.equals(STRING_DAY_1)) {
			return TYPE_DAY_1;
		}
		return -1;
	}
}