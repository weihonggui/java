<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>雇员登陆</title>
</head>
<body>

 <s:form action="login">
  <table>
   <tr>
    <td><s:textfield name="name" label="姓名" /></td>
   </tr>
   <tr>
    <td><s:textfield name="phone" label="电话" /></td>
   </tr> 
   <tr>
    <td align="center" colspan="2">
     <s:submit value="登陆" />
     <s:reset value="重置"/>
    </td>
   </tr>  
  </table>
 </s:form>

</body>
</html>
