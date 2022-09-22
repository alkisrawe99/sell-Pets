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
  <h1>update</h1>
  <form action="<%= request.getContextPath() %>/update_pets" method="post">
   <table style="with: 80%">
    <tr>
     <td>id</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>image</td>
     <td><input type="file" name="image" accept="image/png, image/jpeg"></td>
    </tr>
   </table>
   <input type="submit" value="update" />
  </form>
</div>
 
</body>
</html>