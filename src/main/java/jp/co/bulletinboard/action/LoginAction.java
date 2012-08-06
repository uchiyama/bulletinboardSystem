package jp.co.bulletinboard.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import jp.co.bulletinboard.dto.UserDto;
import jp.co.bulletinboard.entity.User;
import jp.co.bulletinboard.form.LoginForm;
import jp.co.bulletinboard.service.UserService;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.seasar.directory.digest.Digest;
import org.seasar.directory.digest.DigestFactory;
import org.seasar.framework.beans.util.Beans;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class LoginAction {

	/** JPS */
	private static final String LOGIN_JSP = "login.jsp";
	private static final String HOME_JSP = "/home";

	/** チェックメソッド */
	private static final String CHECK_METHOD = "checkUser";

	/** ハッシュ形式 */
	private static final String HASH_SSHA = "SSHA";

	/** エラーメッセージ */
	private static final String LOGIN_ERROR = "errors.login";

	/** ログインアクションフォーム */
	@ActionForm
	@Resource
	protected LoginForm loginForm;

	/** サービス */
	@Resource
	protected UserService userService;

	/** ユーザー情報 */
	@Resource
	protected UserDto userDto;


	/**
	 * ログイン画面初期表示
	 *
	 * @return LOGIN_JSP ログイン画面
	 */
	@Execute(validator = false)
	public String index() {
        return LOGIN_JSP;
	}

	/**
	 * ログイン処理
	 *
	 * @return HOME_JSP ホーム画面
	 */
	@Execute(validator = true, validate = CHECK_METHOD, input = LOGIN_JSP)
	public String login() {
        return HOME_JSP;
	}

	/**
	 * ユーザーチェック
	 * @throws NoSuchAlgorithmException
	 */
	public ActionMessages  checkUser() throws NoSuchAlgorithmException {
		ActionMessages errors = new ActionMessages();
		User user = userService.findById(loginForm.userId);
		Digest digest = DigestFactory.getDigest(HASH_SSHA);
		if (user != null && digest.verify(user.password, loginForm.password)) {
			Beans.copy(user, userDto).execute();
			return null;
		}

		errors.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage(LOGIN_ERROR));

		return errors;
	}

}
