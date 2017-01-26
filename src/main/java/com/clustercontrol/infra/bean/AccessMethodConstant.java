package com.clustercontrol.infra.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.clustercontrol.util.Messages;

public class AccessMethodConstant {
	/** SSHで実行 */
	public static final int TYPE_SSH = 0;
	/** WinRMで実行 */
	public static final int TYPE_WINRM = 1;
	/** SSH */
	public static final String STRING_SSH = Messages.getString("infra.module.exec.method.ssh");
	/** WinRM */
	public static final String STRING_WINRM = Messages.getString("infra.module.exec.method.winrm");
	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_SSH) {
			return STRING_SSH;
		} else if (type == TYPE_WINRM) {
			return STRING_WINRM;
		}
		return "";
	}

	/**
	 * 文字列から種別に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static int stringToType(String string) {
		if (string.equals(STRING_SSH)) {
			return TYPE_SSH;
		} else if (string.equals(STRING_WINRM)) {
			return TYPE_WINRM;
		}
		return -1;
	}
	
	public static List<String> getAllStrings(){
		List<String> strings = new ArrayList<String>();
		
		strings.add(STRING_SSH);
		strings.add(STRING_WINRM);
		
		return strings;
	}
	
	public static List<Integer> getTypeList() {
		return Arrays.asList(TYPE_SSH, TYPE_WINRM);
	}
}
