package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cluster.to.AddressTO;
import com.cluster.to.StudentTO;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class HelloServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String strSid = req.getParameter("sid");
		int intId = Integer.parseInt(strSid);

		AddressTO ato = new AddressTO();
		ato.setArea("Rajajinagar");
		ato.setCity("Bangalore");
		ato.setCountry("India");
		
		StudentTO sto = new StudentTO();
		sto.setStudentId(intId);
		sto.setName("AAAA");
		sto.setPhone("1111111");
		sto.setAddress(ato);
		
		HttpSession ses = req.getSession();
		ses.setAttribute("STO", sto);
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req, res);
	}
}
