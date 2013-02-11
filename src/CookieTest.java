import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieTest extends HttpServlet{
       public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
              response.setContentType("text/html");
              String name = request.getParameter("username");
              Cookie c = new Cookie("username",name);
              c.setMaxAge(30*60);
              response.addCookie(c);

              RequestDispatcher view = request.getRequestDispatcher("result.jsp");
              view.forward(request,response);
       }
}