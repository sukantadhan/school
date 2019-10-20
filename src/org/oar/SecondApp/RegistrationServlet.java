package org.oar.SecondApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oar.db.DBConnection;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Access Denied - Sending user to /registration");
		response.sendRedirect("registration");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		String rollno = request.getParameter("rollno");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("Roll No: "+rollno+", Name: "+name+", Email: "+email+", Username: "+username+", Password: "+password);
		
		Connection connection = DBConnection.getConnection();
		
		//validate username does  not exists.
	
		
		String insertQuery = "insert into STUDENTS values (?,?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setInt(1, Integer.parseInt(rollno));
			statement.setString(2, name);
			statement.setString(3, email);
			statement.setString(4, username);
			statement.setString(5, password);
			
			int executeUpdate = statement.executeUpdate();
			System.out.println("Successully Registered !");
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		response.sendRedirect("login");
		
	}

}
