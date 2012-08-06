package jp.co.bulletinboard.form;

import java.util.List;

import jp.co.bulletinboard.entity.Contribution;

import org.seasar.struts.annotation.Required;

public class HomeForm {

	public List<Contribution> contributionList;

	public int contributionId;

	@Required
	public String body;
}
