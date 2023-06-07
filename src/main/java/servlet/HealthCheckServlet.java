package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/health-check")
public class HealthCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public HealthCheckServlet() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(LocalDateTime.now() + " debug: GET /health-check");
		
		PrintWriter out = resp.getWriter();
		out.println("<b>health check</b>");
		out.println("<br>");
		out.println("ok");
	}

}
