<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body bgcolor=cyan text=grey>
<h1>
<% mvc.ResultBean rb=(mvc.ResultBean)request.getAttribute("res"); %>
Hall TicketNumber :<%= rb.getHno() %> <br>
Name :<%= rb.getName() %><br>
C marks :<%= rb.getC() %> <br>
C++ marks :<%= rb.getCpp() %> <br>
Java marks :<%= rb.getJava() %>
</h1>
</body>
</html>