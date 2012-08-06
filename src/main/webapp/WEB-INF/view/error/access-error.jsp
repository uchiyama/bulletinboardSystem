<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
		<tiles:put name="title" value="新規投稿" />
		<tiles:put name="content" type="String">
			<div id="accessError">アクセス権限がありません。</div>
		</tiles:put>
	</tiles:insert>
</body>
</html>