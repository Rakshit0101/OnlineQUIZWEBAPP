<%--Document   : deleteinstruction--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="qwa.database.*" %>
    <%@page import="qwa.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Instructions</title>
</head>
<body>
<%
		Instructions i = new Instructions();
		i.setInstruction(request.getParameter("inst"));
		int status = Instruction_db.deleteRecord(i);
		if(status > 0)
			response.sendRedirect("InstructionList.jsp");
		else
			out.print("Error");
		
	%>
</body>
</html>