<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link href="${f:url('/css/layout.css') }" rel="stylesheet" type="text/css">
</head>
<body>
<table width="100%">
  <tr><td colspan="2" id="header"><tiles:insert page="header.jsp" /></td></tr>
  <tr>
    <td width="20%" id="menu"><tiles:insert page="menu.jsp" /></td>
    <td><tiles:insert attribute="content" /></td>
  </tr>
</table>
</body>
</html>