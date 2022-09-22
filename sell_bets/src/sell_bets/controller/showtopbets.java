package sell_bets.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sell_bets.model.pit;
import sell_bets.model.vendor;

/**
 * Servlet implementation class showtopbets
 */
@WebServlet("/showtopbets")
public class showtopbets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showtopbets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<pit> info = new ArrayList<pit>();//		PrintWriter out = res.getWriter();
		pit  s =new pit();
int i=0;
		
		try {
			// set the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//make connection
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			// create a statement
			Statement stmt = dbConnect.createStatement();
			
			String query = "SELECT * FROM pit";

		      // create the java statement
		      Statement st = dbConnect.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      
		      // iterate through the java resultset
		      while (rs.next()&&i<10)
		      {
		    	s=new pit();
		        String name = rs.getString("name");
		        String type = rs.getString("type");
		        String video = rs.getString("video");
		        
		        s.name=name;
		        s.type=type;
		        s.video=video;
		        
		        info.add(s);
		        request.setAttribute("data2", info);
                   i++;
                  
   		      }
   		     
   		      
		      st.close();
		      dbConnect.close();
		      RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/home.jsp");
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
