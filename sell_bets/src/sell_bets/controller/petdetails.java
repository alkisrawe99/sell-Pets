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

/**
 * Servlet implementation class petdetails
 */
@WebServlet("/petdetails")
public class petdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public petdetails() {
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
		      while (rs.next())
		      {
		    	s=new pit();
		    	int id = rs.getInt("id");
		        String name = rs.getString("name");
		        String type = rs.getString("type");
		        
		        int age = rs.getInt("age");
		        int price = rs.getInt("price");
		        String seller_info = rs.getString("seller_info");
		        String image = rs.getString("image");
		        String video = rs.getString("video");
		        s.id=id;
		        s.name=name;
		        s.type=type;
		        s.age=age;
		        s.price=price;
		        s.sellar_info=seller_info;
		        s.image=image;
		        s.video=video;
		        
		        info.add(s);
		        request.setAttribute("data2", info);
                   i++;
                  
   		      }
   		     
   		      
		      st.close();
		      dbConnect.close();
		      RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/pit_details.jsp");
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
