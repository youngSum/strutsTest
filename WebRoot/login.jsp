<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>login</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- css -->
	<style type="text/css">
		div {
			position: relative;
			margin-left:auto;
			margin-right:auto;
			width:200px;
			text-align: center;
		}
		.lform {
			width:200px;
		}
		</style>

	</head>
	<body>
		<div>
			<s:form action="LoginAction" method="post">
				<s:label value="登录" cssClass="lform"></s:label>
				<s:textfield name="name" cssClass="lform"></s:textfield>
				<s:password name="password" cssClass="lform"></s:password>
				<s:submit value="登录"></s:submit>
			</s:form>
		</div>

	</body>

</html>
