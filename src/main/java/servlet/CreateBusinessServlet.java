package servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Database;
import model.Business;

@WebServlet("/create-business")
public class CreateBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreateBusinessServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(LocalDateTime.now() + " debug: POST /create-business");
		
		String businessName = request.getParameter("name");
		
		Business business = new Business();
		business.setName(businessName);
		
		Database.addBusiness(business);
		
		RequestDispatcher rd = request.getRequestDispatcher("NewBusinessCreated.jsp");
		request.setAttribute("business", business);
		rd.forward(request, response);
	}

}
