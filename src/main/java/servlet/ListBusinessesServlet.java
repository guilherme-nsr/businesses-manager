package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Database;
import model.Business;

@WebServlet("/list-businesses")
public class ListBusinessesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListBusinessesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(LocalDateTime.now() + " debug: GET /list-businesses");
		
		List<Business> businesses = Database.getBusinesses();
		
		System.out.println(businesses);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>Businesses:</p>");
		out.println("<ul>");
		for (Business business : businesses) {
			out.println("<li>");
			out.println(business.getName());
			out.println("</li>");
		}
		out.println("</body>");
		out.println("</html>");
		out.println("</ul>");
	}

}
