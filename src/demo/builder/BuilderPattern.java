package demo.builder;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuilderPattern
 */
@WebServlet("/orderitem.html")
public class BuilderPattern extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuilderPattern() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bType = request.getParameter("pickBurger");
		String bSize = request.getParameter("pickBurgerSize");
		String fFlavor = request.getParameter("pickFroyoFlavor");
		String fSize = request.getParameter("pickFroyoSize");
		
		OrderBuilder builder = new OrderBuilder();

		OrderedItems order = builder.prepareOrder(bType, bSize, fFlavor, fSize);
		order.showItems();
		order.getCost();
		
	}

}
