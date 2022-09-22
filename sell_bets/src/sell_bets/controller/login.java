package sell_bets.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
			d.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if(name.equals("admin") && password.equals("admin")) {
			HttpSession s = request.getSession();
			 s.setAttribute("status", "1");
			 s.setAttribute("username", "admin");
			 s.setAttribute("image", "C:\\Users\\User\\Desktop\\New folder (2)\\aa.jpg");
		      RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/admin.jsp");
				d.forward(request, response);
				System.out.println("hi admin");
	     }
		else {
		 
		String query = "SELECT * FROM user WHERE email ='"+ name + "' and password =\'"+ password + "\'  ";
		
		try {
			// set the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//make connection
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			// create a statement
			Statement stmt = dbConnect.createStatement();
		    // make a query	
			ResultSet result = stmt.executeQuery(query);
		    System.out.println(result);
		    while (result.next()) {	
	        	 String n = result.getString("email");
			     String p = result.getString("password");
			     String image =result.getString("image");
			     
			     
			      
			    	  HttpSession s = request.getSession();
						 s.setAttribute("status", "1");
						 s.setAttribute("username", n);
						 s.setAttribute("image", image);
						
						
			     
		
		    }
		    
		    stmt.close();
		      dbConnect.close();
		      RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/home.jsp");
				d.forward(request, response);

		  } 
		catch(SQLException | ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
		
		
		
		}
	}

}
