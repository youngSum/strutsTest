<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="struts"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'success.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

		<style type="text/css">
table,td,tr {
	border: 1px solid blue;
	cellpadding: 0px;
	cellspacing: 0px;
	text-align: center;
	border-collapse: collapse;
	width: 600px;
	align: center;
}

div {
	position: relative;
	margin-left: -300px;
	padding-left:50%;
	width: 600px;
	text-align: center;
}
</style>

	</head>
	<body>
		<div>
			登录成功，欢迎你，
			<struts:property value="name" />
			<br />
			<br />
			<table border="2">
				<tr>
					<th>
						学号
					</th>
					<th>
						姓名
					</th>
					<th>
						性别
					</th>
					<th>
						年龄
					</th>
					<th>
						电话
					</th>
					<th>
						操作
					</th>
				</tr>
				<s:iterator value="list" var="temp">
					<tr>
						<td>
							${temp.id}
						</td>
						<td>
							${temp.name}
						</td>
						<td>
							${temp.sex}
						</td>
						<td>
							${temp.age}
						</td>
						<td>
							${temp.telephone}
						</td>
						<td>
							<a href="InfoCtrlAction!modify?id=${temp.id}">修改</a>
							<a href="InfoCtrlAction!delete?id=${temp.id}"
								onclick="return confirm('确定删除该学生信息吗？')">删除</a>
						</td>
					</tr>
				</s:iterator>
			</table>
			<br/>
			<input type="button"
				onclick="window.location.href('InfoCtrlAction!add')" value="添加" />
		</div>
	</body>
</html>
