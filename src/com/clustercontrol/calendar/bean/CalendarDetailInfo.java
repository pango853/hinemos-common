/*

Copyright (C) since 2009 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
 useful, but WITHOUT ANY WARRANTY; without even the implied
 warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.calendar.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * カレンダ機能詳細のDTOです。
 */
@XmlType(namespace = "http://calendar.ws.clustercontrol.com")
public class CalendarDetailInfo implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5190264493495059976L;

	///////// 説明
	private String description = null;

	///////// 年
	private Integer year = new Integer(-1);

	///////// 月
	/** 月 （すべての月は「0」）*/
	private Integer month = new Integer(-1);

	///////// 日（定義）
	/**
	 * 0, 全ての日
	 * 1, 曜日
	 * 2, 日
	 * 3, その他
	 */
	private Integer dayType = new Integer(-1);

	/**
	 * 月の何番目の曜日か (第 x 曜日) xは1から5
	 * 全ての週の場合は、0
	 * */
	private Integer dayOfWeekInMonth = new Integer(-1);
	/**
	 * 曜日
	 * 1が日曜日
	 * */
	private Integer dayOfWeek = new Integer(-1);
	/** 日*/
	private Integer date = new Integer(-1);

	/** カレンダパターンID*/
	private String calPatternId = null;

	/** カレンダパターン*/
	private CalendarPatternInfo calPatternInfo = null;

	/** 曜日、日、その他 の日程から x日後
	 *  数値がマイナスの場合は、x日前
	 *  */
	private Integer afterday = new Integer(0);

	///////// 時間
	/** 開始時間*/
	private Long timeFrom = new Long(0l);
	/** 終了時間*/
	private Long timeTo = new Long(0l);

	/**稼動非稼動フラグ */
	private Boolean operateFlg;

	/* ----- getters、setters ----- */

	/**
	 * 
	 * @return
	 */
	public Integer getDayType() {
		return dayType;
	}
	/**
	 * 
	 * @param dayType
	 */
	public void setDayType(Integer dayType) {
		this.dayType = dayType;
	}

	/**
	 * 説明
	 * @return
	 */
	public String getDescription(){
		return description;
	}
	/**
	 * 説明
	 * @param description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 * 年
	 * @return
	 */
	public Integer getYear() {
		return year;
	}
	/**
	 * 年
	 * @param year
	 */
	public void setYear(Integer year) {
		this.year = year;
	}
	/**
	 * 月
	 * @return
	 */
	public Integer getMonth() {
		return month;
	}
	/**
	 * 月
	 * @param month
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * 月の何番目の曜日か (第 x 曜日)
	 * @return
	 */
	public Integer getDayOfWeekInMonth() {
		return dayOfWeekInMonth;
	}
	/**
	 * 月の何番目の曜日か (第 x 曜日)
	 * @param dayOfWeekInMonth
	 */
	public void setDayOfWeekInMonth(Integer dayOfWeekInMonth) {
		this.dayOfWeekInMonth = dayOfWeekInMonth;
	}
	/**
	 * 曜日
	 * @return
	 */
	public Integer getDayOfWeek() {
		return dayOfWeek;
	}
	/**
	 * 曜日
	 * @param dayOfWeek
	 */
	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	/**
	 * 日
	 * @return
	 */
	public Integer getDate() {
		return date;
	}
	/**
	 * 日
	 * @param date
	 */
	public void setDate(Integer date) {
		this.date = date;
	}
	/**
	 * カレンダパターンを返す<BR>
	 * @return
	 */
	public String getCalPatternId() {
		return calPatternId;
	}
	/**
	 * カレンダパターンIDを取得する<BR>
	 * @param calPatternId
	 */
	public void setCalPatternId(String calPatternId) {
		this.calPatternId = calPatternId;
	}
	/**
	 * カレンダパターンを返す<BR>
	 * @return
	 */
	public CalendarPatternInfo getCalPatternInfo() {
		return calPatternInfo;
	}
	/**
	 * カレンダパターンを取得する<BR>
	 * @param calPatternInfo
	 */
	public void setCalPatternInfo(CalendarPatternInfo calPatternInfo) {
		this.calPatternInfo = calPatternInfo;
	}
	//	public CalendarEtcInfo getEtcInfo() {
	//		return etcInfo;
	//	}
	//	public void setEtcInfo(CalendarEtcInfo etcInfo) {
	//		this.etcInfo = etcInfo;
	//	}
	/** 曜日、日、その他 の日程から x日後
	 *  数値がマイナスの場合は、x日前
	 *  @return
	 **/
	public Integer getAfterday() {
		return afterday;
	}
	/** 曜日、日、その他 の日程から x日後
	 *  数値がマイナスの場合は、x日前
	 *  @param afterday
	 **/
	public void setAfterday(Integer afterday) {
		this.afterday = afterday;
	}

	/**
	 * 開始時間
	 * @return
	 */
	public Long getTimeFrom() {
		return timeFrom;
	}
	/**
	 * 開始時間
	 * @param timeFrom
	 */
	public void setTimeFrom(Long timeFrom) {
		this.timeFrom = timeFrom;
	}
	/**
	 * 終了時間
	 * @return
	 */
	public Long getTimeTo() {
		return timeTo;
	}
	/**
	 * 終了時間
	 * @param timeTo
	 */
	public void setTimeTo(Long timeTo) {
		this.timeTo = timeTo;
	}
	/**
	 * 稼動非稼動フラグ
	 * @return
	 */
	public Boolean isOperateFlg() {
		return operateFlg;
	}
	/**
	 * 稼動非稼動フラグ
	 * @param operateFlg
	 */
	public void setOperateFlg(Boolean operateFlg) {
		this.operateFlg = operateFlg;
	}
	/**
	 * カレンダ詳細パラメータを表示します
	 */
	@Override
	public String toString() {
		return "CalendarDetailInfo ["
				+ "description=" + description
				+ ", year=" + year
				+ ", month=" + month
				+ ", dayType=" + dayType
				+ ", dayOfWeekInMonth=" + dayOfWeekInMonth
				+ ", dayOfWeek=" + dayOfWeek
				+ ", date=" + date
				+ ", calendarPatternId=" + calPatternId
				+ ", afterday=" + afterday
				+ ", timeFrom=" + new Date(timeFrom)
		+ ", timeTo=" + new Date(timeTo)
		+ ", operateFlg=" + operateFlg
		+ "]";
	}
	/**
	 * カレンダ詳細情報のコピー作成
	 */
	@Override
	public CalendarDetailInfo clone() {
		CalendarDetailInfo newInfo = new CalendarDetailInfo();
		newInfo.setDescription(this.description);
		newInfo.setYear(this.year);
		newInfo.setMonth(this.month);
		newInfo.setDayType(this.dayType);
		newInfo.setDayOfWeekInMonth(this.dayOfWeekInMonth);
		newInfo.setDayOfWeek(this.dayOfWeek);
		newInfo.setDate(this.date);
		newInfo.setCalPatternId(this.calPatternId);
		newInfo.setCalPatternInfo(this.calPatternInfo);
		newInfo.setAfterday(this.afterday);
		newInfo.setTimeFrom(this.timeFrom);
		newInfo.setTimeTo(this.timeTo);
		newInfo.setOperateFlg(this.operateFlg);

		return newInfo;
	}
}
