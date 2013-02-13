
<html>
<head><title>Yash's Page</title></head>
<%!
   String mail;
   public void jspInit(){
           mail = getServletConfig().getInitParameter("Mail");
    }
%>
<body>
<h1>
<%= mail %>
</h1>
</body>
</html>