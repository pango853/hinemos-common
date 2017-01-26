package com.clustercontrol.port.bean;

import com.clustercontrol.util.Messages;

public class ProtocolConstant {

	public static final String TYPE_PROTOCOL_TCP = "001";
	public static final String TYPE_PROTOCOL_FTP = "002";
	public static final String TYPE_PROTOCOL_SMTP = "003";
	public static final String TYPE_PROTOCOL_SMTPS = "004";
	public static final String TYPE_PROTOCOL_POP3 = "005";
	public static final String TYPE_PROTOCOL_POP3S = "006";
	public static final String TYPE_PROTOCOL_IMAP = "007";
	public static final String TYPE_PROTOCOL_IMAPS = "008";
	public static final String TYPE_PROTOCOL_NTP = "009";
	public static final String TYPE_PROTOCOL_DNS = "010";

	public static final String STRING_PROTOCOL_TCP = Messages.getString("protocol.tcp");
	public static final String STRING_PROTOCOL_FTP = Messages.getString("protocol.ftp");
	public static final String STRING_PROTOCOL_SMTP = Messages.getString("protocol.smtp");
	public static final String STRING_PROTOCOL_SMTPS = Messages.getString("protocol.smtps");
	public static final String STRING_PROTOCOL_POP3 = Messages.getString("protocol.pop3");
	public static final String STRING_PROTOCOL_POP3S = Messages.getString("protocol.pop3s");
	public static final String STRING_PROTOCOL_IMAP = Messages.getString("protocol.imap");
	public static final String STRING_PROTOCOL_IMAPS = Messages.getString("protocol.imaps");
	public static final String STRING_PROTOCOL_NTP = Messages.getString("protocol.ntp");
	public static final String STRING_PROTOCOL_DNS = Messages.getString("protocol.dns");

	public static final int DEFAULT_PORT_NUM_PROTOCOL_TCP = 80;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_FTP = 21;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_SMTP = 25;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_SMTPS = 465;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_POP3 = 110;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_POP3S = 995;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_IMAP = 143;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_IMAPS = 993;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_NTP = 123;
	public static final int DEFAULT_PORT_NUM_PROTOCOL_DNS = 53;


	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type 種別
	 * @return 文字列
	 */
	public static String typeToString(String type) {
		if (type.equals(TYPE_PROTOCOL_TCP)) {
			return STRING_PROTOCOL_TCP;
		} else if (type.equals(TYPE_PROTOCOL_FTP)) {
			return STRING_PROTOCOL_FTP;
		} else if (type.equals(TYPE_PROTOCOL_SMTP)) {
			return STRING_PROTOCOL_SMTP;
		} else if (type.equals(TYPE_PROTOCOL_SMTPS)) {
			return STRING_PROTOCOL_SMTPS;
		} else if (type.equals(TYPE_PROTOCOL_POP3)) {
			return STRING_PROTOCOL_POP3;
		} else if (type.equals(TYPE_PROTOCOL_POP3S)) {
			return STRING_PROTOCOL_POP3S;
		} else if (type.equals(TYPE_PROTOCOL_IMAP)) {
			return STRING_PROTOCOL_IMAP;
		} else if (type.equals(TYPE_PROTOCOL_IMAPS)) {
			return STRING_PROTOCOL_IMAPS;
		} else if (type.equals(TYPE_PROTOCOL_NTP)) {
			return STRING_PROTOCOL_NTP;
		} else if (type.equals(TYPE_PROTOCOL_DNS)) {
			return STRING_PROTOCOL_DNS;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 * 
	 * @param string 文字列
	 * @return 種別
	 */
	public static String stringToType(String string) {
		if (string.equals(STRING_PROTOCOL_TCP)) {
			return TYPE_PROTOCOL_TCP;
		} else if (string.equals(STRING_PROTOCOL_FTP)) {
			return TYPE_PROTOCOL_FTP;
		} else if (string.equals(STRING_PROTOCOL_SMTP)) {
			return TYPE_PROTOCOL_SMTP;
		} else if (string.equals(STRING_PROTOCOL_SMTPS)) {
			return TYPE_PROTOCOL_SMTPS;
		} else if (string.equals(STRING_PROTOCOL_POP3)) {
			return TYPE_PROTOCOL_POP3;
		} else if (string.equals(STRING_PROTOCOL_POP3S)) {
			return TYPE_PROTOCOL_POP3S;
		} else if (string.equals(STRING_PROTOCOL_IMAP)) {
			return TYPE_PROTOCOL_IMAP;
		} else if (string.equals(STRING_PROTOCOL_IMAPS)) {
			return TYPE_PROTOCOL_IMAPS;
		} else if (string.equals(STRING_PROTOCOL_NTP)) {
			return TYPE_PROTOCOL_NTP;
		} else if (string.equals(STRING_PROTOCOL_DNS)) {
			return TYPE_PROTOCOL_DNS;
		}
		return "";
	}
}
