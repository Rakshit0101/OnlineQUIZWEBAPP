<%--Document : updateinstructionnow--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                <%@page import="qwa.model.Instruction_db"%>
<%@page import="qwa.database.Instructions"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Updating Instrctions</title>
</head>
<body>
body>
<%
		String instoriginal = request.getParameter("instoriginal");
        String instmodified = request.getParameter("instmodified");
     
		int status = Instruction_db.doUpdateNowRecord(instoriginal,instmodified);
		if(status > 0)
		{
			response.sendRedirect("InstructionList.jsp");
		}
		else if(status == -1)
		{
			out.print("error from databse");
			
		}
		else
		{
			out.print("excepion occured");
		}
		
	%>
</body>
</html>