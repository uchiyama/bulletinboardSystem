<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${f:url('/css/home.css') }" rel="stylesheet" type="text/css">
<title>Home</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
		<tiles:put name="title" value="Home" />
		<tiles:put name="content" type="String">
				<html:errors/>
				<c:forEach var="contribution" items="${contributionList }" >
					<s:form>
					<div class="border">
						<table>
							<tr>
								<td class="subject">${f:h(contribution.subject) }</td><td class="contribution">投稿者：${f:br(f:h(contribution.entryUser)) } 公開日時：${f:br(f:h(contribution.openDate)) }</td>
							</tr>
							<tr>
								<td colspan="2">${f:h(contribution.body) }</td>
							</tr>
						</table>

						<c:forEach var="comment" items="${contribution.commentList }" >
							<table>
								<tr>
									<td class="comment">${f:h(comment.entryUser) }さん ${f:h(comment.entryDate) }時間</td>
								</tr>
								<tr>
									<td>${f:h(comment.body) }</td>
								</tr>
							</table>
						</c:forEach>
						<table class="commentEntry">
						<tr>
							<td>コメント：<html:textarea property="body" value=""/></td>
						</tr>
						<tr>
							<td><s:submit property="createComment" value="コメント"/></td>
						</tr>
						</table>
						<html:hidden property="contributionId" value="${contribution.id }"/>
					</div>
					</s:form>
				</c:forEach>
		</tiles:put>
	</tiles:insert>

</body>
</html>