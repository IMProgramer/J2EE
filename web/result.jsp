<%@ page import="java.util.*" %>
<html>
<body>
      <h1 align="center"> Game Advise </h1>
      <br><br>
      <% 
         List l = (List)request.getAttribute("list");
         Iterator it = l.iterator();
         while(it.hasNext()){
           out.print("<br>Play: "+it.next());
         }
      %>
</body>
</html>