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

import java.util.ArrayList;

import com.clustercontrol.util.Messages;

/**
 * 実行状態の定数クラス<BR>
 * 
 * @version 1.0.0
 * @since 1.0.0
 */
public class StatusConstant {
	/** 待機(状態の種別) */
	public static final int TYPE_WAIT = 0;

	/** 保留中(状態の種別) */
	public static final int TYPE_RESERVING = 1;

	/** スキップ(状態の種別) */
	public static final int TYPE_SKIP = 2;

	/** 実行中(状態の種別) */
	public static final int TYPE_RUNNING = 100;

	/** 停止処理中(状態の種別) */
	public static final int TYPE_STOPPING = 101;

	/** 中断(状態の種別) */
	public static final int TYPE_SUSPEND = 200;

	/** コマンド停止(状態の種別) */
	public static final int TYPE_STOP = 201;

	/** 終了(状態の種別) */
	public static final int TYPE_END = 300;

	/** 変更済(状態の種別) */
	public static final int TYPE_MODIFIED = 301;

	/** 終了(条件未達成) (状態の種別) */
	public static final int TYPE_END_UNMATCH = 302;

	/** 終了(カレンダ) (状態の種別) */
	public static final int TYPE_END_CALENDAR = 303;

	/** 終了(スキップ) (状態の種別) */
	public static final int TYPE_END_SKIP = 304;

	/** 終了(開始遅延) (状態の種別) */
	public static final int TYPE_END_START_DELAY = 305;

	/** 終了(終了遅延) (状態の種別) */
	public static final int TYPE_END_END_DELAY = 306;

	/** 起動失敗(状態の種別) */
	public static final int TYPE_ERROR = 400;

	/** 待機(状態の種別) */
	public static final String STRING_WAIT = Messages.getString("wait");

	/** 保留中(状態の種別) */
	public static final String STRING_RESERVING = Messages.getString("reserving");

	/** スキップ(状態の種別) */
	public static final String STRING_SKIP = Messages.getString("skip");

	/** 実行中(状態の種別) */
	public static final String STRING_RUNNING = Messages.getString("running");

	/** 停止処理中(状態の種別) */
	public static final String STRING_STOPPING = Messages.getString("stopping");

	/** 中断(状態の種別) */
	public static final String STRING_SUSPEND = Messages.getString("suspend");

	/** コマンド停止(状態の種別) */
	public static final String STRING_STOP = Messages.getString("stop.at.once");

	/** 終了(状態の種別) */
	public static final String STRING_END = Messages.getString("end");

	/** 変更済(状態の種別) */
	public static final String STRING_MODIFIED = Messages.getString("modified");

	/** 終了(条件未達成) (状態の種別) */
	public static final String STRING_END_UNMATCH = Messages.getString("end.unmatch");

	/** 終了(カレンダ) (状態の種別) */
	public static final String STRING_END_CALENDAR = Messages.getString("end.calendar");

	/** 終了(スキップ) (状態の種別) */
	public static final String STRING_END_SKIP = Messages.getString("end.skip");

	/** 終了(開始遅延) (状態の種別) */
	public static final String STRING_END_START_DELAY = Messages.getString("end.start.delay");

	/** 終了(終了遅延) (状態の種別) */
	public static final String STRING_END_END_DELAY = Messages.getString("end.end.delay");

	/** 起動失敗(状態の種別) */
	public static final String STRING_ERROR = Messages.getString("start.error");

	/**
	 * 種別から文字列に変換する
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_RUNNING) {
			return STRING_RUNNING;
		} else if (type == TYPE_END) {
			return STRING_END;
		} else if (type == TYPE_WAIT) {
			return STRING_WAIT;
		} else if (type == TYPE_STOPPING) {
			return STRING_STOPPING;
		} else if (type == TYPE_STOP) {
			return STRING_STOP;
		} else if (type == TYPE_RESERVING) {
			return STRING_RESERVING;
		} else if (type == TYPE_MODIFIED) {
			return STRING_MODIFIED;
		} else if (type == TYPE_END_CALENDAR) {
			return STRING_END_CALENDAR;
		} else if (type == TYPE_END_UNMATCH) {
			return STRING_END_UNMATCH;
		} else if (type == TYPE_END_SKIP) {
			return STRING_END_SKIP;
		} else if (type == TYPE_END_START_DELAY) {
			return STRING_END_START_DELAY;
		} else if (type == TYPE_END_END_DELAY) {
			return STRING_END_END_DELAY;
		} else if (type == TYPE_ERROR) {
			return STRING_ERROR;
		} else if (type == TYPE_SKIP) {
			return STRING_SKIP;
		} else if (type == TYPE_SUSPEND) {
			return STRING_SUSPEND;
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
		if (string.equals(STRING_RUNNING)) {
			return TYPE_RUNNING;
		} else if (string.equals(STRING_END)) {
			return TYPE_END;
		} else if (string.equals(STRING_WAIT)) {
			return TYPE_WAIT;
		} else if (string.equals(STRING_STOPPING)) {
			return TYPE_STOPPING;
		} else if (string.equals(STRING_STOP)) {
			return TYPE_STOP;
		} else if (string.equals(STRING_RESERVING)) {
			return TYPE_RESERVING;
		} else if (string.equals(STRING_MODIFIED)) {
			return TYPE_MODIFIED;
		} else if (string.equals(STRING_END_UNMATCH)) {
			return TYPE_END_UNMATCH;
		} else if (string.equals(STRING_END_CALENDAR)) {
			return TYPE_END_CALENDAR;
		} else if (string.equals(STRING_END_SKIP)) {
			return TYPE_END_SKIP;
		} else if (string.equals(STRING_END_START_DELAY)) {
			return TYPE_END_SKIP;
		} else if (string.equals(STRING_END_END_DELAY)) {
			return TYPE_END_SKIP;
		} else if (string.equals(STRING_ERROR)) {
			return TYPE_ERROR;
		} else if (string.equals(STRING_SKIP)) {
			return TYPE_SKIP;
		} else if (string.equals(STRING_SUSPEND)) {
			return TYPE_SUSPEND;
		}
		return -1;
	}

	/**
	 * TYPE_END(300), TYPE_MODIFY(301),
	 * TYPE_END_UNMATCH(302), TYPE_END_CALENDAR(303), TYPE_END_SKIP(304),
	 * TYPE_END_START_DELAY(305), TYPE_END_END_DELAY(306)
	 * の場合はtrueを返す。
	 * @param type
	 * @return
	 */
	public static boolean isEndGroup(int type) {
		return (type / 100 == TYPE_END / 100);
	}

	public static ArrayList<Integer> getEndList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(TYPE_END);
		list.add(TYPE_MODIFIED);
		list.add(TYPE_END_UNMATCH);
		list.add(TYPE_END_CALENDAR);
		list.add(TYPE_END_SKIP);
		list.add(TYPE_END_START_DELAY);
		list.add(TYPE_END_END_DELAY);
		return list;
	}
}