<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>ユーザー管理</title>
</head>
<body>
	<tiles:insert template="/WEB-INF/view/common/layout.jsp" flush="true">
	<script type="text/javascript" src="${f:url('/js/deleteConfirm.js') }"></script>
		<tiles:put name="title" value="ユーザー管理" />
		<tiles:put name="content" type="String">
				<s:form>
					<s:submit property="createUser" value="新規登録" />
				</s:form>
				<c:forEach var="user" items="${userList }" >
					<s:form>
						<table>
							<tr>
								<td>ユーザーID</td><td>名称</td><td></td><td></td>
							</tr>
							<tr>
								<td>${f:h(user.id) }</td><td>${f:h(user.storeName) }</td><td><html:submit property="updateUser" value="編集" /></td>
								<td><html:submit property="delete" value="削除" onclick="return deleteConfirm('${f:h(user.id) }')" /></td>
							</tr>
						</table>
						<html:hidden property="id" value="${user.id }"/>
					</s:form>
				</c:forEach>
		</tiles:put>
	</tiles:insert>
</body>
</html>