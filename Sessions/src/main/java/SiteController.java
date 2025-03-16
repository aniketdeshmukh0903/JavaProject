package org.studyeasy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SiteController() {
        super();
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(username.equals("chaand") && password.equals("123456")) {
			request.getSession().invalidate();
			HttpSession newSession= request.getSession();
		
			newSession.setMaxInactiveInterval(500);
		    response.sendRedirect("member.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
