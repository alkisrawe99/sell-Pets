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
 * Servlet implementation class add_pets
 */
@WebServlet("/add_pets")
public class add_pets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add_pets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/add_pit.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String age=request.getParameter("age");
		String image=(request.getParameter("image"));
		String price=request.getParameter("price");
		String seller=(request.getParameter("seller"));
		String video=(request.getParameter("video"));
		
		String insert_users="insert into pit(name,type,age,price,seller_info,image,video) values"+
				"(?,?,?,?,?,?,?)";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbConnect = DriverManager.getConnection("jdbc:mysql://localhost:3306/pl","root","");
			Statement stmt = dbConnect.createStatement();
				 PreparedStatement preparedStmt = dbConnect.prepareStatement(insert_users);
				
				 preparedStmt.setString(1,name);
				 preparedStmt.setString(2,type);
				 preparedStmt.setString(3,age);
				 preparedStmt.setString(4,price);
				 preparedStmt.setString(5,seller);
				 preparedStmt.setString(6,image);
				 preparedStmt.setString(7,video);
				 preparedStmt.execute();
				  
				    dbConnect.close();
				    RequestDispatcher d=request.getRequestDispatcher("/WEB-INF/view/add_pit.jsp");
					d.forward(request, response);
		}
				catch(SQLException | ClassNotFoundException e) 
				{
				e.printStackTrace();
				}
		
		
	}

}