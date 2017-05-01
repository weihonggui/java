<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加雇员</title>
    
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
	<center>
  <h3>新增雇员</h3>
 
  <s:form action="add">
   <table>
    <tr>
     <td>
      <s:textfield name="employee.name" label="姓名"/>
     </td>
    </tr>
    <tr>
     <td>
      <s:textfield name="employee.address" label="地址"/>
     </td>
    </tr>
    <tr>
     <td>
      <s:textfield name="employee.phone" label="电话"/>
     </td>
    </tr>
    <tr>
     <td align="center" colspan="2">
      <input type="submit" value="提交"/>
      <input type="reset" value="重置"/>
     </td> 
    </tr>
   </table>
  </s:form>
 </center>
  </body>
</html>
