/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.sql.DriverManager.println;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DatabaseManagement;

/**
 *
 * @author MinhMan
 */
@WebServlet(name = "HelloWorld", urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       PrintWriter writer = response.getWriter();
       writer.println("Hello");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       //request.getAttribute("username");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       PrintWriter writer = response.getWriter();
       DatabaseManagement dm = new DatabaseManagement();
       if (dm.checkUser(username, password)) {
           RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
           dispatcher.forward(request, response);
       } else {
           response.sendRedirect("login.jsp");
           
       }
      
       
       
       
     
    }

    

}
