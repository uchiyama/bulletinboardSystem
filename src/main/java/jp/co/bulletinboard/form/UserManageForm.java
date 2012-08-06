package jp.co.bulletinboard.form;

import java.util.List;

import jp.co.bulletinboard.entity.User;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class UserManageForm {

	private static final String USER_CREATE = "create";
	private static final String USER_INFO_UPDATE = "update";
	private static final String USER_PASSWORD_UPDATE = "passwordUpdate";

	/** ユーザーID */
	@Required(target=USER_CREATE)
	@Minlength(minlength=6)
	@Mask(mask="[0-9a-zA-Z]")
	public String id;

	/** ユーザーID */
	@Required(target=USER_INFO_UPDATE)
	@Minlength(minlength=6, target=USER_INFO_UPDATE)
	@Mask(mask="[0-9a-zA-Z]", target=USER_INFO_UPDATE)
	public String newId;

	/** パスワード */
	@Required(target=USER_CREATE + "," + USER_PASSWORD_UPDATE)
	@Minlength(minlength = 6, target=USER_CREATE + "," + USER_PASSWORD_UPDATE)
	public String password;

	/** パスワード */
	@Required(target = USER_PASSWORD_UPDATE)
	@Minlength(minlength = 6, target = USER_PASSWORD_UPDATE)
	public String oldPassword;

	/** パスワード */
	@Required(target = USER_PASSWORD_UPDATE)
	@Minlength(minlength = 6, target = USER_PASSWORD_UPDATE)
	public String confPassword;

	/** 店舗名 */
	@Required(target = USER_CREATE + "," + USER_INFO_UPDATE)
	public String storeName;

	/** ユーザーリスト */
	public List<User> userList;
}
