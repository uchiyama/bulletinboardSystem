package jp.co.bulletinboard.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class LoginForm {

	@Required
	@Minlength(minlength=6)
	@Mask(mask="[0-9a-zA-Z]")
	public String userId;

	@Required
	@Minlength(minlength=6)
	public String password;

}
