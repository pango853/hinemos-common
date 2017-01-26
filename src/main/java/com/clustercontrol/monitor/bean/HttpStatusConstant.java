/*

Copyright (C) 2014 NTT DATA Corporation

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
 * HTTP監視シナリオでページの判定が正常系か異常系かを示すための定数<BR>
 * 
 * @version 5.0.0
 * @since 5.0.0
 */
public class HttpStatusConstant {
	/** 正常(種別) */
	public static final int TYPE_NORMAL = 0;

	/** 異常(種別) */
	public static final int TYPE_ABNORMAL = 1;	
	
	/** 正常(文字列) */
	public static final String STRING_NORMAL = Messages.getString("normal");

	/** 異常(文字列) */
	public static final String STRING_ABNORMAL = Messages.getString("abnormal");

	/** 
	 * 種別を受け取り文字列を返します。
	 *  */
	public static String typeToString(int type){
		switch (type) {
		case TYPE_NORMAL:
			return STRING_NORMAL;
		case TYPE_ABNORMAL:
			return STRING_ABNORMAL;
		}
		return null;
	}

	/** 
	 * 文字列を受け取り種別を返します。
	 *  */
	public static int stringToType(String string){
		if(string.equals(STRING_NORMAL)){
			return TYPE_NORMAL;
		} else if (string.equals(STRING_ABNORMAL)) {
			return TYPE_ABNORMAL;
		}
		return -1;
	}
}