<%--Document : deletequestion--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="qwa.database.*" %>
    <%@page import="qwa.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Questions</title>
</head>
<body>
<%
		Questions q = new Questions();
		q.setQuestion(request.getParameter("ques"));
		int status = Question_db.deleteRecord(q);
		if(status > 0)
			response.sendRedirect("QuestionList.jsp");
		else
			out.print("Error");
		
	%>
</body>
</html>