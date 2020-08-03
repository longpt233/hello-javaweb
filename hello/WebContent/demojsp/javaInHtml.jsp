<%@ page import="java.util.Random,java.text.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java In HTML</title>
</head>
<body>
 
  <%
      Random random = new Random();
 
      // Trả về ngẫu nhiên (0, 1 hoặc 2).
      int randomInt = random.nextInt(3);
  
 
      if (randomInt == 0) {
  %>
  
  <h1>Random value =<%=randomInt%></h1>
  
  <%
      } else if (randomInt == 1) {
  %>
  
  <h2>Random value =<%=randomInt%></h2>
 
  <%
      } else {
  %>
   <h3>Random value =<%=randomInt%></h3>
  <%
      }
  %>
 <h3>URI =<%=request.getRequestURI()%></h3>
  <a href="<%= request.getRequestURI() %>">Try Again</a>
  
</body>
</html>