package jp.co.bulletinboard.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import jp.co.bulletinboard.annotation.AuthCheck;
import jp.co.bulletinboard.dto.UserDto;
import jp.co.bulletinboard.entity.User;
import jp.co.bulletinboard.form.UserManageForm;
import jp.co.bulletinboard.service.UserService;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.directory.digest.Digest;
import org.seasar.directory.digest.DigestFactory;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class UserManageAction {

	/** JSP */
	private static final String USER_MANAGE_JSP = "user-manage.jsp";
	private static final String USER_CREATE_JSP = "user-create.jsp";
	private static final String USER_UPDATE_JSP = "user-update.jsp";

	/** ハッシュ形式 */
	private static final String HASH_SSHA = "SSHA";

	/** エラーメッセージ */
	private static final String UPDATE_USER_ID_ERROR = "errors.user.id";
	private static final String UPDATE_USER_PASSWORD_ERROR = "errors.user.password";
	private static final String UPDATE_USER_CONF_PASSWORD_ERROR = "errors.user.conf.password";

	/** チェックメソッド */
	private static final String CHECK_METHOD = "checkUser";
	private static final String PASSWORD_CHECK_METHOD = "checkPassword";

	/** Homeフォーム */
	@ActionForm
	@Resource
	protected UserManageForm userManageForm;

	/** 投稿サービス */
	@Resource
	protected UserService userService;

	/** ユーザー情報 */
	@Resource
	protected UserDto userDto;

	/**
	 * ユーザー管理画面初期表示
	 *
	 * @return USER_MANAGE_JSP ユーザー管理画面
	 */
	@Execute(validator = false)
	@AuthCheck
	public String index() {
		userManageForm.userList = userService.findAll();

        return USER_MANAGE_JSP;
	}

	/**
	 * ユーザー新規登録画面
	 *
	 * @return USER_CREATE_JSP ユーザー情報編集
	 */
	@Execute(validator = false)
	public String createUser() {

        return USER_CREATE_JSP;
	}

	/**
	 * ユーザー情報編集画面
	 *
	 * @return USER_UPDATE_JSP ユーザー情報編集
	 */
	@Execute(validator = false)
	public String updateUser() {
		User u = userService.findById(userManageForm.id);
		Beans.copy(u, userManageForm).execute();
        return USER_UPDATE_JSP;
	}

	/**
	 * ユーザー情報登録
	 *
	 * @return USER_UPDATE_JSP ユーザー情報編集
	 * @throws NoSuchAlgorithmException
	 */
	@Execute(validator = true, input=USER_CREATE_JSP)
	public String create() throws NoSuchAlgorithmException {
		User u = new User();
		Digest digest = DigestFactory.getDigest(HASH_SSHA);
		Beans.copy(userManageForm, u).execute();
		u.password = digest.create(userManageForm.password);
		userService.insert(u);

        return index();
	}

	/**
	 * ユーザー情報編集
	 *
	 * @return USER_UPDATE_JSP ユーザー情報編集
	 * @throws NoSuchAlgorithmException
	 */
	@Execute(validator = true, validate = CHECK_METHOD, input=USER_UPDATE_JSP)
	public String update() throws NoSuchAlgorithmException {
		User u = new User();
		Beans.copy(userManageForm, u).execute();
		u.id = userManageForm.newId;
		userService.userUpdate(u, userManageForm.id);

        return index();
	}

	/**
	 * ユーザー情報編集
	 *
	 * @return USER_UPDATE_JSP ユーザー情報編集
	 * @throws NoSuchAlgorithmException
	 */
	@Execute(validator = true, validate = PASSWORD_CHECK_METHOD, input=USER_UPDATE_JSP)
	public String passwordUpdate() throws NoSuchAlgorithmException {
		User u = new User();
		Digest digest = DigestFactory.getDigest(HASH_SSHA);
		Beans.copy(userManageForm, u).execute();
		u.password = digest.create(userManageForm.password);
		userService.update(u);

        return index();
	}


	/**
	 * ユーザー情報削除
	 *
	 * @return USER_UPDATE_JSP ユーザー情報編集
	 */
	@Execute(validator = false)
	public String delete() {
		User u = new User();
		Beans.copy(userManageForm, u).execute();
		userService.delete(u);

        return index();
	}

	/**
	 * ユーザーチェック
	 * @throws NoSuchAlgorithmException
	 */
	public ActionMessages  checkUser() throws NoSuchAlgorithmException {
		ActionMessages errors = new ActionMessages();
		User user = userService.findById(userManageForm.id);
		if (user == null) {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(UPDATE_USER_ID_ERROR));
		}

		return errors;
	}

	/**
	 * ユーザーチェック
	 * @throws NoSuchAlgorithmException
	 */
	public ActionMessages  checkPassword() throws NoSuchAlgorithmException {
		ActionMessages errors = new ActionMessages();
		User user = userService.findById(userManageForm.id);
		Digest digest = DigestFactory.getDigest(HASH_SSHA);
		if (user != null) {
			if (!digest.verify(user.password, userManageForm.oldPassword)) {
				errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(UPDATE_USER_PASSWORD_ERROR));
			}
			if (!userManageForm.confPassword.equals(userManageForm.password) ) {
				errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(UPDATE_USER_CONF_PASSWORD_ERROR));
			}

			if (errors.size() == 0) {
				return null;
			}
		} else {
			errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(UPDATE_USER_ID_ERROR));
		}

		return errors;
	}
}
