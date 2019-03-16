<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--importing spring supplied JSP tag lib --%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">

  function update()
  {
	  document.getElementById("t1").hidden="false";
	  document.getElementById("b1").hidden="false";
	  
	  
	  
	  
  }





</script>

</head>
<body>
<script type="text/javascript">

  function update()
  {
	  document.getElementById("t1").style.display="block";
	  document.getElementById("b1").style.display="block";
	  var x=document.getElementById("drop").value;
	  document.getElementById("t1").value=x;
	  
	  
  }
  
 
  
</script>



<select id="drop" onchange="update()">
<option> default</option>
<c:forEach var="t" items="${requestScope.list}">

 <option value="${t}">${t}</option>



</c:forEach>

</select>
<form method="post">
<input type="textbox" style="display:none" name="name" id="t1">
<input type="submit" style="display:none" value="save" id="b1">
</form>
</body>
</html>