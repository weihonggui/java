<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>   
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>雇员列表</title>
<style type="text/css">
 table{
  border: 1px solid black ;
  border-collapse: collapse; 
 }
 table thead tr th{
  border: 1px solid black ;
  padding: 3px ;
  backgroud-color: #cccddd;
 }
 table tbody tr td{
  border: 1px solid black ;
  padding: 3px ;
 }
</style>
</head>
<body>
<center>
 <h2>
  <font color="blue">当前系统雇员列表</font>
 </h2>
 <s:form action="delete" theme="simple">
  <table cellspacing="1" width="80%">
   <thead>
    <tr>
     <th>Select</th>
     <th>Id</th>
     <th>Name</th>
     <th>Address</th>
     <th>Phone</th>
     <th>Operation</th>
    </tr>
   </thead>
   <tbody>
    <s:iterator value="employees">
     <tr>
      <td>
       <input type="checkbox" name="ids" value='<s:property value="id" />' />
      </td>
      <td>
       <a href='<s:url action="edit"><s:param  name="id" value="id" /></s:url>'><s:property value="id" /></a>
      </td>
      <td><s:property value="name" /></td>
      <td><s:property value="address" /></td>
      <td><s:property value="phone" /></td>
      <td>
       <a href='<s:url action="edit"><s:param name="id" value="id" /></s:url>'>Edit</a>&nbsp;
       <a href='<s:url action="delete"><s:param name="id" value="id" /></s:url>'>Delete</a>
      </td>
     </tr>
    </s:iterator>
   </tbody>
  </table>
  <s:submit value="Delete" />
  &nbsp;&nbsp;
  <a href="add.jsp">Add</a>
 </s:form>
</center> 
</body>
</html>
