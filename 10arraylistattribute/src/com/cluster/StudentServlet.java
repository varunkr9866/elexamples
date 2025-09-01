package com.cluster;

import java.io.IOException;
import java.util.ArrayList;

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
public class StudentServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ArrayList listNames = new ArrayList();
		listNames.add("RAVI");
		listNames.add("KUMAR");
		listNames.add("AMOGH");
		listNames.add("VINAY");
		listNames.add("RAJESH");
		HttpSession ses = req.getSession();
		ses.setAttribute("LISTNAMES", listNames);
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req, res);
	}
}
