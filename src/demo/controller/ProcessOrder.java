package demo.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.Bsize.*;
import demo.utility.burger.*;
import demo.model.BType.*;
import demo.model.Fsize.*;
import demo.model.FType.*;
import demo.utility.froyo.*;
import demo.db.utility.SingletonDBConnection;
import demo.model.BurgerBean;


/**
 * Servlet implementation class ProcessVehicleSelectionServlet
 */
@WebServlet("/processorder.html")
public class ProcessOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
Connection connection = null;
	
	public void init() throws ServletException {
		connection = SingletonDBConnection
			.getConnection();
		
		/*
		 here we will be creating test cases if the
		 singleton pattern we did is a correct 
		 implementation
		 
		 we will use the 4 properties of the equals() 
		 of the Object class - reflexive, symmetric,
		 transitive and consistent
		*/
		
		//here we will create x, y and z of type
		//Connection
		Connection x = SingletonDBConnection
			.getConnection();
		
		Connection y = SingletonDBConnection
			.getConnection();
		
		Connection z = SingletonDBConnection
			.getConnection();
		
		//doing the reflexive test
		if (x.equals(x)) {
			System.out.println("reflexive property: "
				+ "x is the same as x");
		} else {
			System.err.println("reflexive property: "
				+ "x is the NOT same as x");
		}
		
		//doing the symmetric test
		if (x.equals(y) && y.equals(x)) {
			System.out.println("symmetric property: "
				+ "x is the same as y and y is the " +
				"same as x");
		} else {
			System.err.println("symmetric property: "
				+ "x is NOT the same as y and y is the " +
				"NOT same as x");
		}
		
		//doing the transitive test
		if (x.equals(y) && y.equals(z) && x.equals(z)) {
			System.out.println("transitive property: "
				+ "x is the same as y, y is the as same" +
				" as z and x is the same as z.");
		} else {
			System.err.println("transitive property: "
				+ "x is NOT the same as y, y is NOT the as same" +
				" as z and x is NOT the same as z.");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String btype = request.getParameter("burgertype");
		String bsize = request.getParameter("burgersize");
		String ftype = request.getParameter("froyotype");
		String fsize = request.getParameter("froyosize"); 
		
		BurgerType burgerano = new BurgerTypeFactory().getBurger(btype.toUpperCase());

		BurgerSize burgerlaki = new BurgerSizeFactory().getSize(bsize);
		
		FroyoType froyoano = new FroyoTypeFactory().getFroyo(ftype.toUpperCase());
		
		FroyoSize froyolaki = new FroyoSizeFactory().getSize(fsize);
		
		BurgerBean buryo = new BurgerBean();
		
		buryo.setBurgertype(btype);
		buryo.setBurgersize(bsize);
		buryo.setFroyotype(ftype);
		buryo.setFroyosize(fsize);
		
		
		if (connection != null) {
			buryo.insert(connection);
		}
		
		//once the bean is populated, perform data binding
		request.setAttribute("buryo", buryo);

		burgerano.setSize(burgerlaki);
		froyoano.setSize(froyolaki);
	

		request.setAttribute("yummy1", burgerano);
		request.setAttribute("yummy2", froyoano);

		request.getRequestDispatcher("display.jsp").forward(request, response);

	}

}
