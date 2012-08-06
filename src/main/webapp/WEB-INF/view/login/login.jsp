<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${f:url('/css/login.css') }" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>

	<s:form>
		<html:errors/>
		<table>
			<tr>
				<td>ユーザーID：</td><td><html:text property="userId"></html:text></td>
			</tr>
			<tr>
				<td>パスワード：</td><td><html:password property="password"></html:password></td>
			</tr>
			<tr>
				<td colspan="2"><s:submit property="login">ログイン</s:submit></td>
			</tr>
		</table>
	</s:form>

</body>
</html>