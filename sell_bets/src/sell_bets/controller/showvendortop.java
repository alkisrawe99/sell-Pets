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


import sell_bets.model.vendor;

/**
 * Servlet implementation class showvendortop
 */
@WebServlet("/showvendortop")
public class showvendortop extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showvendortop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<vendor> info = new ArrayList<vendor>();//		PrintWriter out = res.getWriter();
		vendor  s =new vendor();
int i=0;
		
		try {
			// set the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//make connection
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			// create a statement
			Statement stmt = dbConnect.createStatement();
			
			String query = "SELECT * FROM vendor";

		      // create the java statement
		      Statement st = dbConnect.createStatement();
		      
		      // execute the query, and get a java resultset
		      ResultSet rs = st.executeQuery(query);
		      
		      // iterate through the java resultset
		      while (rs.next()&&i<10)
		      {
		    	s=new vendor();
		        String name = rs.getString("name");
		        int mobile = rs.getInt("mobile");
		        String image = rs.getString("image");
		        int id=rs.getInt("id");
		        
		        s.name=name;
		        s.mobile=mobile;
		        s.id=id;
		        s.image=image;
		        
		        info.add(s);
		        request.setAttribute("data", info);
                   i++;
                   System.out.format(" %s, %s\n", name,mobile );
//   		        rs.ne
   		      }
   		      for(int index=0;index<info.size();index++) {
   		    	  System.out.print(info.get(index).name);}
   		      
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
