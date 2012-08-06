<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー情報編集</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
		<tiles:put name="title" value="ユーザー情報編集" />
		<tiles:put name="content" type="String">
			<s:form>
				<html:errors/>
				<table>
					<tr>
						<td colspan="2">ユーザー情報の変更</td>
					</tr>
					<tr>
						<td>ユーザーID：</td><td><html:text property="newId" value="${f:h(id) }"/></td>
					</tr>
					<tr>
						<td>名称（支店名）：</td><td><html:text property="storeName" /></td>
					</tr>
					<tr>
						<td colspan="2"><s:submit property="update" value="情報変更"/></td>
					</tr>

					<tr>
						<td colspan="2">パスワードの変更</td>
					</tr>
					<tr>
						<td>現在のパスワード：</td><td><html:password property="oldPassword" value=""/></td>
					</tr>
					<tr>
						<td>新しいパスワード：</td><td><html:password property="password" value=""/></td>
					</tr>
					<tr>
						<td>新しいパスワード（確認）：</td><td><html:password property="confPassword" value=""/></td>
					</tr>
					<tr>
						<td colspan="2"><s:submit property="passwordUpdate" value="パスワード変更"/></td>
					</tr>
				</table>
				<html:hidden property="id" value="${f:h(id) }"/>
			</s:form>
		</tiles:put>
	</tiles:insert>
</body>
</html>