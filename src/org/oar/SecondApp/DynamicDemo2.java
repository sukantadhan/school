package org.oar.SecondApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DynamicDemo2 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String  eid=req.getParameter("yourid");
		int id=Integer.parseInt(eid);
		
		
		Connection conn=null;
		PreparedStatement ps=null;
		
		ResultSet rs=null;
		
		String name=null;
		
		
	
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott","scott","tiget");
			ps=conn.prepareStatement("select NAME from DATA where id=?");
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i>0) {
				System.out.println("succesfull");
				
			}else {
				
				System.out.println("unsuccessfull");
			}
			
			while(rs.next()) {
				
				name =rs.getString(1);
			
				
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		  PrintWriter out=resp.getWriter();
		  
		  
		  
		  out.println("<html><body bgcolor='red'>"+"<font size='15' color ='black'>"+"WelCome Mr."+name+"</font></body></html>");
	
		  
		  out.flush();
		  out.close();
		
		
		
	}

}
