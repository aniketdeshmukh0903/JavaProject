package org.studyeasy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page").toLowerCase();
		switch (page) {
		case "home": {
						request.getRequestDispatcher("index.jsp").forward(request, response);
						break;
		}
		case "listusers": {
						request.getRequestDispatcher("listusers.jsp").forward(request, response);
						break;
		}
		default:
						request.getRequestDispatcher("error.jsp").forward(request, response);
						break;
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
