<jsp:include page="Header.jsp" />
<jsp:include page="header_user.jsp" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
if (session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
 <link rel="stylesheet" href="slidercss.css">
</head>
<body>
<table>
  <tr>
<div>
<form action="<%= request.getContextPath() %>/showvendortop" method="get">

<td><input type="submit" value="Show top 10 vendor          "></td>
</form>
</div>
<div>
<form action="<%= request.getContextPath() %>/showtopbets" method="get">

<td><input type="submit" value="Show top 10  pit       "></td>
</form>
</div>
</tr>
</table>



<h5> vendors  </h5>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="sell_bets.model.vendor"%>


<br>
	<table border="1">
        <tr>
            <th>Name</th>
            <th>mobile</th>
           <th>image</th>

        </tr>
				<% ArrayList vendors = (ArrayList)request.getAttribute("data"); %>
				<% if(vendors != null) {%>
                <%  for(int index=0;index<vendors.size();index++) { %>
            <tr>                     
                
                <td><%= ((vendor)(vendors.get(index))).name%></td>
                <td><%= ((vendor)(vendors.get(index))).mobile%></td>
                <td><img src="<%= ((vendor)(vendors.get(index))).image%>"width="50" height="60" ></td>

                

            </tr>
		        <% }
                }%>
    </table> 


</br>



<div align-content: center>
<h5> pits  </h5>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="sell_bets.model.pit"%>


<br>

	<table border="1">
        <tr>
            <th>Name</th>
            <th>type</th>
           <th>video</th>
      
             
        </tr>
				<% ArrayList pits = (ArrayList)request.getAttribute("data2"); %>
				<% if(pits != null) {%>
                <%  for(int index=0;index<pits.size();index++) { %>
            <tr>                     
                
                <td><%= ((pit)(pits.get(index))).name%></td>
                <td><%= ((pit)(pits.get(index))).type%></td>
                
				
         <td>   <video width="500" height="500" controls>
  <source src="<%= ((pit)(pits.get(index))).video%>" type="video/mp4">
  
</video></td>
                
                </form> </td> 

            </tr>
		        <% }
                }%>
    </table> 


</div>
</body>
</html>