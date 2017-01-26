/*

Copyright (C) 2012 NTT DATA Corporation

This program is free software; you can redistribute it and/or
Modify it under the terms of the GNU General Public License
as published by the Free Software Foundation, version 2.

This program is distributed in the hope that it will be
useful, but WITHOUT ANY WARRANTY; without even the implied
warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.  See the GNU General Public License for more details.

 */

package com.clustercontrol.calendar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.clustercontrol.calendar.bean.CalendarDetailInfo;
import com.clustercontrol.calendar.bean.CalendarInfo;
import com.clustercontrol.calendar.bean.CalendarPatternInfo;

public class CalendarUtil {
	private static Log m_log = LogFactory.getLog( CalendarUtil.class );

	private static final long TIMEZONE = TimeZone.getDefault().getRawOffset();
	private static final long HOUR24 = 24 * 60 * 60 * 1000;

	/**
	 * カレンダ詳細設定優先順序単体試験用
	 * @param info
	 * @param date
	 * @return
	 */
	public static Integer isRunOrder(CalendarInfo info, Date date) {
		// 有効期間外の場合はfalse
		if (date.getTime() < info.getValidTimeFrom() ||
				info.getValidTimeTo() < date.getTime()) {
			return -1;
		}
		//カレンダ詳細定義と一致するか
		m_log.trace("DetailInfo=" + info.getCalendarDetailList().size());
		int count = 1;
		for (CalendarDetailInfo detailInfo : info.getCalendarDetailList()) {
			if (isRunByDetailDateTime(detailInfo,date)) {
				m_log.trace("CalendarID=" + info.getId() + "isRun");
				return count;
			}
			count++;
		}
		return -1;
	}


	/**
	 * 単体テスト用
	 * @param info
	 * @param date
	 * @return
	 */
	public static Boolean isRun(CalendarInfo info, Date date) {
		if (info == null) {
			return true; // カレンダが設定されていない場合はtrue
		}
		m_log.trace("Valid_START_Time : " + new Date(info.getValidTimeFrom()));
		m_log.trace("Valid_END_Time : " + new Date(info.getValidTimeTo()));
		m_log.trace("This_Time : " + date);

		// 有効期間外の場合はfalse
		if (date.getTime() < info.getValidTimeFrom() ||
				info.getValidTimeTo() < date.getTime()) {
			return false;
		}
		//カレンダ詳細定義と一致するか
		m_log.trace("DetailInfo=" + info.getCalendarDetailList().size());
		for (CalendarDetailInfo detailInfo : info.getCalendarDetailList()) {
			if (isRunByDetailDateTime(detailInfo,date)) {
				m_log.trace("CalendarID=" + info.getId() + "isRun");
				return detailInfo.isOperateFlg();
			}
			m_log.trace("FALSE");
		}
		return false;
	}

	/**
	 * カレンダ詳細定義 - 年、月、日、時間、分、秒が現在の時間が等しいか調べる
	 * 
	 * detailInfoのtimeFrom,timeToには0-48時が入っている。
	 * @param detailInfo
	 * @param date
	 * @return
	 */
	public static boolean isRunByDetailDateTime(CalendarDetailInfo detailInfo, Date date) {
		for (CalendarDetailInfo detail : getDetail24(detailInfo)) {
			if (isRunByDetailDate(detail, date) && isRunByDetailTime(detail, date)) {
				m_log.trace("True : carry out " + detail.getDescription());
				return true;
			}
		}
		return false;
	}

	/**
	 * detailInfoのtimeFrom,timeToには0-24時が入っている。
	 * @param detailInfo
	 * @param date
	 * @return
	 */
	public static boolean isRunByDetailDate(CalendarDetailInfo detailInfo, Date date) {
		// from, toが0-24時間以内であることを確認する。
		long hour24 = 24*60*60*1000 - TIMEZONE;

		if (detailInfo.getTimeFrom() < (0 - TIMEZONE) || hour24 < (detailInfo.getTimeFrom())) {
			m_log.trace("detailInfo.getTimeFrom = " + detailInfo.getTimeFrom());
			return false;
		}
		if ((detailInfo.getTimeTo()) < (0 - TIMEZONE) || hour24 < (detailInfo.getTimeTo())) {
			m_log.trace("detailInfo.getTimeTo = " + (detailInfo.getTimeTo()) );
			return false;
		}

		//nullチェック
		if(detailInfo.getMonth() == null){
			m_log.warn("detailInfo.getMonth() is NULL");
			return false;
		}

		//カレンダ取得
		Calendar detailCal = Calendar.getInstance();
		//ｘ日後を考慮したカレンダ取得
		detailCal.setTime(new Date(date.getTime() - (long)detailInfo.getAfterday() * 24 * 3600 * 1000));
		//年
		int year = detailCal.get(Calendar.YEAR);
		//月
		int month = detailCal.get(Calendar.MONTH)+1;
		//週（第ｘ週）
		int weekXth = detailCal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		//曜日
		int weekday = detailCal.get(Calendar.DAY_OF_WEEK);
		//日
		int dateNo = detailCal.get(Calendar.DATE);

		/**
		 * 年
		 */
		//カレンダの年 と 現在の年が等しくない場合（0は毎年）
		if(detailInfo.getYear() != year && detailInfo.getYear() != 0){
			m_log.trace("Year is false : Schdule year =" + detailInfo.getYear()
					+ ", Current Year =" + year);
			return false;
		}
		m_log.trace("Year is TRUE : Schduler Year =" + detailInfo.getYear()
				+ ", Current Year =" + year);

		/**
		 * 月
		 */
		//カレンダの月 と 現在の月が等しくない場合（0は毎月）
		if(detailInfo.getMonth() != month && detailInfo.getMonth() != 0){
			m_log.trace("Month is False : Schduler Month =" + detailInfo.getMonth()
					+ ", Current Month =" + month);
			return false;
		}
		m_log.trace("Month is TRUE : Schduler Month =" + detailInfo.getMonth()
				+ ", Current Month =" + month);

		/**
		 * 日
		 */
		//nullチェック
		if(detailInfo.getDayType() == null){
			m_log.warn("detailInfo.getDayType() is NULL");
			return false;
		}
		//カレンダの週、曜日、日 と 現在の日が等しいか
		//すべての日
		if(detailInfo.getDayType() == 0){
			m_log.trace("DateALL is TRUE : Schduler dayType=" + detailInfo.getDayType()
					+ ", Current Date =" + dateNo);
			return true;
		}
		//曜日を指定した場合
		else if(detailInfo.getDayType() == 1){
			//nullチェック
			if(detailInfo.getDayOfWeekInMonth() == null ){
				m_log.trace("detailInfo.getDayOfWeekInMonth() is NULL");
				return false;
			}
			//nullチェック
			if(detailInfo.getDayOfWeek() == null ){
				m_log.warn("detailInfo.getDayOfWeek() is NULL");
				return false;
			}
			if(detailInfo.getDayOfWeekInMonth() == weekXth || detailInfo.getDayOfWeekInMonth() == 0){
				m_log.trace("WeekXth is TRUE : Schduler Xth =" + detailInfo.getDayOfWeekInMonth()
						+ ", Current weekXth =" + weekXth);
				if(detailInfo.getDayOfWeek() == weekday){
					m_log.trace("Weekday is TRUE : Schduler Weekday =" + detailInfo.getDayOfWeek()
							+ ", Current Weekday =" + weekday);
					return true;
				}
			}
		}
		//日 を指定した場合
		else if(detailInfo.getDayType() == 2){
			//nullチェック
			if(detailInfo.getDate() == null){
				m_log.trace("detailInfo.getDate() is NULL");
				return false;
			}
			if(detailInfo.getDate() == dateNo){
				m_log.trace("Date is TRUE : Schduler Date =" + detailInfo.getDate()  + ", Current Date =" + dateNo);
				return true;
			}
		}
		//カレンダパターンを指定した場合
		else if(detailInfo.getDayType() == 3){
			//nullチェック
			if(detailInfo.getCalPatternId() == null){
				m_log.trace("detailInfo.getCalPatternId() is NULL");
				return false;
			}
			m_log.trace("CalendarPatternID = " + detailInfo.getCalPatternId());
			CalendarPatternInfo calPatternInfo = null;
			calPatternInfo = detailInfo.getCalPatternInfo();
			if (calPatternInfo.isRun(year, month, dateNo)) {
				m_log.trace(year + "/" + month + "/" + dateNo);
				return true;
			}
		}
		return false;
	}

	/**
	 * カレンダ詳細定義 - 時間 と現在の時間が等しいか調べる
	 * 
	 * @param detailInfo
	 * @param date
	 * @return 等しいなら True
	 */
	public static boolean isRunByDetailTime(CalendarDetailInfo detailInfo, Date date) {
		//開始、終了 時間 (00:00:00 - 24:00:00)
		//nullチェック
		if(detailInfo.getTimeFrom() == null || detailInfo.getTimeTo() == null){
			m_log.warn("detailInfo.getTime is NULL");
			return false;
		}

		//現在の日にちの00:00:00取得
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String strNow = sdf.format(date);
		Date dateNow = null;
		try {
			dateNow = sdf.parse(strNow);
			/*
			 * カレンダ詳細より取得した、開始、終了時間は、1970/1/1 の日時で保持されている。
			 * そのため、詳細ダイアログにて設定した年月日の開始、終了時間になるよう変換する。
			 */
			long from = detailInfo.getTimeFrom() + TIMEZONE + dateNow.getTime();
			long to = detailInfo.getTimeTo() + TIMEZONE + dateNow.getTime();
			m_log.trace("this Time       " + date);
			m_log.trace("DetailTimeFrom  " + new Date(from));
			m_log.trace("DetailTimeTo    " + new Date(to));

			//現在の時刻取得（Long型）
			Long checkTime = date.getTime();

			//現時刻が設定した開始時間から終了時間内か
			if(from <= checkTime && checkTime < to){
				return true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 有効期間内だが、詳細定義の日程に含まれない場合
		return false;
	}

	/**
	 * CalendarDetailInfoの時刻を整理するメソッド
	 * 
	 * detailInfoのtimeFrom,timeToには0-48時が入っている。
	 * @param detailInfo
	 * @param date
	 * @return 引数のdetailInfoを24時で分割したdetailInfoのリスト
	 */
	public static ArrayList<CalendarDetailInfo> getDetail24(CalendarDetailInfo detailInfo) {
		ArrayList<CalendarDetailInfo> ret = new ArrayList<CalendarDetailInfo>();

		long from = detailInfo.getTimeFrom();
		long to = detailInfo.getTimeTo();
		if (HOUR24 - TIMEZONE <= from) {
			/*
			 * fromが24時間以上のとき。（必然的にtoも24時間以上となる。）
			 * 例
			 * info = 30:00-36:00 (当日)
			 * info1 = 06:00-12:00 (翌日)
			 */
			m_log.trace("24 < from & to");
			CalendarDetailInfo info1 = detailInfo.clone();
			info1.setAfterday(info1.getAfterday() + 1);
			info1.setTimeFrom(info1.getTimeFrom() - HOUR24);
			info1.setTimeTo(info1.getTimeTo() - HOUR24);
			ret.add(info1);
			/*
			 * fromが24時間以上のとき。（必然的にtoも24時間以上となる。）
			 * 例
			 * info = 30:00-36:00 (当日)
			 * info1 = 06:00-12:00 (翌日)
			 */
			if(HOUR24 - TIMEZONE <= info1.getTimeTo()){
				CalendarDetailInfo info2 = info1.clone();
				info2.setAfterday(info2.getAfterday() + 1);
				info2.setTimeFrom(0l - TIMEZONE);
				info2.setTimeTo(info2.getTimeTo() - HOUR24);
				ret.add(info2);
			}
		} else if (from < HOUR24 - TIMEZONE && HOUR24 - TIMEZONE < to) {
			/*
			 * fromが24時間以内、toが24時間超える
			 * 例
			 * info = 13:00-30:00 (当日)
			 * info1 = 13:00-23:59 (当日)
			 * info2 = 00:00-06:00 (翌日)
			 */
			m_log.trace("from < 24 < to");
			CalendarDetailInfo info1 = detailInfo.clone();
			CalendarDetailInfo info2 = detailInfo.clone();
			info1.setTimeTo(HOUR24 - TIMEZONE);
			ret.add(info1);

			info2.setAfterday(info2.getAfterday() + 1);
			info2.setTimeFrom(0l - TIMEZONE);
			info2.setTimeTo(info2.getTimeTo() - HOUR24);
			ret.add(info2);
		} else {
			// それ以外のとき。（from,toともに24時間以内。）
			m_log.trace("from & to < 24 ");
			ret.add(detailInfo);
		}
		return ret;
	}

}
