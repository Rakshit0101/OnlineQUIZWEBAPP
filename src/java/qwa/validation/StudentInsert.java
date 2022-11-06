/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwa.validation;

/**
 *
 * @author rakshit
 */


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import qwa.database.Students;
import qwa.model.Student_db;

/**
 * implementation class StudentInsert
 */
@WebServlet("/qwa.validation.StudentInsert")
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String name = request.getParameter("name");
		
		Students st = new Students();
		st.setName(name);
		st.setPassword(password);
		st.setUsername(username);
		
		boolean status = Student_db.insertStudent(st);
		if(status)
		{
			String msg1 = "Student Added";
	    	response.sendRedirect("AddStudent.jsp?msg1="+msg1);
		}
		else
		{
			String msg2 = "Student not Added";
	    	response.sendRedirect("AddStudent.jsp?msg2="+msg2);
		}
		
	}

}
