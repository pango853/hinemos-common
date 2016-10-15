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

/**
 * 通知のタイプを定数として格納するクラスです。
 * 
 * @version 3.0.0
 * @since 3.0.0
 */
package com.clustercontrol.notify.bean;

import java.util.ArrayList;
import java.util.List;

public class NotifyTypeConstant {

	/*通知タイプとコード*/
	public static final int TYPE_STATUS = 0;
	public static final int TYPE_EVENT = 1;
	public static final int TYPE_MAIL = 2;
	public static final int TYPE_JOB = 3;
	public static final int TYPE_LOG_ESCALATE=4;
	public static final int TYPE_COMMAND=5;

	/** 通知ID種別 */
	public static final int NOTIFY_ID_TYPE_DEFAULT = 0;

	/**
	 * 通知タイプからその優先度を取得します。
	 * セルフチェック機能など、DBが使えない状態での通知を考慮し、
	 * 障害耐久性の高い通知方法のプライオリティが高く設定されます。
	 * @param notifyType 通知タイプ
	 * @return 通知の優先度（値が小さいほうが優先度が高い）
	 */
	public static int getPriority(int notifyType){
		switch (notifyType) {
		case NotifyTypeConstant.TYPE_MAIL:
			return 1;
		case NotifyTypeConstant.TYPE_LOG_ESCALATE:
			return 2;
		case NotifyTypeConstant.TYPE_COMMAND:
			return 3;
		case NotifyTypeConstant.TYPE_EVENT:
			return 4;
		case NotifyTypeConstant.TYPE_STATUS:
			return 5;
		case NotifyTypeConstant.TYPE_JOB:
			return 6;
		default:
			return 100;
		}
	}

	public static List<Integer> getList() {
		List<Integer> types = new ArrayList<Integer>();

		types.add(TYPE_STATUS);
		types.add(TYPE_EVENT);
		types.add(TYPE_MAIL);
		types.add(TYPE_JOB);
		types.add(TYPE_LOG_ESCALATE);
		types.add(TYPE_COMMAND);

		return types;
	}

}
