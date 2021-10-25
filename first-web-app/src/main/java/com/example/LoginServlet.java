package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private UserValidationService service = new UserValidationService();
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException
	 {
//		 PrintWriter out = response.getWriter();
//		 out.println("<html>");
//		 out.println("<body>");
//		 out.println("Hello");
//		 out.println("</body>");
//		 out.println("</html>");
		 request.setAttribute("name", request.getParameter("name"));
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	 }
	 
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException
	 {
//		 PrintWriter out = response.getWriter();
//		 out.println("<html>");
//		 out.println("<body>");
//		 out.println("Hello");
//		 out.println("</body>");
//		 out.println("</html>");
		 String name = request.getParameter("name");
		 boolean isUserValid = service.validate(name);
		 if(isUserValid)
		 {
			 request.setAttribute("name", name);
			 request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		 }
		 else {
			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	 }
}
