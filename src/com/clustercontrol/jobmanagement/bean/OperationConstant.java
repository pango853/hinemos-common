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
 * ジョブの操作種別を定数として定義するクラス<BR>
 *
 * @version 2.1.0
 * @since 2.1.0
 */
public class OperationConstant {
	/** 開始[即時] */
	public static final int TYPE_START_AT_ONCE = 1;
	/** 開始[中断解除] */
	public static final int TYPE_START_SUSPEND = 3;
	/** 開始[スキップ解除] */
	public static final int TYPE_START_SKIP = 5;
	/** 開始[保留解除] */
	public static final int TYPE_START_WAIT = 7;

	/** 停止[コマンド] */
	public static final int TYPE_STOP_AT_ONCE = 0;
	/** 停止[中断] */
	public static final int TYPE_STOP_SUSPEND = 2;
	/** 停止[スキップ] */
	public static final int TYPE_STOP_SKIP = 4;
	/** 停止[保留] */
	public static final int TYPE_STOP_WAIT = 6;
	/** 停止[状態変更] */
	public static final int TYPE_STOP_MAINTENANCE = 8;
	/** 停止[状態指定] */
	public static final int TYPE_STOP_SET_END_VALUE = 10;
	/** 停止[強制] */
	public static final int TYPE_STOP_FORCE = 11;

	/** 開始[即時] */
	public static final String STRING_START_AT_ONCE = Messages.getString("job.start.at.once");
	/** 開始[中断解除] */
	public static final String STRING_START_SUSPEND = Messages.getString("job.start.release.suspend");
	/** 開始[スキップ解除] */
	public static final String STRING_START_SKIP = Messages.getString("job.start.release.skip");
	/** 開始[保留解除] */
	public static final String STRING_START_WAIT = Messages.getString("job.start.release.reserve");

	/** 停止[コマンド] */
	public static final String STRING_STOP_AT_ONCE = Messages.getString("job.stop.at.once");
	/** 停止[中断] */
	public static final String STRING_STOP_SUSPEND = Messages.getString("job.stop.suspend");
	/** 停止[スキップ] */
	public static final String STRING_STOP_SKIP = Messages.getString("job.stop.skip");
	/** 停止[保留] */
	public static final String STRING_STOP_WAIT = Messages.getString("job.stop.reserve");
	/** 停止[状態変更] */
	public static final String STRING_STOP_MAINTENANCE = Messages.getString("job.stop.maintenance");
	/** 停止[状態指定] */
	public static final String STRING_STOP_SET_END_VALUE = Messages.getString("job.stop.set.end.value");
	/** 停止[強制] */
	public static final String STRING_STOP_FORCE = Messages.getString("job.stop.force");

	/**
	 * 種別から文字列に変換する。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(int type){
		if(type == TYPE_START_AT_ONCE){
			return STRING_START_AT_ONCE;
		}
		else if(type == TYPE_START_SUSPEND){
			return STRING_START_SUSPEND;
		}
		else if(type == TYPE_START_SKIP){
			return STRING_START_SKIP;
		}
		else if(type == TYPE_START_WAIT){
			return STRING_START_WAIT;
		}
		else if(type == TYPE_STOP_AT_ONCE){
			return STRING_STOP_AT_ONCE;
		}
		else if(type == TYPE_STOP_SUSPEND){
			return STRING_STOP_SUSPEND;
		}
		else if(type == TYPE_STOP_SKIP){
			return STRING_STOP_SKIP;
		}
		else if(type == TYPE_STOP_WAIT){
			return STRING_STOP_WAIT;
		}
		else if(type == TYPE_STOP_MAINTENANCE){
			return STRING_STOP_MAINTENANCE;
		}
		else if(type == TYPE_STOP_SET_END_VALUE){
			return STRING_STOP_SET_END_VALUE;
		}
		else if(type == TYPE_STOP_FORCE){
			return STRING_STOP_FORCE;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換する。<BR>
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static int stringToType(String string){
		if(string.equals(STRING_START_AT_ONCE)){
			return TYPE_START_AT_ONCE;
		}
		else if(string.equals(STRING_START_SUSPEND)){
			return TYPE_START_SUSPEND;
		}
		else if(string.equals(STRING_START_SKIP)){
			return TYPE_START_SKIP;
		}
		else if(string.equals(STRING_START_WAIT)){
			return TYPE_START_WAIT;
		}
		else if(string.equals(STRING_STOP_AT_ONCE)){
			return TYPE_STOP_AT_ONCE;
		}
		else if(string.equals(STRING_STOP_SUSPEND)){
			return TYPE_STOP_SUSPEND;
		}
		else if(string.equals(STRING_STOP_SKIP)){
			return TYPE_STOP_SKIP;
		}
		else if(string.equals(STRING_STOP_WAIT)){
			return TYPE_STOP_WAIT;
		}
		else if(string.equals(STRING_STOP_MAINTENANCE)){
			return TYPE_STOP_MAINTENANCE;
		}
		else if(string.equals(STRING_STOP_SET_END_VALUE)){
			return TYPE_STOP_SET_END_VALUE;
		}
		else if(string.equals(STRING_STOP_FORCE)){
			return TYPE_STOP_FORCE;
		}
		return -1;
	}
}
