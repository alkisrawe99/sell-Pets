<jsp:include page="admin.jsp" />


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="sell_bets.model.vendor"%>

<div>

 
</div>
<br>

	<table border="1">
        <tr>
         <th>id</th>
            <th>Name</th>
            <th>mobile</th>
           <th>image</th>
           
           <th> </th>
      
             
        </tr>
				<% ArrayList vendors = (ArrayList)request.getAttribute("data2"); %>
				<% if(vendors != null) {%>
                <%  for(int index=0;index<vendors.size();index++) { %>
            <tr>                     
                <td><%= ((vendor)(vendors.get(index))).id%></td>
                <td><%= ((vendor)(vendors.get(index))).name%></td>
                <td><%= ((vendor)(vendors.get(index))).mobile%></td>
                 <td><img src="<%= ((vendor)(vendors.get(index))).image%>"  width="50" height="60"></td>
               
               
                  <td><form action="<%= request.getContextPath() %>/delete_vendor">
                	<input type="hidden" name="id" value="<%= ((vendor)(vendors.get(index))).id%>"/>
                	<input type="submit" value="delete"/>
                </form> </td> 
				
         
                
                </form> </td> 

            </tr>
		        <% }
                }%>
    </table> 

  <form    action="<%= request.getContextPath() %>/admin">

<input type="submit" value="back">

</form>




</body>
</html>