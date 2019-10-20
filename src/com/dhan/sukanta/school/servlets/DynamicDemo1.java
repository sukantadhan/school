package org.oar.SecondApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DynamicDemo1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String eid = req.getParameter("id");

		int id = Integer.parseInt(eid);

		String name = req.getParameter("name");

		String place = req.getParameter("place");

		String emark = req.getParameter("mark");

		int mark = Integer.parseInt(emark);

		String branch = req.getParameter("branch");
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome");
		//requestDispatcher.forward(req, resp);
		
		resp.sendRedirect("/welcome");
	}

}
