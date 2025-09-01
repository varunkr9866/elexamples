package com.cluster;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String strSid = req.getParameter("sid");
		HashMap hmStudent = new HashMap();
		hmStudent.put("stuId",strSid);
		hmStudent.put("name","AAAA");
		hmStudent.put("phone","111111");
		hmStudent.put("city","Bangalore");
		
		HttpSession ses = req.getSession();
		ses.setAttribute("HMSTUDENT", hmStudent);
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req, res);
	}
}
