<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>��Ա��½</title>
</head>
<body>

 <s:form action="login">
  <table>
   <tr>
    <td><s:textfield name="name" label="����" /></td>
   </tr>
   <tr>
    <td><s:textfield name="phone" label="�绰" /></td>
   </tr> 
   <tr>
    <td align="center" colspan="2">
     <s:submit value="��½" />
     <s:reset value="����"/>
    </td>
   </tr>  
  </table>
 </s:form>

</body>
</html>
