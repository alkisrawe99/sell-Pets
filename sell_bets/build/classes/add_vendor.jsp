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



<div align="center">
  <h1>Add vendor</h1>
  <form action="<%= request.getContextPath() %>/add_vendor" method="post">
   <table style="with: 80%">
    <tr>
     <td> Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
 <tr>
     <td> mobile</td>
     <td><input type="text" name="mobile" /></td>
    </tr>
   
   
  
    <td>Image</td>
    <td>
    <input type="file" name="image" accept="image/png, image/jpeg">
    </td>
    </tr>
    
   
   </table>
   <input type="submit" value="Submit" />
  </form>
  
  <form    action="<%= request.getContextPath() %>/admin">

<td><input type="submit" value="back"></td>
 </tr>
</form>
 </div>








</body>
</html>