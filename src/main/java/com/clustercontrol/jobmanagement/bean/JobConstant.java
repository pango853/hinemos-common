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
 * ジョブ種別（ユニット、ネット、ジョブ）の定数クラス<BR>
 *
 * @version 4.1.0
 * @since 1.0.0
 */
public class JobConstant {
	/** ツリーのトップ */
	public static final int TYPE_COMPOSITE = -1;

	/** ジョブユニット(ジョブの種別) */
	public static final int TYPE_JOBUNIT = 0;

	/** ジョブネット(ジョブの種別) */
	public static final int TYPE_JOBNET = 1;

	/** ジョブ(ジョブの種別) */
	public static final int TYPE_JOB = 2;

	/** ファイル転送ジョブ(ジョブの種別) */
	public static final int TYPE_FILEJOB = 3;

	/** unreferable jobunit (ジョブの種別) */
	public static final int TYPE_JOBUNIT_UNREFERABLE = 4;

	/** 参照ジョブ(ジョブの種別) */
	public static final int TYPE_REFERJOB = 5;

	/** マネージャ(ジョブの種別) */
	public static final int TYPE_MANAGER = 6;

	/** ツリーのトップ */
	public static final String STRING_COMPOSITE = "";

	/** ジョブユニット(ジョブの種別) */
	public static final String STRING_JOBUNIT = Messages.getString("jobunit");

	/** ジョブネット(ジョブの種別) */
	public static final String STRING_JOBNET = Messages.getString("jobnet");

	/** ジョブ(ジョブの種別) */
	public static final String STRING_JOB = Messages.getString("command.job");

	/** ファイル転送ジョブ(ジョブの種別) */
	public static final String STRING_FILEJOB = Messages.getString("forward.file.job");

	/** 参照ジョブ(ジョブの種別) */
	public static final String STRING_REFERJOB = Messages.getString("refer.job");

	/**
	 * 種別から文字列に変換する
	 *
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_COMPOSITE) {
			return STRING_COMPOSITE;
		} else if (type == TYPE_JOBUNIT) {
			return STRING_JOBUNIT;
		} else if (type == TYPE_JOBNET) {
			return STRING_JOBNET;
		} else if (type == TYPE_JOB) {
			return STRING_JOB;
		} else if (type == TYPE_FILEJOB) {
			return STRING_FILEJOB;
		} else if (type == TYPE_REFERJOB) {
			return STRING_REFERJOB;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換する
	 *
	 * @param type
	 * @return
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_COMPOSITE)) {
			return TYPE_COMPOSITE;
		} else if (string.equals(STRING_JOBUNIT)) {
			return TYPE_JOBUNIT;
		} else if (string.equals(STRING_JOBNET)) {
			return TYPE_JOBNET;
		} else if (string.equals(STRING_JOB)) {
			return TYPE_JOB;
		} else if (string.equals(STRING_FILEJOB)) {
			return TYPE_FILEJOB;
		} else if (string.equals(STRING_REFERJOB)) {
			return TYPE_REFERJOB;
		}
		return -1;
	}
}