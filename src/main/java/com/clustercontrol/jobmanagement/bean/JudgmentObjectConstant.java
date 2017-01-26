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

package com.clustercontrol.jobmanagement.bean;

import com.clustercontrol.util.Messages;

/**
 * ジョブ終了状態の定数クラス<BR>
 * 
 * @version 2.1.0
 * @since 1.0.0
 */
public class JudgmentObjectConstant {
	/** ジョブ終了状態 */
	public static final int TYPE_JOB_END_STATUS = 0;

	/** ジョブ終了値 */
	public static final int TYPE_JOB_END_VALUE = 1;

	/** 時刻 */
	public static final int TYPE_TIME = 2;

	/** セッション開始時の時間（分）  */
	public static final int TYPE_START_MINUTE = 3;

	/** ジョブ終了状態 */
	public static final String STRING_JOB_END_STATUS = Messages.getString("job") + "(" + Messages.getString("end.status") + ")";

	/** ジョブ終了値 */
	public static final String STRING_JOB_END_VALUE = Messages.getString("job") + "(" + Messages.getString("end.value") + ")";

	/** 時刻 */
	public static final String STRING_TIME = Messages
			.getString("wait.rule.time");

	/** セッション開始時の時間（分） */
	public static final String STRING_START_MINUTE = Messages.getString("time.after.session.start");

	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_JOB_END_STATUS) {
			return STRING_JOB_END_STATUS;
		}
		else if (type == TYPE_JOB_END_VALUE) {
			return STRING_JOB_END_VALUE;
		}
		else if (type == TYPE_TIME) {
			return STRING_TIME;
		}
		else if (type == TYPE_START_MINUTE) {
			return STRING_START_MINUTE;
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
		if (string.equals(STRING_JOB_END_STATUS)) {
			return TYPE_JOB_END_STATUS;
		}
		else if (string.equals(STRING_JOB_END_VALUE)) {
			return TYPE_JOB_END_VALUE;
		}
		else if (string.equals(STRING_TIME)) {
			return TYPE_TIME;
		}
		else if (string.equals(STRING_START_MINUTE)) {
			return TYPE_START_MINUTE;
		}
		return -1;
	}
}