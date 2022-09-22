<jsp:include page="Header.jsp" />


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
<title>Insert title here</title>
</head>
<body>

<table >
<tr> 
<form    action="<%= request.getContextPath() %>/add_pets">

<td><input type="submit" value="ADD pets"></td>
</form>
<form    action="<%= request.getContextPath() %>/delete">
<td>enter id for delete</td>
<td><input type="text" name="id" /></td>
<td><input type="submit" value="delete pets"></td>
</form>
<form    action="<%= request.getContextPath() %>/update_pets"> 
<td><input type="submit" value="Edit pets"></td>
</form>
</tr>
<tr> 
<form    action="<%= request.getContextPath() %>/add_vendor">
<td><input type="submit" value="ADD vendor"></td>
</form>
<form    action="<%= request.getContextPath() %>/delete_vendor">
<td>enter id for delete</td>
<td><input type="text" name="id" /></td>
<td><input type="submit" value="delete vendor"></td>
</form>
<form    action="<%= request.getContextPath() %>/update_vendor">
<td><input type="submit" value="Edit vendor"></td>
 </tr>
</form>
</table>
</body>
</html>