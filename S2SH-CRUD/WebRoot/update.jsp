<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>修改雇员信息</title>
</head>
<body>
 <center>
 <h3>
  <font color="blue">修改雇员信息</font>
 </h3>
 <s:form action="update" method="POST">
  <s:hidden name="employee.id" />
  <table>
   
   <tr><td><s:textfield name="employee.name" label="姓名" /></td></tr>
   <tr><td><s:textfield name="employee.address" label="地址" /></td></tr>
   <tr><td><s:textfield name="employee.phone" label="电话" /></td></tr>
   <tr>
    <td align="center" colspan="2">
     <s:submit value="提交" />
     <s:reset value="重置"/>
                </td>
            </tr>
  </table>
 
  </s:form>
 </center>
</body>
</html>