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

package com.clustercontrol.maintenance;

import java.util.HashMap;

import com.clustercontrol.util.Messages;

/**
 * Hinemosプロパティ種別の定義を定数として格納するクラス<BR>
 * 
 * @version 5.0.0
 * @since 5.0.0
 */
public class HinemosPropertyTypeConstant {
	/** 文字列（種別）。 */
	public static final int TYPE_STRING = 1;
	
	/** 数値（種別）。 */
	public static final int TYPE_NUMERIC = 2;
	
	/** 真偽値（種別）。 */
	public static final int TYPE_TRUTH = 3;

	/** 文字列（文字列）。 */
	public static final String STRING_STRING = Messages.getString("string");
	
	/** 数値（文字列）。 */
	public static final String STRING_NUMERIC = Messages.getString("numeric");

	/** 真偽値（文字列）。 */
	public static final String STRING_TRUTH = Messages.getString("truth");
	
	/** 真偽値:true */
	public static final String BOOL_TRUE = "true";
	
	/** 真偽値:false */
	public static final String BOOL_FALSE = "false";
	
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
		}
		return -1;
	}
	
	/**
	 * 共通設定種別の一覧をMap形式で返します。
	 * @return 種別一覧
	 */
	public static HashMap<Integer, String> getList() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(TYPE_STRING, STRING_STRING);
		map.put(TYPE_NUMERIC, STRING_NUMERIC);
		map.put(TYPE_TRUTH, STRING_TRUTH);
		
		return map;
	}
}