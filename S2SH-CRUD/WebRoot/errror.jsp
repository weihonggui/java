<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>����ҳ��</title>
</head>
<body>

 <h3>
  <font color="red">������ʾҳ��...</font>
 </h3>
 <br />
 <br />
 ϵͳ����5s�󷵻ص�¼����
 <%
  response.setHeader("Refresh", "5,URL=/ssh_demo4/login.jsp") ;
 %>
 <br />
 <br />
 <a href="/ssh_demo4/add.jsp">���</a>
</body>
</html>
