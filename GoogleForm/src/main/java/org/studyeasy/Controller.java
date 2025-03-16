package org.studyeasy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Controller() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("name") + "<br/>");
		response.getWriter().println(request.getParameter("gender") + "<br/>");


		PrintWriter out = response.getWriter();
		String[] languages = request.getParameterValues("language");
		if (languages != null) {
			for (int i = 0; i < languages.length; i++) {

				out.print(languages[i]);
				out.print("<br/>");
			}
		} else {
			out.print("None Selected <br/>");
		}

		response.getWriter().println(request.getParameter("country") + "<br/>");
	}

}
