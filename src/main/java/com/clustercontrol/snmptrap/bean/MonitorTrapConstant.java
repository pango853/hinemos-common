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

package com.clustercontrol.snmptrap.bean;

/**
 * SNMP Trapで利用する定数のクラス<BR>
 *
 * @version 4.0.0
 * @since 4.0.0
 */
public class MonitorTrapConstant {
	/** コミュニティチェック無効 */
	public final static int COMMUNITY_CHECK_OFF = 0;
	/** コミュニティチェック有効 */
	public final static int COMMUNITY_CHECK_ON = 1;

	/** 文字コード変換無効 */
	public final static int CHARSET_CONVERT_OFF = 0;
	/** 文字コード変換有効 */
	public final static int CHARSET_CONVERT_ON = 1;
	
	/** 変数に関わらず通知する */
	public final static int PROC_VARBIND_ANY = 0;
	/** 変数で判定する */
	public final static int PROC_VARBIND_SPECIFIED = 1;
}
