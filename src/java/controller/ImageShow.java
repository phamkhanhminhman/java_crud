/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MinhMan
 */
@WebServlet(name = "ImageShow", urlPatterns = {"/ImageShow"})
public class ImageShow extends HttpServlet {

  

   
  //  @Override
  //  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      //      throws ServletException, IOException {
       
   // }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String username = (String) request.getAttribute("username");
       if ((username ==null)) {
           RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
           dispatcher.forward(request, response);
           
       }
         else {
           RequestDispatcher dispatcher = request.getRequestDispatcher("imageshow.jsp");
           dispatcher.forward(request, response);
         }

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
