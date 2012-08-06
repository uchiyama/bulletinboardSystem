package jp.co.bulletinboard.action;





import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import jp.co.bulletinboard.dto.UserDto;
import jp.co.bulletinboard.entity.Contribution;
import jp.co.bulletinboard.form.ContributionForm;
import jp.co.bulletinboard.service.ContributionService;

import org.seasar.framework.util.TimestampConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class ContributionAction {

	/** JPS */
	private static final String CONTRIBUTION_JSP = "contribution.jsp";
	private static final String HOME_JSP = "/home";

	/** 日付パターン */
	private static final String DATE_PATTERN = "yyyy-mm-dd hh:mm";

	/** 投稿アクションフォーム */
	@ActionForm
	@Resource
	protected ContributionForm contributionForm;

	/** 投稿サービス */
	@Resource
	protected ContributionService contributionService;

	/** ユーザー情報 */
	@Resource
	protected UserDto userDto;

	/**
	 * 投稿画面初期表示
	 *
	 * @return CONTRIBUTION_JSP 投稿画面
	 */
	@Execute(validator = false)
	public String index() {
        return CONTRIBUTION_JSP;
	}

	/**
	 * 投稿登録
	 *
	 * @return LOGIN_JSP ログイン画面
	 */
	@Execute(validator = true, input=CONTRIBUTION_JSP)
	public String createContribution() {
		Contribution contribution = new Contribution();
		Timestamp timestamp = TimestampConversionUtil.toTimestamp(new Date());

		contribution.subject = contributionForm.subject;
		contribution.body = contributionForm.body;
		contribution.entryDate = timestamp;
		contribution.entryUser = userDto.id;
		contribution.openDate = contributionForm.openDate.equals("")
								? timestamp
								: TimestampConversionUtil.toTimestamp(contributionForm.openDate, DATE_PATTERN);
		contributionService.insert(contribution);
        return HOME_JSP;
	}
}
