package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.*;
public class GameSelect extends HttpServlet {
      public void doGet(HttpServletRequest request,
      HttpServletResponse response)throws IOException, ServletException {
          PrintWriter out = response.getWriter();
          Dog d = (Dog)getServletContext().getAttribute("dog");
          out.print("<html><body><h1>Dog object</h1><br><hr>"+
                    "<font color=gray>"+
                    "private string breed = "+
                    d.getBreed()+
                    "</font></body></html>");
      }
}