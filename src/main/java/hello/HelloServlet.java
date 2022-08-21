package hello;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
/** Hello World!表示サーブレット **/
public class HelloServlet extends HttpServlet {
	
	
  public void doGet (HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    PrintWriter out;

    res.setContentType("text/html; charset=Shift_JIS");
    out = res.getWriter();

    out.println("<html><body>");
    out.println("<h1>Hello World!</h1>");
    out.println("<p>Servletのサンプル（HelloServlet.java）</p>");
    out.println("</body></html>");
  }
}
