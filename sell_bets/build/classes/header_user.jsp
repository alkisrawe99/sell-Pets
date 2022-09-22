<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div  style="width:80%;display: inline-block;" >

<div  style="width:20%;display: inline-block;">

<table>
  <tr>
  <form  style="width:80%;display: inline-block;"   action="<%= request.getContextPath() %>/vendor_page">
  
 <td><input type="submit" value="shows all website vendors"></td>
</form>
 <form  style="width:80%;display: inline-block;"   action="<%= request.getContextPath() %>/petdetails">
  
  <td><input type="submit" value="shows all pet details"></td>
</form>
</tr>
</table>
</div>
</div>