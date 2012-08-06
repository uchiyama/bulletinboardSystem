package jp.co.bulletinboard.action;

import java.util.Date;

import javax.annotation.Resource;

import jp.co.bulletinboard.dto.UserDto;
import jp.co.bulletinboard.entity.Comment;
import jp.co.bulletinboard.form.HomeForm;
import jp.co.bulletinboard.service.CommentService;
import jp.co.bulletinboard.service.ContributionService;

import org.seasar.framework.util.TimestampConversionUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class HomeAction {

	/** JPS */
	private static final String INDEX_JSP = "index";
	private static final String HOME_JSP = "home.jsp";

	/** Homeフォーム */
	@ActionForm
	@Resource
	protected HomeForm homeForm;

	/** 投稿サービス */
	@Resource
	protected ContributionService contributionService;

	/** コメントサービス */
	@Resource
	protected CommentService commentService;

	/** ユーザー情報 */
	@Resource
	protected UserDto userDto;

	/**
	 * ホーム画面初期表示
	 *
	 * @return LOGIN_JSP ログイン画面
	 */
	@Execute(validator = false)
	public String index() {
		homeForm.contributionList = contributionService.findAllContributionAndComment();
        return HOME_JSP;
	}

	/**
	 * コメント投稿
	 *
	 * @return HOME_JSP ホーム画面
	 */
	@Execute(validator = true ,input = INDEX_JSP)
	public String createComment() {
		Comment comment = new Comment();
		comment.body = homeForm.body;
		comment.contributionId = homeForm.contributionId;
		comment.entryDate = TimestampConversionUtil.toTimestamp(new Date());
		comment.entryUser = userDto.id;
		commentService.insert(comment);

        return index();
	}
}
