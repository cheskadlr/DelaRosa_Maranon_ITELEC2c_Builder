package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import demo.db.utility.*;
import demo.model.BurgerBean;

import java.sql.*;

@WebServlet("/listorders.action")
public class ViewAllRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection = null;
	
	public void init() throws ServletException {
		connection = SingletonDBConnection
			.getConnection();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ResultSet records = (connection != null)
			? BurgerBean.getAllRecords(connection)
			: null;
		
		//perform binding on request
		request.setAttribute("dbRecord", records);
		
		request.getRequestDispatcher(
			(records != null)?"lisrecords.jsp"
			:"error.jsp").forward(request, response);
	}
}
