package sell_bets.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_vendor
 */
@WebServlet("/delete_vendor")
public class delete_vendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_vendor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user  = request.getParameter("id");
		try {
			// set the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//make connection
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			// create a statement
			Statement stmt = dbConnect.createStatement();
			
			String query = "delete FROM vendor where id = \'"+ user + "\'";

		      // create the java statement
		      Statement st = dbConnect.createStatement();
		      
		      // execute the query, and get a java resultset
		      st.executeUpdate(query);
		      
		      
		      
   		     
   		      
		      st.close();
		      dbConnect.close();
		      RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/admin.jsp");
				d.forward(request, response);
		      
		    }
		catch(SQLException | ClassNotFoundException e) 
		{
		e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
