<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー新規登録</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
		<tiles:put name="title" value="ユーザー管理" />
		<tiles:put name="content" type="String">
			<s:form>
				<html:errors/>
				<table>
					<tr>
						<td>ユーザーID：</td><td><html:text property="id" /></td>
					</tr>
					<tr>
						<td>パスワード：</td><td><html:password property="password" value=""/></td>
					</tr>
					<tr>
						<td>名称（支店名）：</td><td><html:text property="storeName" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:submit property="create" value="登録"/></td>
					</tr>
				</table>
			</s:form>
		</tiles:put>
	</tiles:insert>
</body>
</html>