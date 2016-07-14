package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		session.setAttribute("sessionName", "sessionValue");
		out.println(session.getAttribute("sessionName"));
		out.println("<br>");
		out.println(session.getId());
		out.println("<br>");
		session.setMaxInactiveInterval(2);
		out.println(session.getMaxInactiveInterval());
		out.println("<br>");
		out.println(session.isNew());
		
		//session.invalidate();
		
		Cookie ck=new Cookie("cookieName","cookieValue");
		response.addCookie(ck);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=SecondServlet >");
		out.println("<input type=submit />");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
