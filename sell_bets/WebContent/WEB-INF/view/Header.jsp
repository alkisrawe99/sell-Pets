<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div  style="width:80%;display: inline-block;" >

<div  style="width:20%;display: inline-block;">
<form    action="<%= request.getContextPath() %>/logout">


<ul>
  <li>Welcome <%= session.getAttribute("username") %>  </li>
  <td><img src="<%= session.getAttribute("image") %>" width="50" height="60">
  
  <form  style="width:80%;display: inline-block;"   action="<%= request.getContextPath() %>/logout">
  
  <li><input type="submit" value="logout"></li>
  
</ul>

</hr>

</form>
</div>
</div>