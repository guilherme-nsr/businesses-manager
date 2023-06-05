package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create-business")
public class CreateBusinessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CreateBusinessServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(LocalDateTime.now() + " debug: POST /create-business");
		
		String businessName = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.printf("create business <b>%s</b>", businessName);
		out.println("</body>");
		out.println("</html>");
	}

}
