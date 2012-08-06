package jp.co.bulletinboard.form;



import org.seasar.struts.annotation.DateType;
import org.seasar.struts.annotation.Required;

public class ContributionForm {

	@Required
	public String subject;

	@Required
	public String body;

	@DateType(datePatternStrict="yyyy-mm-dd hh:mm")
	public String openDate;

}
