package com.dhan.sukanta.school.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dhan.sukanta.school.db.DBConnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "ProcessLoginServlet", urlPatterns = { "/ProcessLoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("login");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Login - Username: " + username + ", Password: " + password);
		
		Boolean autheticated = false;
		Connection connection = DBConnection.getConnection();
		String loginQuery = "select username,password from STUDENTS where username=? AND password=?";
		try {
			PreparedStatement statement = connection.prepareStatement(loginQuery);
			statement.setString(1, username);
			statement.setString(2, password);

			ResultSet resultSet = statement.executeQuery();
			int fetchSize = getCount(resultSet);
			System.out.println("Fetch Size: " + fetchSize);
			if (fetchSize == 1) {
				autheticated = true;
			} else {
				autheticated = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (autheticated) {
			Cookie cookie = new Cookie("logedIn", "True");
			Cookie usernameCookie = new Cookie("username", username);
			
			cookie.setMaxAge(24*60*60);
			usernameCookie.setMaxAge(24*60*60);
			
			cookie.setPath("/");
			usernameCookie.setPath("/");
			
			response.addCookie(cookie);
			response.addCookie(usernameCookie);
			response.sendRedirect("home");
		} else {
			response.sendRedirect("login");
		}
	}

	private int getCount(ResultSet resultSet) throws SQLException {
		int size = 0;

		while (resultSet.next()) {
			++size;
		}
		return size;
	}
}
