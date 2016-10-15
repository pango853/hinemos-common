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
 * 処理の定義を定数として格納するクラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class ProcessConstant {
	/** 処理する（種別）。 */
	public static final int TYPE_YES = 1;

	/** 処理しない（種別）。 */
	public static final int TYPE_NO = 0;

	/** 処理する（文字列）。 */
	public static final String STRING_YES = Messages.getString("yes");

	/** 処理しない（文字列）。 */
	public static final String STRING_NO = Messages.getString("no");

	/**
	 * 種別から文字列に変換します。<BR>
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
	 * 文字列から種別に変換します。<BR>
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
}