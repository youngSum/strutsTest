<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="struts"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'modify.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form id="from1" name="form1"  method="post" action="InfoCtrlAction!complete" onsubmit="return userCheck()">
            <table width="400" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon">学号：</span>
                            <input name="info.id" id="id" type="text" class="form-control"   style="height:30px;width:250px" readonly="true" value=${info.id} >
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon">姓名：</span>
                            <input name="info.name" id="name" type="text" class="form-control"   style="height:30px;width:250px" value=${info.name} >
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon">性别：</span>
                            <input name="info.sex" id="sex" type="text" class="form-control"   style="height:30px;width:250px" value=${info.sex} >
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon">年龄：</span>
                            <input name="info.age" id="age" type="text" class="form-control"   style="height:30px;width:250px" value=${info.age} >
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td>
                        <div class="input-group">
                            <span class="input-group-addon">电话：</span>
                            <input name="info.telephone" id="telephone" type="text" class="form-control"   style="height:30px;width:250px" value=${info.telephone} >
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                </tr>
                <tr>
                    <td align="center"> 
                        <input type="submit" class="btn btn-primary" value="修改" />
                    </td>
                </tr>
            </table>
        </form>
        
        <script type="text/javascript">
	  	function userCheck()
	  	{
	  		if(document.getElementById("name").value==="")
	  		{
	  			alert("请输入名字！");
	  			return false;
	  		}
	  		return true;
	  	}
	  </script>
  </body>
</html>
