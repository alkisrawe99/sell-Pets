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

/**
 * Servlet implementation class update_vendor
 */
@WebServlet("/update_vendor")
public class update_vendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update_vendor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/update.jsp");
			d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user  = request.getParameter("id");

		String image=(request.getParameter("image"));
	
		
		String insert_users="UPDATE vendor set image=? where id = \'"+user+"\' ";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			Statement stmt = dbConnect.createStatement();
				 PreparedStatement preparedStmt = dbConnect.prepareStatement(insert_users);
				 
				 preparedStmt.setString(1,image);
			
				 preparedStmt.executeUpdate();
				  
				    dbConnect.close();
				    RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/admin.jsp");
					d.forward(request, response);
		}
				catch(SQLException | ClassNotFoundException e) 
				{
				e.printStackTrace();
				}
		
		
	}

}