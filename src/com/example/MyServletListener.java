package com.example;

import javax.servlet.*;

public class MyServletListener implements ServletContextListener{

       public void contextInitialized(ServletContextEvent e){
              String breed = e.getServletContext().getInitParameter("breed");
              Dog d = new Dog(breed);
              e.getServletContext().setAttribute("dog",d);
       }
       public void contextDestroyed(ServletContextEvent e){

       }
}