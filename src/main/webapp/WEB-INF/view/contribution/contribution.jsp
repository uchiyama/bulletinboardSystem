<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>新規投稿</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
		<tiles:put name="title" value="新規投稿" />
		<tiles:put name="content" type="String">
			<s:form>
				<html:errors/>
				<table>
					<tr><td>件名：</td><td><html:text property="subject" /></td></tr>
					<tr><td>本文：</td><td><html:textarea property="body" /></td></tr>
					<tr><td>公開日時：<br />例)2012-08-09 10:00</td><td><html:text property="openDate" /></td></tr>
					<tr><td colspan="2"><s:submit property="createContribution" value="投稿"/></td></tr>
				</table>
			</s:form>
		</tiles:put>
	</tiles:insert>
</body>
</html>