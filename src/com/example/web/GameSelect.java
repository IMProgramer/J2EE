package com.example.web;
import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class GameSelect extends HttpServlet {
public void doPost(HttpServletRequest request,
HttpServletResponse response)
throws IOException, ServletException {
String c = request.getParameter("type");
Adviser be = new Adviser();
List result = be.getadv(c);
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("Game Advice<br>");
Iterator it = result.iterator();
while(it.hasNext()) {
out.print("<br><font color=RED>Play: " + it.next() + "</font>");
}
}
}