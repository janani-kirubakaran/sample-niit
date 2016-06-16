package login;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginmodel.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uid=(String) request.getParameter("userid");
		String pass=(String) request.getParameter("password");
		UserDAO user=new UserDAO();
		PrintWriter out=response.getWriter();
		if(user.isValid(uid,pass)==true)
		{
			out.print("hello"+uid+"welcome");
          RequestDispatcher dispatcher=request.getRequestDispatcher("homej.jsp");
          
          dispatcher.forward(request, response);
		}
		else
		{
			out.print("INVALID CREDENAILS");
			 RequestDispatcher dispatcher=request.getRequestDispatcher("login.html");
	          
	          dispatcher.include(request, response);

		}
		
		//doGet(request, response);
	}

}
