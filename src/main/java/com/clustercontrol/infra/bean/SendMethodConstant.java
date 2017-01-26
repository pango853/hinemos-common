package com.clustercontrol.infra.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.clustercontrol.util.Messages;

public class SendMethodConstant {
	/** SCPで実行 */
	public static final int TYPE_SCP = 0;
	/** WinRMで実行 */
	public static final int TYPE_WINRM = 1;
	/** SCP */
	public static final String STRING_SCP = Messages.getString("infra.module.file.method.scp");
	/** WinRM */
	public static final String STRING_WINRM = Messages.getString("infra.module.file.method.winrm");
	/**
	 * 種別から文字列に変換します。<BR>
	 * 
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_SCP) {
			return STRING_SCP;
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
		if (string.equals(STRING_SCP)) {
			return TYPE_SCP;
		} else if (string.equals(STRING_WINRM)) {
			return TYPE_WINRM;
		}
		return -1;
	}
	
	public static int classToType(String className){
		if(className.equals("")){
			
		} else if (className.equals("")){
			
		}
		return -1;
	}
	
	public static List<String> getAllStrings(){
		List<String> strings = new ArrayList<String>();
		
		strings.add(STRING_SCP);
		strings.add(STRING_WINRM);
		
		return strings;
	}
	
	public static List<Integer> getTypeList() {
		return Arrays.asList(TYPE_SCP, TYPE_WINRM);
	}
}
