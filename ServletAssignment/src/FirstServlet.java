
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("username");
		String pass = request.getParameter("userpass");
		
		HttpSession session = request.getSession();
		session.setAttribute("USERNAME",name);
		 Cookie cookie=new Cookie("name",name);  
         response.addCookie(cookie);  
		if (LoginDao.validate(name, pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		} else {
			out.print("Sorry username or password error");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}

		out.close();
	}
}