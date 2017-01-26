package com.clustercontrol.repository.bean;

import com.clustercontrol.util.Messages;

public class FacilityConstant {

	/** ----------------------- */
	/** ----- ファシリティ関連 ----- */
	/** ----------------------- */

	/** マネージャ名 */
	public static final String MANAGER_NAME =  "facilityManager";
	/** ファシリティID */
	public static final String FACILITY_ID = "facilityId";
	/** ファシリティ名 */
	public static final String FACILITY_NAME = "facilityName";
	/** ファシリティタイプ */
	public static final String FACILITY_TYPE = "facilityType";
	/** 説明 */
	public static final String DESCRIPTION = "description";
	/** オーナーロールID */
	public static final String OWNER_ROLE_ID = "ownerRoleId";
	/** 表示順 */
	public static final String DISPLAY_SORT_ORDER = "displaySortOrder";
	/** アイコンイメージ */
	public static final String ICONIMAGE= "iconImage";
	/** 管理対象(有効/無効) */
	public static final String VALID = "valid";
	/** 自動デバイスサーチ */
	public static final String AUTO_DEVICE_SEARCH = "autoDeviceSearch";

	/** 作成者 */
	public static final String CREATOR_NAME = "creatorName";
	/** 作成日時 */
	public static final String CREATE_TIME = "createTimestamp";
	/** 最終更新者 */
	public static final String MODIFIER_NAME = "ModifierName";
	/** 最終更新日時 */
	public static final String MODIFY_TIME = "ModifyTime";

	// TODO convert enum
	/** コンポジット（ファシリティの種別） */
	public static final int TYPE_COMPOSITE = 2;

	/** スコープ（ファシリティの種別） */
	public static final int TYPE_SCOPE = 0;

	/** ノード（ファシリティの種別） */
	public static final int TYPE_NODE = 1;

	/** マネージャ（ファシリティの種別） */
	public static final int TYPE_MANAGER = 3;

	/** invalidノード（ファシリティの種別） */
	public static final int TYPE_NODE_INVALID = 3;

	/** 参照不可ノード（ファシリティツリー作成時設定） */
	public static final int TYPE_SCOPE_INVALID = 99;

	/** コンポジット（ファシリティの種別の文字列表現） */
	public static final String TYPE_COMPOSITE_STRING = "comp";

	/** スコープ（ファシリティの種別の文字列表現） */
	public static final String TYPE_SCOPE_STRING = "scope";

	/** ノード（ファシリティの種別の文字列表現） */
	public static final String TYPE_NODE_STRING = "node";

	/** コンポジット（ファシリティの種別） */
	public static final String STRING_COMPOSITE = "";

	/** スコープ（ファシリティの種別） */
	public static final String STRING_SCOPE = Messages.getString("scope");

	/** ノード（ファシリティの種別） */
	public static final String STRING_NODE = Messages.getString("node");

	/**
	 * 種別から文字列に変換します。<BR>
	 *
	 * @param type
	 * @return
	 */
	public static String typeToString(int type) {
		if (type == TYPE_COMPOSITE) {
			return STRING_COMPOSITE;
		} else if (type == TYPE_SCOPE) {
			return STRING_SCOPE;
		} else if (type == TYPE_NODE) {
			return STRING_NODE;
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
		if (string.equals(STRING_COMPOSITE)) {
			return TYPE_COMPOSITE;
		} else if (string.equals(STRING_SCOPE)) {
			return TYPE_SCOPE;
		} else if (string.equals(STRING_NODE)) {
			return TYPE_NODE;
		}
		return -1;
	}

}
