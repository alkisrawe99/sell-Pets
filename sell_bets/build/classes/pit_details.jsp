<jsp:include page="Header.jsp" />
<jsp:include page="header_user.jsp" />

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
<%@page import="sell_bets.model.pit"%>

<div>

 
</div>
<br>

	<table border="1">
        <tr>
         <th>id</th>
            <th>Name</th>
            <th>type</th>
           <th>age</th>
            <th>price</th>
           <th>sellar_info</th>
            <th>image</th>
           <th>video</th>
           <th> </th>
      
             
        </tr>
				<% ArrayList pits = (ArrayList)request.getAttribute("data2"); %>
				<% if(pits != null) {%>
                <%  for(int index=0;index<pits.size();index++) { %>
            <tr>                     
                <td><%= ((pit)(pits.get(index))).id%></td>
                <td><%= ((pit)(pits.get(index))).name%></td>
                <td><%= ((pit)(pits.get(index))).type%></td>
                 <td><%= ((pit)(pits.get(index))).age%></td>
                <td><%= ((pit)(pits.get(index))).price%></td>
                 <td><%= ((pit)(pits.get(index))).sellar_info%></td>
                  <td><img src="<%= ((pit)(pits.get(index))).image%>"width="50" height="60" ></td>
               <td> <video width="50" height="60" controls>
  <source src="<%= ((pit)(pits.get(index))).video%>" type="video/mp4">
  
  
</video></td>
               
                  
         
                
                </form> </td> 

            </tr>
		        <% }
                }%>
    </table> 

 




</body>
</html>