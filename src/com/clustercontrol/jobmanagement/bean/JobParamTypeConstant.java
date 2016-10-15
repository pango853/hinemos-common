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
 * ジョブパラメータの定数クラス<BR>
 *
 * @version 2.1.0
 * @since 2.1.0
 */
public class JobParamTypeConstant {
	/** システムパラメータ（ジョブ） */
	public static final int TYPE_SYSTEM_JOB = 0;

	/** システムパラメータ（ノード） */
	public static final int TYPE_SYSTEM_NODE = 1;

	/** ユーザパラメータ */
	public static final int TYPE_USER = 2;

	/** システムパラメータ（ジョブ） */
	public static final String STRING_SYSTEM_JOB = Messages.getString("system.job");

	/** ユーザパラメータ */
	public static final String STRING_USER = Messages.getString("user");

	/** システムパラメータ（ノード） */
	public static final String STRING_SYSTEM_NODE = Messages.getString("system.node");

	/**
	 * 種別から文字列に変換します。<BR>
	 *
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_SYSTEM_JOB) {
			return STRING_SYSTEM_JOB;
		} else if (type == TYPE_USER) {
			return STRING_USER;
		} else if (type == TYPE_SYSTEM_NODE) {
			return STRING_SYSTEM_NODE;
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
		if (string.equals(STRING_SYSTEM_JOB)) {
			return TYPE_SYSTEM_JOB;
		} else if (string.equals(STRING_USER)) {
			return TYPE_USER;
		} else if (string.equals(STRING_SYSTEM_NODE)) {
			return TYPE_SYSTEM_NODE;
		}
		return -1;
	}
}