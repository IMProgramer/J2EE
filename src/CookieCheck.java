import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CookieCheck extends HttpServlet{
       public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              Cookie[] cooks = request.getCookies();
              for(int i=0;i<cooks.length;i++){
                      if(cooks[i].getName().equals("username")){
                           String username = cooks[i].getValue();
                           out.println("<center><h1>Hi, "+username+" !");
                           break;
                      }
              }
       }
}