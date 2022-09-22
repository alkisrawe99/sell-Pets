package sell_bets.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sell_bets.model.users;

/**
 * Servlet implementation class userregester
 */
@WebServlet("/register")
public class userregester extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userregester() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/register.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String image=(request.getParameter("image"));
		
		
		
		String insert_users="insert into user(name,email,password,image) values"+
				"(?,?,?,?)";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			Statement stmt = dbConnect.createStatement();
				 PreparedStatement preparedStmt = dbConnect.prepareStatement(insert_users);
				
				 preparedStmt.setString(1,name);
				 preparedStmt.setString(2,email);
				 preparedStmt.setString(3,password);
				 preparedStmt.setString(4,image);
				 preparedStmt.execute();
				  
				    dbConnect.close();
				    RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/login.jsp");
					d.forward(request, response);
		}
				catch(SQLException | ClassNotFoundException e) 
				{
				e.printStackTrace();
				}
		
		
	}

}
